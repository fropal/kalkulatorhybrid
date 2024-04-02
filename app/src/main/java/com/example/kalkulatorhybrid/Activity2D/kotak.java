package com.example.kalkulatorhybrid.Activity2D;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kalkulatorhybrid.R;

public class kotak extends AppCompatActivity {

    EditText sisi;
    Button button, kembali;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotak);

        sisi = findViewById(R.id.sisi);
        button = findViewById(R.id.button);
        hasil = findViewById(R.id.TVhasil);
        kembali = findViewById(R.id.kembali);

        if (sisi.getText().toString() == null ){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double hsl = 0;
                float S = Float.parseFloat(sisi.getText().toString());
                hsl = S * S;
                hasil.setText(String.valueOf("Luas Permukaan Kotak : "+hsl+"CM²"));

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