package com.sm.luke.studymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Aqui recupero da view o componente botão.
        btnEntrar = (Button) findViewById(R.id.btnEntrar);

        // Função de chamada do botão.
        btnEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Aqui defino a 'intenção do click do botão.'
                Intent irParaProximaTela = new Intent(MainActivity.this, EscolhaAcordeActivity.class);
                startActivity(irParaProximaTela);
                finish();
            }
        });
    }
}
