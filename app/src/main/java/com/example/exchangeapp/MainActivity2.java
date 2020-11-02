package com.example.exchangeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tvRespuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    // con bundle
        Bundle bundle = getIntent().getExtras();
    // sin bundle
        String altusuario = getIntent().getExtras().getString(MainActivity.USER);

        String usuario = bundle.getString("Usuario");
        String password = bundle.getString(MainActivity.PASS);

        String userDB, passDB, mensaje;
        userDB = "Omar";
        passDB = "123";

        if(altusuario.equals(userDB) && password.equals(passDB)){
            mensaje = "Acceso";
        }else{
            mensaje = "Error";
        }

        tvRespuesta = findViewById(R.id.tvResultado);
        tvRespuesta.setText(mensaje);
    }
}