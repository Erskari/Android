package com.example.valuuttamuunnin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        // Luetaan intent
        Intent intent = getIntent();
        String sourceCurrency = intent.getStringExtra("SOURCE_CURRENCY_TYPE");
        String destinationCurrency = intent.getStringExtra("DESTINATION_CURRENCY_TYPE");
        float conversionRate = intent.getFloatExtra("CONVERSION_RATE", 1.0f);
        // Laitetaan intentin tiedot näytölle
        EditText sourceCurrencyTypeEditText = findViewById(R.id.sourceCurrencyTypeEditText);
        EditText destinationCurrencyTypeEditText = findViewById(R.id.destinationCurrencyTypeEditText);
        EditText conversionRateEditText = findViewById(R.id.conversionRateEditText);

        sourceCurrencyTypeEditText.setText(sourceCurrency);
        destinationCurrencyTypeEditText.setText(destinationCurrency);
        conversionRateEditText.setText(Float.toString(conversionRate));
    }

    public void backToConverter(View view) {
        Intent intent = new Intent(this, MainActivity.class);

        EditText conversionRateEditText = findViewById(R.id.conversionRateEditText);
        EditText sourceCurrencyTypeEditText = findViewById(R.id.sourceCurrencyTypeEditText);
        EditText destinationCurrencyEditText = findViewById(R.id.destinationCurrencyTypeEditText);

        float conversionRate = Float.parseFloat(conversionRateEditText.getText().toString());
        String sourceCurrencyType = sourceCurrencyTypeEditText.getText().toString();
        String destinationCurrencyType = destinationCurrencyEditText.getText().toString();

        intent.putExtra( "SOURCE_CURRENCY_TYPE", sourceCurrencyType);
        intent.putExtra("DESTINATION_CURRENCY_TYPE", destinationCurrencyType);
        intent.putExtra("CONVERSION_RATE", conversionRate);
        startActivity( intent );
    }
}