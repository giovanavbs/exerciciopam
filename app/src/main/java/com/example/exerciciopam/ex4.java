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

        num1 = (EditText) findViewById(R.id.num1);
        btncalc = (Button) findViewById(R.id.btncalc);
        tvresult = (TextView) findViewById(R.id.tvresult);
        btnex2 = (Button) findViewById(R.id.btnex2);

        btncalc.setOnClickListener(view -> {
                    entrada = Integer.parseInt(String.valueOf(num1.getText()));

                    if (entrada <= 18 && entrada >= 0) {
                        horario = entrada + 6;
                        tvresult.setText(String.valueOf(horario));
                    } else if (entrada == 19) {
                        tvresult.setText(getText(R.string.umam));
                    } else if (entrada == 20) {
                        tvresult.setText(getText(R.string.doisam));
                    } else if (entrada == 21) {
                        tvresult.setText(getText(R.string.tresam));
                    } else if (entrada == 22) {
                        tvresult.setText(getText(R.string.quatroam));
                    } else if (entrada == 23) {
                        tvresult.setText(getText(R.string.cincoam));
                    } else if (entrada == 24) {
                        tvresult.setText(getText(R.string.seisam));
                    }
                });


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