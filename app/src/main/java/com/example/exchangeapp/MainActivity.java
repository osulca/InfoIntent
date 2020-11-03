package com.example.exchangeapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText etUsuario, etPassword;
final static String USER = "Usuario";
final static String PASS = "password";

EditText etNro1, etNro2;
TextView tvRespuesta;

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

    public void calcular(View view) {
        etNro1 = findViewById(R.id.etnro1);
        etNro2 = findViewById(R.id.etnro2);
        int nro1 = Integer.parseInt(etNro1.getText().toString());
        int nro2 = Integer.parseInt(etNro2.getText().toString());

        Intent intentCalcular = new Intent(this, MainActivity2.class);
        intentCalcular.putExtra("nro1", nro1);
        intentCalcular.putExtra("nro2", nro2);
        startActivityForResult(intentCalcular, 1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            if(resultCode == Activity.RESULT_OK){
                tvRespuesta = findViewById(R.id.tvrespuesta);
                tvRespuesta.setText("La suma es: "+ data.getIntExtra("respuesta", 80));
            }
        }
    }
}