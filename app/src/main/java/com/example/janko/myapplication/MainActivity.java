package com.example.janko.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setContentView(R.layout.activity_main);
        Log.v(TAG, "Nahajam se v onCreate funkciji");

        Button zdravo = (Button) findViewById(R.id.button);
        zdravo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Klik na gumb zdravo ");
                TextView text = (TextView) findViewById(R.id.textView);
                text.setText("Deluje");
            }
        });

        Button second = (Button) findViewById(R.id.button2);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "pojdi na drugo stran ");
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);

            }
        });

    }
}
