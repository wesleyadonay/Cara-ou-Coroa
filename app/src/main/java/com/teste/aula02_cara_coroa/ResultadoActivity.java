package com.teste.aula02_cara_coroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ResultadoActivity extends AppCompatActivity {
    private ImageView imageResultado;
    private  ImageView imageVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imageResultado = findViewById(R.id.imageResultado);
        imageVoltar = findViewById(R.id.imageVoltar);

        //recuperar dados

        Bundle dados = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0){//cara
            imageResultado.setImageResource(R.drawable.moeda_cara);
        }else{//coroa
            imageResultado.setImageResource(R.drawable.moeda_coroa);
        }

        imageVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentVoltar = new Intent(getApplicationContext(), MainActivity.class);

                startActivity(intentVoltar);
            }
        });

    }
}