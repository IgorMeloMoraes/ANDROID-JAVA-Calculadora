package com.example.calculadora;

// Primeiro Passo: Trabalhar com o Layout
// Segundo Passo: Criar um layout dentro do drawable para background

// OBS: O app tem um erro: Não aceita fazer mais de uma operação por vez.... Para isso é necessario gerar o botão clear


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Recuperar Objetos
    private TextView txt1, txt2;
    private Button btClear, btBackspace, btPercent, btDivide, btSoma, btSubt, btMult, btIgual, btVirgula;
    private Button bt9, bt8, bt7, bt6, bt5, bt4, bt3, bt2, bt1, bt0;

    // Variaveis para os operadores e resultados
    double number1;
    double number2;
    double resultado;
    String operador;
    String resposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    // Recuperar ID
    txt1 = findViewById(R.id.txt1);
    txt2 = findViewById(R.id.txt2);
    bt0 = findViewById(R.id.bt0);
    bt1 = findViewById(R.id.bt1);
    bt2 = findViewById(R.id.bt2);
    bt3 = findViewById(R.id.bt3);
    bt4 = findViewById(R.id.bt4);
    bt5 = findViewById(R.id.bt5);
    bt6 = findViewById(R.id.bt6);
    bt7 = findViewById(R.id.bt7);
    bt8 = findViewById(R.id.bt8);
    bt9 = findViewById(R.id.bt9);
    btClear = findViewById(R.id.btClear);
    btBackspace = findViewById(R.id.btBackspace);
    btPercent = findViewById(R.id.btPercent);
    btDivide = findViewById(R.id.btDivide);
    btMult = findViewById(R.id.btMultip);
    btSubt = findViewById(R.id.btSubtra);
    btSoma = findViewById(R.id.btSoma);
    btVirgula = findViewById(R.id.btVirgula);
    btIgual = findViewById(R.id.btIgual);

        // Metodo de clique para cada botão com retorno na caixa de texto
    // Informar a variavel do botão desejado
    // Informar o metodo setOnClickListener
    // Instanciar View com metodo OnclickListener
    btClear.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                // Retornar valor para dentro das caixas de texto
            // No caso do clear ele limpa a caixa de texto, então utilizamos o valor null que é vazio para cada caixa
            txt1.setText(null);
            txt2.setText(null);
        }
    });

    bt0.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
                // Aqui criamos uma variavel String para armazenar cada valor em forma de texto e informar na caixa de texto
            // Criar uma variavel String
            // Receber a caixa de texto 2
            // Metodo: getText -> Pega o texto
            // Metodo: toString -> Transforma em String
            // Concatenar (+) com a variavel do botão selecionado
            // Metodo: getText -> Pega o texto
            // Metodo: toString -> Transforma em String
            // Retornar o valor da variavel dentro da caixa de texto 2 com o metodo setText
            String texto;
            texto = txt2.getText().toString() + bt0.getText().toString();
            txt2.setText(texto);
        }
    });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto;
                texto = txt2.getText().toString() + bt1.getText().toString();
                txt2.setText(texto);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto;
                texto = txt2.getText().toString() + bt2.getText().toString();
                txt2.setText(texto);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto;
                texto = txt2.getText().toString() + bt3.getText().toString();
                txt2.setText(texto);
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto;
                texto = txt2.getText().toString() + bt4.getText().toString();
                txt2.setText(texto);
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto;
                texto = txt2.getText().toString() + bt5.getText().toString();
                txt2.setText(texto);
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto;
                texto = txt2.getText().toString() + bt6.getText().toString();
                txt2.setText(texto);
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto;
                texto = txt2.getText().toString() + bt7.getText().toString();
                txt2.setText(texto);
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto;
                texto = txt2.getText().toString() + bt8.getText().toString();
                txt2.setText(texto);
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto;
                texto = txt2.getText().toString() + bt9.getText().toString();
                txt2.setText(texto);
            }
        });

        btVirgula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto;
                texto = txt2.getText().toString() + btVirgula.getText().toString();
                txt2.setText(texto);
            }
        });

        btBackspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Primeiro passo: Criar uma variavel String
                // Segundo passo: Criar uma condicional if
                // Terceiro passo: If recebe -> caixa de texto 2 + metodo getText + length (Tamanho da string) > 0
                // Quarto passo: Instanciar objeto StringBuilder
                // Parametro: caixa de texto 2 + getText
                // Quinto passo: variavel da instancia + deleteCharAt (Esse metodo exlcui caracteres)
                // Parametro: caixa de texto 2 + getText + length + -1 (-1 caracter)
                // Quinto passo:  Variavel Inicial recebe a variavel da instancia
                // Quinto passo: Retornar valor na caixa de texto 2 no metodo setText
                String backspace;
                if(txt2.getText().length() > 0){
                    StringBuilder stringBuilder = new StringBuilder(txt2.getText());
                    stringBuilder.deleteCharAt(txt2.getText().length() -1);
                    backspace = stringBuilder.toString();
                    txt2.setText(backspace);

                }
            }
        });


                                        // Codigos com Operadores
        // Primeiro passo: Criar metodo para clique para os botões de operação
        btPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    // Porcentagem
                // Primeiro passo: Criar uma variavel para receber tod o valor no final
                // Segundo passo: Informar variavel number1
                // Terceiro passo: Receber Double + parseDouble (Passa o valor para double) + texto 2 + getText
                // Quarto passo: Variavel inicial recebe String + format
                // Parametro: %.2f (Metodo de porcentagem com 2 pontos flutuantes) + variavel number1
                // Quinto passo: Retornar valor no Texto 1 + Passar a variavel inicial
                // Sexto passo: Zerar a caixa de texto 2 = setText("")
                // Setimo passo: Variavel operador recebe sinal de %
                String primeiro;
                number1 = Double.parseDouble((String) txt2.getText());
                primeiro = String.format("%.2f", number1);
                txt1.setText(primeiro);
                txt2.setText("");
                operador = "%";
            }
        });

        btSubt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primeiro;
                number1 = Double.parseDouble((String) txt2.getText());
                primeiro = String.format("%.2f", number1);
                txt1.setText(primeiro);
                txt2.setText("");
                operador = "-";
            }
        });

        btDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primeiro;
                number1 = Double.parseDouble((String) txt2.getText());
                primeiro = String.format("%.2f", number1);
                txt1.setText(primeiro);
                txt2.setText("");
                operador = "/";
            }
        });

        btMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primeiro;
                number1 = Double.parseDouble((String) txt2.getText());
                primeiro = String.format("%.2f", number1);
                txt1.setText(primeiro);
                txt2.setText("");
                operador = "*";
            }
        });

        btSoma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String primeiro;
                number1 = Double.parseDouble((String) txt2.getText());
                primeiro = String.format("%.2f", number1);
                txt1.setText(primeiro);
                txt2.setText("");
                operador = "+";
            }
        });


                    // IGUAL
        // Criar um metodo para clique para o botão igual
        btIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Primeiro passo: Informar a variavel number2
                // Segundo passo: Receber Double + parseDouble(String) + txt2 + getText
                // Terceiro passo: Condicional If
                // Quarto passo: if Operador == "Operador"
                // Quinto passo: informar variavel resultado RECEBE number1 + number2 (Fazer a soma dos numeros)
                // Sexto passo: Informar a variavel resposta RECEBE String + format "%.2f" + resultado
                // Setimo passo: Retornar valor na caixa de texto 2 + setText + variavel resposta
                // Oitavo passo: Retornar valor na caixa de texto 1 vazia
                // OBS: Criar uma condicional if para cada operação exixtete
                number2 = Double.parseDouble((String) txt2.getText());
                if(operador == "+"){
                    resultado = number1 + number2;
                    resposta = String.format("%.2f", resultado);
                    txt2.setText(resposta);
                    txt1.setText("");
                }

                if(operador == "-"){
                    resultado = number1 - number2;
                    resposta = String.format("%.2f", resultado);
                    txt2.setText(resposta);
                    txt1.setText("");
                }

                if(operador == "*"){
                    resultado = number1 * number2;
                    resposta = String.format("%.2f", resultado);
                    txt2.setText(resposta);
                    txt1.setText("");
                }

                if(operador == "/"){
                    resultado = number1 / number2;
                    resposta = String.format("%.2f", resultado);
                    txt2.setText(resposta);
                    txt1.setText("");
                }

                if(operador == "%"){
                    resultado = number1 % number2;
                    resposta = String.format("%.2f", resultado);
                    txt2.setText(resposta);
                    txt1.setText("");
                }
            }
        });


    }
}