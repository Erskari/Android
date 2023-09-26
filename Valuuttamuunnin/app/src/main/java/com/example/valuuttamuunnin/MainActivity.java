package com.example.valuuttamuunnin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private float conversionRate = 1.0f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();

        String sourceCurrencyType = (intent.hasExtra("SOURCE_CURRENCY_TYPE"))
                ? intent.getStringExtra("SOURCE_CURRENCY_TYPE")
                : "EUR";

        String destinationCurrencyType = (intent.hasExtra("DESTINATION_CURRENCY_TYPE"))
                ? intent.getStringExtra("DESTINATION_CURRENCY_TYPE")
                : "USD";

        conversionRate = intent.getFloatExtra("CONVERSION_RATE", 1.0f);

        TextView homeCurrencyTextView = findViewById(R.id.homeCurrencyTextView);
        TextView destinationCurrencyTextView = findViewById(R.id.destinationCurrencyTextView);

        homeCurrencyTextView.setText(sourceCurrencyType);
        destinationCurrencyTextView.setText(destinationCurrencyType);
    }

    public void openSettings(View view) {
        // Muokkaa tekstiä sivulla
        //TextView homeCurrencyTextView = findViewById(R.id.homeCurrencyTextView);
        //homeCurrencyTextView.setText("Hello");
        // Avaa asetukset ja välitä sinne tietoa

        TextView homeCurrencyTextView = findViewById(R.id.homeCurrencyTextView);
        TextView destinationCurrencyTextView = findViewById(R.id.destinationCurrencyTextView);

        String sourceCurrencyInput = homeCurrencyTextView.getText().toString();
        String destinationCurrencyInput = destinationCurrencyTextView.getText().toString();

        Intent intent = new Intent(this, SettingsActivity.class);
        intent.putExtra( "SOURCE_CURRENCY_TYPE", sourceCurrencyInput);
        intent.putExtra("DESTINATION_CURRENCY_TYPE", destinationCurrencyInput);
        intent.putExtra("CONVERSION_RATE", conversionRate);
        startActivity( intent );

    }

    public void convertCurrency(View view) {
        EditText homeCurrencyEditText = findViewById(R.id.homeCurrencyEditText);
        EditText destinationCurrencyEditText = findViewById(R.id.destinationCurrencyEditText);

        String homeCurrencyInput = homeCurrencyEditText.getText().toString();
        float homeCurrencyAmount = Float.parseFloat(homeCurrencyInput);

        float destinationCurrency = homeCurrencyAmount * conversionRate;

        destinationCurrencyEditText.setText(String.valueOf(destinationCurrency));
    }

    public void swapCurrencies(View view) {
        TextView homeCurrencyTextView = findViewById(R.id.homeCurrencyTextView);
        TextView destinationCurrencyTextView = findViewById(R.id.destinationCurrencyTextView);
        EditText homeCurrencyEditText = findViewById(R.id.homeCurrencyEditText);
        EditText destinationCurrencyEditText = findViewById(R.id.destinationCurrencyEditText);

        String homeCurrencyOriginal = homeCurrencyTextView.getText().toString();
        String destinationCurrencyOriginal = destinationCurrencyTextView.getText().toString();
        float homeCurrencyValue = Float.parseFloat(homeCurrencyEditText.getText().toString());
        float destinationCurrencyValue = Float.parseFloat(destinationCurrencyEditText.getText().toString());

        homeCurrencyTextView.setText(destinationCurrencyOriginal);
        destinationCurrencyTextView.setText(homeCurrencyOriginal);
        homeCurrencyEditText.setText(String.valueOf(destinationCurrencyValue));
        destinationCurrencyEditText.setText(String.valueOf(homeCurrencyValue));
    }
}