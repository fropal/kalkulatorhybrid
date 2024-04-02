package com.example.kalkulatorhybrid.Activity2D;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kalkulatorhybrid.R;

public class lingkaran extends AppCompatActivity {

    EditText jari;
    Button button, kembali;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        jari = findViewById(R.id.jari);
        button = findViewById(R.id.button);
        hasil = findViewById(R.id.TVhasil);
        kembali = findViewById(R.id.kembali);

        if (jari.getText().toString() == null ){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double hsl = 0;
                float r = Float.parseFloat(jari.getText().toString());
                double phi = 3.14;
                hsl = phi * r * r;
                hasil.setText(String.valueOf("Luas Permukaan Lingkaran : "+hsl+"CM²"));

            }
        });
        }
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}