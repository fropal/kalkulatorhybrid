package com.example.kalkulatorhybrid.Activity2D;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kalkulatorhybrid.R;

public class persegipanjang extends AppCompatActivity {

    EditText panjang, lebar;
    Button button, kembali;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegipanjang);

        panjang = findViewById(R.id.panjang);
        lebar = findViewById(R.id.lebar);
        button = findViewById(R.id.button);
        hasil = findViewById(R.id.TVhasil);
        kembali = findViewById(R.id.kembali);

        if (lebar.getText().toString() == null && panjang.getText().toString() == null ){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double hsl = 0;
                double p = Float.parseFloat(panjang.getText().toString());
                float l = Float.parseFloat(lebar.getText().toString());
                hsl  =p * l;
                hasil.setText(String.valueOf("Luas Permukaan Persegi Panjang : "+hsl+"CM²"));
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