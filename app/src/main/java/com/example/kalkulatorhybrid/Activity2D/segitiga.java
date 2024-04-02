package com.example.kalkulatorhybrid.Activity2D;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kalkulatorhybrid.R;

public class segitiga extends AppCompatActivity {

    EditText tinggi, alas;
    Button button, kembali;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        tinggi = findViewById(R.id.tinggi);
        alas = findViewById(R.id.alas);
        button = findViewById(R.id.button);
        hasil = findViewById(R.id.TVhasil);
        kembali = findViewById(R.id.kembali);

        if (alas.getText().toString() == null && tinggi.getText().toString() == null){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double hsl = 0;
                double t = Float.parseFloat(tinggi.getText().toString());
                double a = Float.parseFloat(alas.getText().toString());
                hsl  = 0.5 * t * a;
                hasil.setText(String.valueOf("Luas Permukaan segitiga : "+hsl+"CM²"));
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