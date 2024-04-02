package com.example.kalkulatorhybrid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText password, email;
    Button tombol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = findViewById(R.id.emailInput);
        password = findViewById(R.id.passwordInput);
        tombol = findViewById(R.id.loginButton);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Email = email.getText().toString();
                String Password = password.getText().toString();

                if (Email.equals("admin") && Password.equals("admin123")){
                    Intent intent = new Intent(Login.this, MainActivity.class);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(Login.this, "Password atau Email salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
