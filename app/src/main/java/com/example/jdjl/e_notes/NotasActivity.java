package com.example.jdjl.e_notes;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class NotasActivity extends AppCompatActivity {
    private TextView txtNomeNota;
    private ImageView imgNota;
    private Button btnDo, btnRe, btnMi, btnFa, btnSol, btnLa, btnSi;
    // Variável pra receber o áudio.
    private MediaPlayer player;
    // Variável que recebe o parâmetro da tela anterior.
    String tiposDeNotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas);
        // Busco os parâmetros passados da tela anterior.
        Intent intent = getIntent();
        Bundle args = intent.getExtras();

        // Atribuo o valor encontrado à variável local.
        tiposDeNotas = args.getString("valor");
    }
    @Override
    protected void onResume(){
        super.onResume();

        txtNomeNota = (TextView) findViewById(R.id.txtNomeNota);
        imgNota = (ImageView) findViewById(R.id.imgNotas);

        btnDo = (Button) findViewById(R.id.btnDo);
        btnRe = (Button) findViewById(R.id.btnRe);
        btnMi = (Button) findViewById(R.id.btnMi);
        btnFa = (Button) findViewById(R.id.btnFa);
        btnSol = (Button) findViewById(R.id.btnSol);
        btnLa = (Button) findViewById(R.id.btnLa);
        btnSi = (Button) findViewById(R.id.btnSi);

        /* Verifico o valor do parâmetro vindo da outra tela.
         * Dependendo da resposta, altero as 'lable's' dos botões. 'Maior, Menor'
         */
        if(tiposDeNotas.equals("maiores")){
            btnDo.setText("C");
            btnRe.setText("D");
            btnMi.setText("E");
            btnFa.setText("F");
            btnSol.setText("G");
            btnLa.setText("A");
            btnSi.setText("B");
        }else if(tiposDeNotas.equals("menores")) {
            btnDo.setText("Cm");
            btnRe.setText("Dm");
            btnMi.setText("Em");
            btnFa.setText("Fm");
            btnSol.setText("Gm");
            btnLa.setText("Am");
            btnSi.setText("Bm");
        }



        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tiposDeNotas.equals("maiores")){
                    // Aqui altero o texto do TextView.
                    txtNomeNota.setText("Dó Maior");
                    // Aqui altero a imagem da nota.
                    imgNota.setImageResource(R.drawable.domaior);
                    // Aqui carrego e executo o áudio correspondente.
                    player = MediaPlayer.create(NotasActivity.this, R.raw.c);
                    player.start();
                }else{
                    txtNomeNota.setText("Dó Menor");
                    imgNota.setImageResource(R.drawable.domenor);
                    player = MediaPlayer.create(NotasActivity.this, R.raw.cm);
                    player.start();
                }
            }
        });


        btnRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tiposDeNotas.equals("maiores")){
                    txtNomeNota.setText("Ré Maior");
                    imgNota.setImageResource(R.drawable.remaior);
                    player = MediaPlayer.create(NotasActivity.this, R.raw.d);
                    player.start();
                }else{
                    txtNomeNota.setText("Ré Menor");
                    imgNota.setImageResource(R.drawable.remenor);
                    player = MediaPlayer.create(NotasActivity.this, R.raw.dm);
                    player.start();
                }
            }
        });

        btnMi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tiposDeNotas.equals("maiores")){
                    txtNomeNota.setText("Mi Maior");
                    imgNota.setImageResource(R.drawable.mimaior);
                    player = MediaPlayer.create(NotasActivity.this, R.raw.e);
                    player.start();
                }else{
                    txtNomeNota.setText("Mi Menor");
                    imgNota.setImageResource(R.drawable.mimenor);
                    player = MediaPlayer.create(NotasActivity.this, R.raw.em);
                    player.start();
                }
            }
        });

        btnFa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tiposDeNotas.equals("maiores")){
                    txtNomeNota.setText("Fá Maior");
                    imgNota.setImageResource(R.drawable.famaior);
                    player = MediaPlayer.create(NotasActivity.this, R.raw.f);
                    player.start();
                }else{
                    txtNomeNota.setText("Fá Menor");
                    imgNota.setImageResource(R.drawable.famenor);
                    player = MediaPlayer.create(NotasActivity.this, R.raw.fm);
                    player.start();
                }
            }
        });

        btnSol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tiposDeNotas.equals("maiores")){
                    txtNomeNota.setText("Sol Maior");
                    imgNota.setImageResource(R.drawable.solmaior);
                    player = MediaPlayer.create(NotasActivity.this, R.raw.g);
                    player.start();
                }else{
                    txtNomeNota.setText("Sol Menor");
                    imgNota.setImageResource(R.drawable.solmenor);
                    player = MediaPlayer.create(NotasActivity.this, R.raw.gm);
                    player.start();
                }
            }
        });

        btnLa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tiposDeNotas.equals("maiores")){
                    txtNomeNota.setText("Lá Maior");
                    imgNota.setImageResource(R.drawable.lamaior);
                    player = MediaPlayer.create(NotasActivity.this, R.raw.a);
                    player.start();
                }else{
                    txtNomeNota.setText("Lá Menor");
                    imgNota.setImageResource(R.drawable.lamenor);
                    player = MediaPlayer.create(NotasActivity.this, R.raw.am);
                    player.start();
                }
            }
        });

        btnSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tiposDeNotas.equals("maiores")){
                    txtNomeNota.setText("Si Maior");
                    imgNota.setImageResource(R.drawable.simaior);
                    player = MediaPlayer.create(NotasActivity.this, R.raw.b);
                    player.start();
                }else{
                    txtNomeNota.setText("Si Menor");
                    imgNota.setImageResource(R.drawable.simenor);
                    player = MediaPlayer.create(NotasActivity.this, R.raw.bm);
                    player.start();
                }
            }
        });
    }

    // Aqui verifico se existe áudio em execução. Se houver, paro pra voltar pra tela anterior.
    /*@Override
    protected void onDestroy(){
        super.onDestroy();

        if(player.isPlaying()){
            player.stop();
        }
    }*/
}
