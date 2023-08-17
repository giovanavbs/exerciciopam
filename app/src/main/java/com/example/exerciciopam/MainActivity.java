package com.example.exerciciopam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1;

    EditText num2;

    EditText num3;

    TextView tvresult;

    Button btncalc;

    int n1;
    int n2;
    int n3;
    int media;
    TextView result;
    Button btnex1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        num3 = (EditText) findViewById(R.id.num3);
        btncalc = (Button) findViewById(R.id.btncalc);
        result = (TextView) findViewById(R.id.tvresult)
        btnex1 = (Button) findViewById(R.id.btnex1);


        btncalc.setOnClickListener(view -> {
            n1 =Integer.parseInt(String.valueOf(num1.getText()));
            n2 = Integer.parseInt(String.valueOf(num2.getText()));
            n3 = Integer.parseInt(String.valueOf(num3.getText()));

            if (n1 < 0 && n2 > 0 && n3 > 0) {
                media = (n2 + n3) / 2;
                result.setText(String.valueOf(media));
            }
            else if (n2 < 0 && n1 > 0 && n3 > 0) {
                media = (n1 + n3) / 2;
                result.setText(String.valueOf(media));
            }
            else if (n3 < 0 && n1 > 0 && n2 > 0) {
                media = (n1 + n2) / 2;
                result.setText(String.valueOf(media));
            }
            else if (n1 < 0 && n2 < 0 && n3 > 0) {
                media = n3;
                result.setText(String.valueOf(media));
            }
            else if (n1 < 0 && n2 > 0 && n3 < 0) {
                media = n2;
                result.setText(String.valueOf(media));
            }
            else if (n1 > 0 && n2 < 0 && n3 < 0) {
                media = n1;
                result.setText(String.valueOf(media));
            }
            else if (n1 > 0 && n2 > 0 && n3 > 0) {
                media = (n1 + n2 + n3) / 3;
                result.setText(String.valueOf(media));
            }
            else if (n1 < 0 && n2 < 0 && n3 < 0) {
                media = 0;
                result.setText(String.valueOf(media));
            }
        });

        btnex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);

                //Intent intent = new Intent( this, ex4.class); (n funcionou por motivo desconhecido)
                startActivity(intent);
            }
        });
    }
}
