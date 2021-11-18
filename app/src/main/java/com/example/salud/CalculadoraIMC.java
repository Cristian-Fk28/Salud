package com.example.salud;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

public class CalculadoraIMC extends AppCompatActivity {
    EditText txtPeso, txtAltura;
    TextView lblResultado,lblResultado2, lblResultado3;
    RadioButton radioButton1, radioButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora_imc);

    }

    public void btnCalcularOnClick(View view){

        lblResultado = (TextView)findViewById(R.id.lblResultado);
        lblResultado2 = (TextView)findViewById(R.id.lblResultado2);
        lblResultado3 = (TextView)findViewById(R.id.lblResultado3);
         txtPeso = (EditText) findViewById(R.id.txtPeso);
         txtAltura = (EditText) findViewById(R.id.txtAltura);
         radioButton1=(RadioButton) findViewById(R.id.radioButton1);
        radioButton2=(RadioButton) findViewById(R.id.radioButton2);

        int peso = Integer.parseInt(txtPeso.getText().toString());
        float altura = Float.parseFloat(txtAltura.getText().toString());

        float resultado = peso / (altura * altura);
        lblResultado2.setText("Tu IMC Es: "+resultado);
        if(radioButton2.isChecked()== true)
            lblResultado3.setText("Eres Hombre");
        else
            lblResultado3.setText("No tienes genero");

        if(radioButton1.isChecked()== true)
            lblResultado3.setText("Eres Mujer");
        else
            lblResultado3.setText("No tienes genero");


        if(resultado < 19){
            //abaixo
            lblResultado.setText("Tu Peso es Extremadamente Bajo Comer con más frecuencia.\n" +
                    "Escoger comidas ricas en nutrientes.\n" +
                    "Tomar batidos y licuados de frutas.\n" +
                    "Elegir productos lácteos enteros.\n" +
                    "Cocinar salsas y sopas con leche en lugar de agua.");
        }
        else if(resultado > 32){
            //obeso
            lblResultado.setText("Tu Peso es Extremadamente Alto Coma un desayuno alto en proteínas\n" +
                    "Evite las bebidas azucaradas y los jugos de frutas\n" +
                    "Beba agua media hora antes de las comidas\n" +
                    "Elija alimentos saludables que lo ayuden con la pérdida de peso\n" +
                    "Coma fibra soluble\n");
        }
        else{
            //ok
            lblResultado.setText("Tu Peso es Normal Ejercicio físico. La actividad física regular " +
                    "quema calorías y genera tejido muscular. \n" +
                    "Reduce el tiempo ante la pantalla. \n" +
                    "Ten cuidado con las porciones distorsionadas. \n" +
                    "Come 5 porciones de frutas y verduras por día. \n");
        }

    }


    public void btnLimpiar(View view) {

        txtPeso.setText("");
        txtAltura.setText("");
        lblResultado.setText("");
        lblResultado2.setText("");
        radioButton1.setChecked(false);
        radioButton2.setChecked(false);
        lblResultado3.setText("");
    }
}
