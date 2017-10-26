package com.example.ficheros;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnMemInterna,
        btnMemExterna,
        btnLeerFicheros,
        btnCodificacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMemInterna = (Button) findViewById(R.id.btnMemInterna);
        btnMemExterna = (Button) findViewById(R.id.btnMemExterna);
        btnCodificacion = (Button) findViewById(R.id.btnCodificacion);
        btnLeerFicheros = (Button) findViewById(R.id.btnLeerFicheros);
        btnMemExterna.setOnClickListener(this);
        btnMemInterna.setOnClickListener(this);
        btnLeerFicheros.setOnClickListener(this);
        btnCodificacion.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        if (view == btnMemExterna){
            intent = new Intent(this, EscribirExterna.class);
            startActivity(intent);
        }
        if (view == btnMemInterna){
            intent = new Intent(this, EscribirInterna.class);
            startActivity(intent);
        }
        if (view == btnLeerFicheros){
            intent = new Intent(this, LeerFicheros.class);
            startActivity(intent);
        }
        if (view == btnCodificacion){
            intent = new Intent(this, Codificacion.class);
            startActivity(intent);
        }
    }
}
