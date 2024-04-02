package com.example.kalkulatorhybrid.Activity3D;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kalkulatorhybrid.R;

public class Activity_balok extends AppCompatActivity {

    EditText lebar, tinggi, panjang;
    Button button, kembali;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balok);

        lebar = findViewById(R.id.lebar);
        panjang = findViewById(R.id.panjang);
        tinggi = findViewById(R.id.tinggi);
        button = findViewById(R.id.button);
        hasil = findViewById(R.id.TVhasil);
        kembali = findViewById(R.id.kembali);

        if (lebar.getText().toString() == null && panjang.getText().toString() == null && tinggi.getText().toString() == null){
            button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double hsl = 0;
                float pj = Float.parseFloat(panjang.getText().toString());
                float lb = Float.parseFloat(lebar.getText().toString());
                float tg = Float.parseFloat(tinggi.getText().toString());
                hsl  = 2 * ((pj*lb) + (lb*tg) + (pj*tg));
                hasil.setText(String.valueOf("Luas Permukaan Balok : "+hsl+"CM²"));
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