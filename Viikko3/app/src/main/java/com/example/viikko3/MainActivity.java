package com.example.viikko3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String message = "Click count: ";
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null){
            counter = savedInstanceState.getInt("COUNTER_VALUE", 0);
        }

        TextView helloText = findViewById(R.id.counterTextView);
        helloText.setText(message + counter);

        Log.d("CREATE", "Activity onCreate");
    }

    @Override
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);

        bundle.putInt("COUNTER_VALUE", counter);

    }

    @Override
    protected void onRestoreInstanceState(Bundle bundle){
        super.onRestoreInstanceState(bundle);

    }

    public void buttonOnClick(View view){
        counter++;
        TextView helloText = findViewById(R.id.counterTextView);

        helloText.setText(message + counter);
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("PAUSE", "Activity onPause");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("RESUME", "Activity onResume");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("DESTROY", "Activity onDestroy");
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.d("START", "Activity onStart");
    }
}