package com.example.kalkulatorhybrid.Activity3D;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kalkulatorhybrid.R;

public class Activity_tabung extends AppCompatActivity {

    EditText diameter, tinggi;
    Button button, kembali;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabung);

        diameter = findViewById(R.id.diameter);
        tinggi = findViewById(R.id.tinggi);
        button = findViewById(R.id.button);
        hasil = findViewById(R.id.TVhasil);
        kembali = findViewById(R.id.kembali);

        if (diameter.getText().toString() == null && tinggi.getText().toString() == null) {
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    double hsl = 0;
                    double di = Float.parseFloat(diameter.getText().toString());
                    float tg = Float.parseFloat(tinggi.getText().toString());
                    double phi = 3.14;
                    di = di / 2;
                    hsl = 2 * phi * di * (di + tg);
                    hasil.setText(String.valueOf("Luas Permukaan Tabung : " + hsl + "CM²"));
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