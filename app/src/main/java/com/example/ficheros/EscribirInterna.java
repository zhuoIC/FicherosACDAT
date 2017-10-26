package com.example.ficheros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class EscribirInterna extends AppCompatActivity implements View.OnClickListener{
    EditText edtOp1, edtOp2;
    TextView txvMostrarResultado, txvMostrarPropiedades;
    Button btnSuma;
    public final static String NOMBREFICHERO = "resultado.txt";
    public final static String CODIFICACION = "UTF-8";
    Memoria miMemoria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escribir_interna);
        edtOp1 = (EditText) findViewById(R.id.edtOp1);
        edtOp2 = (EditText) findViewById(R.id.edtOp2);
        txvMostrarResultado = (TextView) findViewById(R.id.txvMostrarResultado);
        txvMostrarPropiedades = (TextView) findViewById(R.id.txvMostrarPropiedades);
        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnSuma.setOnClickListener(this);
        miMemoria = new Memoria(getApplicationContext());
    }

    @Override
    public void onClick(View view) {
        if(view == btnSuma){
            String texto = "0";
            try {
                texto = String.valueOf(
                        Integer.parseInt(edtOp1.getText().toString())
                                + Integer.parseInt(edtOp2.getText().toString())
                );
            }
            catch (NumberFormatException e){
                Log.e("Error", e.getMessage());
                Toast.makeText(getApplicationContext(), "Error: " + e.getMessage(), Toast.LENGTH_SHORT);
            }
            txvMostrarResultado.setText(texto);
            if(miMemoria.escribirInterna(NOMBREFICHERO, texto, false, CODIFICACION))
                txvMostrarPropiedades.setText(miMemoria.mostrarPropiedadesInterna(NOMBREFICHERO));
            else
                txvMostrarPropiedades.setText("Error al escribir en el fichero");
        }
    }
}
