package com.example.exchangeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tvRespuesta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
/*    // con bundle
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
        */

        int nuevoNro1 = getIntent().getExtras().getInt("nro1");
        int nuevoNro2 = getIntent().getExtras().getInt("nro2");

        int suma = nuevoNro1 + nuevoNro2;

        Intent intentRespuesta = new Intent();
        intentRespuesta.putExtra("respuesta", suma);
        setResult(Activity.RESULT_OK, intentRespuesta);
        finish();
    }
}