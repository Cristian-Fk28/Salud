package com.example.salud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CALCU(View view) {
        Intent iCALCU = new Intent(MainActivity.this,CALCU.class);
        startActivity(iCALCU);
    }

    public void SALU(View view) {
        Intent iSALU = new Intent(MainActivity.this,SALU.class);
        startActivity(iSALU);
    }
    public void CalculadoraIMC(View view){
        Intent calculadoraIMC = new Intent(MainActivity.this, CalculadoraIMC.class);
        startActivity(calculadoraIMC);

    }

    public void salir(View view) {
        finish();
    }
}