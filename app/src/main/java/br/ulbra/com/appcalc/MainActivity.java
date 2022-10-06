package br.ulbra.com.appcalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edtValor1, edtValor2;
    Button btnSomar, btnSubtracao, btnMultiplicar, btnDividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtValor1 = findViewById(R.id.edtV1);
        edtValor2 = findViewById(R.id.edtV2);
        btnSomar = findViewById(R.id.btnSomar);
        btnSubtracao = findViewById(R.id.btnSub);
        btnMultiplicar = findViewById(R.id.btnMulti);
        btnDividir = findViewById(R.id.btnDiv);

        btnSomar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double valor1, valor2, soma;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                soma = valor1 + valor2;
                Toast.makeText(MainActivity.this,
                        "Soma: " + soma, Toast.LENGTH_LONG).show();
            }
        });
        btnSubtracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, subtracao;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                subtracao = valor1 - valor2;
                Toast.makeText(MainActivity.this,
                        "Subtração: " + subtracao, Toast.LENGTH_LONG).show();
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, multiplicacao;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                multiplicacao = valor1 * valor2;
                Toast.makeText(MainActivity.this,
                        "Multiplicação:: " + multiplicacao, Toast.LENGTH_LONG).show();
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1, valor2, divisão;
                valor1 = Double.parseDouble(edtValor1.getText().toString());
                valor2 = Double.parseDouble(edtValor2.getText().toString());
                divisão = valor1 / valor2;
                if (valor2 == 0) {
                    Toast.makeText(MainActivity.this, "NÃO SE DIVIDE POR 0", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "divisão: " + divisão, Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}