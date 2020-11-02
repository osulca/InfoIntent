package com.example.exchangeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText etUsuario, etPassword;
final static String USER = "Usuario";
final static String PASS = "password";
Button btLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(View view) {
        etUsuario = findViewById(R.id.usuario);
        etPassword = findViewById(R.id.password);
        String usuario = etUsuario.getText().toString();
        String password = etPassword.getText().toString();

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("Usuario", usuario);
        intent.putExtra(PASS, password);
        startActivity(intent);
    }
}