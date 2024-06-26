package com.example.kalkulatorhybrid.Activity3D;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kalkulatorhybrid.R;

public class Activity_bola extends AppCompatActivity {

    EditText diameter;
    Button button, kembali;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bola);

        diameter = findViewById(R.id.diameter);
        button = findViewById(R.id.button);
        hasil = findViewById(R.id.TVhasil);
        kembali = findViewById(R.id.kembali);

        if (diameter.getText().toString() == null){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double hsl = 0;
                double di = Float.parseFloat(diameter.getText().toString());
                di = di /2;
                double phi = 3.14;
                hsl = 4 * phi * di * di;
                hasil.setText(String.valueOf("Luas Permukaan Bola : "+hsl+"CM²"));

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