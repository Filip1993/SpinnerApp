package com.filipkesteli.spinnerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText etSviPodaci;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        initWidgets();
        handleIntents();
    }


    private void initWidgets() {
        etSviPodaci = (EditText) findViewById(R.id.etSviPodaci);
    }

    private void handleIntents() {
        // getIntent -> Return the intent that started this activity.
        Intent intent = getIntent();
        intent.getExtras();
        if (intent.hasExtra(MainActivity.PARAMETER_NAME)) {
            etSviPodaci.setText(intent.getStringExtra(MainActivity.PARAMETER_NAME));
        }
    }
}
