package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnTop = (Button) findViewById(R.id.buttonTop);
        btnTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button topButton = findViewById(R.id.buttonTop);
                topButton.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });

        Button btnLeft = (Button) findViewById(R.id.buttonLeft);
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button topLeft = findViewById(R.id.buttonLeft);
                topLeft.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });

        Button btnRight = (Button) findViewById(R.id.buttonRight);
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button topRight = findViewById(R.id.buttonRight);
                topRight.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });

        Button btnBottom = (Button) findViewById(R.id.buttonBottom);
        btnBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button bottomButton = findViewById(R.id.buttonBottom);
                bottomButton.setBackgroundColor(getResources().getColor(R.color.yellow));
            }
        });
    }
}
