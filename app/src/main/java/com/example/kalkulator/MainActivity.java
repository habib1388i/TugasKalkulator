package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText angkaSatu, angkaDua;
    TextView hasil;
    Button btnKali, btnBagi, btnTambah, btnKurang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angkaSatu = (EditText)findViewById(R.id.angka1);
        angkaDua = (EditText)findViewById(R.id.angka2);
        hasil = (TextView)findViewById(R.id.labelJawaban);

        btnKali = (Button)findViewById(R.id.btnKali);
        btnBagi = (Button)findViewById(R.id.btnBagi);
        btnTambah = (Button)findViewById(R.id.btnTambah);
        btnKurang = (Button)findViewById(R.id.btnKurang);
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(String.valueOf(Integer.valueOf(angkaSatu.getText().toString()) * Integer.valueOf(angkaDua.getText().toString())));
            }
        });

        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hasil.setText(String.valueOf(Integer.valueOf(angkaSatu.getText().toString()) / Integer.valueOf(angkaDua.getText().toString())));

            }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(String.valueOf(Integer.valueOf(angkaSatu.getText().toString()) - Integer.valueOf(angkaDua.getText().toString())));
            }
        });

        btnTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText(String.valueOf(Integer.valueOf(angkaSatu.getText().toString()) + Integer.valueOf(angkaDua.getText().toString())));
            }
        });

    }
}

