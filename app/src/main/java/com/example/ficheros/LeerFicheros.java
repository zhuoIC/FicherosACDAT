package com.example.ficheros;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LeerFicheros extends AppCompatActivity implements View.OnClickListener{
    EditText operando1, operando2, operando3, operando4;
    TextView resultado;
    Button suma;
    public static final String NUMERO = "numero.txt";
    public static final String VALOR = "valor.txt";
    public static final String DATO = "dato.txt";
    public static final String DATO_SD = "dato_sd.txt";
    public static final String OPERACIONES = "operaciones.txt";
    public static final String CODIFICACION = "UTF-8";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leer_ficheros);
        iniciar();
    }

    private void iniciar() {
        Resultado resultado;
        operando1 = (EditText) findViewById(R.id.editText);
        operando2 = (EditText) findViewById(R.id.editText2);
        operando3 = (EditText) findViewById(R.id.editText3);
        operando4 = (EditText) findViewById(R.id.editText4);
        suma = (Button) findViewById(R.id.button);
        suma.setOnClickListener(this);
        resultado = (TextView) findViewById(R.id.textView);
    }

    @Override
    public void onClick(View view) {

    }
}
