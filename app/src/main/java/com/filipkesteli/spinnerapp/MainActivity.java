package com.filipkesteli.spinnerapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String PARAMETER_NAME = "com.filipkesteli.spinnerapp.INFORMATION";

    private EditText etPostalNumber;
    private EditText etTextMultiLine;
    private EditText etTime;
    private EditText etDate;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initWidgets();
        setupListeners();
    }


    private void initWidgets() {
        etPostalNumber = (EditText) findViewById(R.id.etPostalAddress);
        etTextMultiLine = (EditText) findViewById(R.id.etTextMultiLine);
        etTime = (EditText) findViewById(R.id.etTime);
        etDate = (EditText) findViewById(R.id.etDate);
        btnSend = (Button) findViewById(R.id.btnSend);
    }

    private void setupListeners() {
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iSend();
            }
        });
    }

    private void iSend() {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(MainActivity.PARAMETER_NAME, "POSTAL ADDRESS: "
                + etPostalNumber.getText().toString()
                + "\nTEXT MULTILINE: "
                + etTextMultiLine.getText().toString()
                + "\nTIME: "
                + etTime.getText().toString()
                + "\nDATE: "
                + etDate.getText().toString());
        startActivity(intent);
    }
}
