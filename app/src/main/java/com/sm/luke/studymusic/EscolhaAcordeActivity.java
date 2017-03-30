package com.sm.luke.studymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EscolhaAcordeActivity extends AppCompatActivity {

    // Aqui defino variáveis...
    private Button btnMaiores, btnMenores;
    Bundle parametros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escolha_acorde);
    }

    // Esse método é executado toda vez que é chamada a view.
    @Override
    protected void onResume(){
        super.onResume();

        btnMaiores = (Button) findViewById(R.id.btnMaiores);
        btnMaiores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaiPraTelaDosAcordes = new Intent(EscolhaAcordeActivity.this, NotasActivity.class);

                // Aqui preparo a informação pra ser enviada pra outra tela.
                parametros = new Bundle();
                // Aqui envio o parâmetro tipo chave/valor.
                parametros.putString("valor", "maiores");
                vaiPraTelaDosAcordes.putExtras(parametros);

                // Inicio a view passando a intenção.
                startActivity(vaiPraTelaDosAcordes);
            }
        });

        btnMenores = (Button) findViewById(R.id.btnMenores);
        btnMenores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vaiPraTelaDosAcordes = new Intent(EscolhaAcordeActivity.this, NotasActivity.class);
                parametros = new Bundle();
                parametros.putString("valor", "menores");
                vaiPraTelaDosAcordes.putExtras(parametros);
                startActivity(vaiPraTelaDosAcordes);
            }
        });
    }
}
