package com.example.exerciciopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ex4 extends AppCompatActivity {

    EditText num1;

    TextView tvresult;

    Button btncalc;

    Button btnex2;
    int entrada;
    int horario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ex4);
      
        if(entrada <= 24 && entrada >= 0) {
            if (entrada <= 18) {
                horario = entrada + 6;
                tvresult.setText(+entrada);
            }
            if (entrada == 19) {
                tvresult.setText("1 da manhã");
            }
            if (entrada == 20) {
                tvresult.setText("2 da manhã");
            }
            if (entrada == 21) {
                tvresult.setText("3 da manhã");
            }
            if (entrada == 22) {
                tvresult.setText("3 da manhã");
            }
            if (entrada == 23) {
                tvresult.setText("4 da manhã");
            }
            if (entrada == 24) {
                tvresult.setText("5 da manhã");
            }
            else{
                tvresult.setText("horario invalido, insira um valor entre 0-24h!");
            }
        }

        btnex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);

                //Intent intent = new Intent( this, MainActivity.class); (n funcionou por motivo desconhecido de novo)
                startActivity(intent);
            }
        });
    }
}
