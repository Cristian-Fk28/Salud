package com.example.salud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class SALU extends AppCompatActivity {
    EditText tnom, tal, tpeso;
    Button bcalc, blim;
    RadioButton rVa, rMu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salu);
        tnom = (EditText) findViewById(R.id.tnom1);
        tpeso = (EditText) findViewById(R.id.tpeso);
        tal = (EditText) findViewById(R.id.tpeso);
        bcalc = (Button) findViewById(R.id.bcalc);
        blim = (Button) findViewById(R.id.blim);
        rMu = (RadioButton) findViewById(R.id.rMu);
        rVa = (RadioButton) findViewById(R.id.rVa);

        blim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Limpiar();
            }
        });

        bcalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CalcularIMC();
            }
        });
    }
    private void Limpiar ()
    {
        tnom.setText("");
        tal.setText("");
        tpeso.setText("");
    }
    private void CalcularIMC ()
    {
        String nombre = tnom.getText().toString();
        Double altura = Double.valueOf(tal.getText().toString());
        Double peso = Double.valueOf(tpeso.getText().toString());
        double IMC = peso / Math.pow(altura, 2);

        Toast.makeText(this, "Tu IMC es :" + String.format("%.2f", IMC) + MensajeIMC(IMC), Toast.LENGTH_LONG).show() ;
    if(rVa.isChecked()== true)
        Toast.makeText(this, "Eres Hombre", Toast.LENGTH_SHORT).show();
    else
        Toast.makeText(this, "No tienes genero ps", Toast.LENGTH_SHORT).show();
    }
    private String MensajeIMC (double IMC)
    {
        String mensaje = "";
        if (IMC < 16)
            mensaje ="Peso Extremadamente Grave";
        else if (IMC >= 16 & IMC < 17)
            mensaje = "Peso Bajo Grave";
        else
            mensaje = "Otro tipo de IMC";
        return mensaje;
    }



}