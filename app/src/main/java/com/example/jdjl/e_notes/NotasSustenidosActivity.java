package com.example.jdjl.e_notes;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class NotasSustenidosActivity extends AppCompatActivity {
    private TextView txtNomeNota;
    private ImageView imgNota;
    //Notas Sustenidas
    private Button btnDo, btnRe, btnFa, btnSol, btnLa;
    // Variável pra receber o áudio.
    private MediaPlayer player;
    // Variável que recebe o parâmetro da tela anterior.
    String tiposDeNotas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notas_sustenidos);
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
        btnFa = (Button) findViewById(R.id.btnFa);
        btnSol = (Button) findViewById(R.id.btnSol);
        btnLa = (Button) findViewById(R.id.btnLa);

        /* Verifico o valor do parâmetro vindo da outra tela.
         * Dependendo da resposta, altero as 'lable's' dos botões. 'Maior, Menor'
         */
        if(tiposDeNotas.equals("susMaiores")){
            btnDo.setText("C#");
            btnRe.setText("D#");
            btnFa.setText("F#");
            btnSol.setText("G#");
            btnLa.setText("A#");
        }else if(tiposDeNotas.equals("susMenores")) {
            btnDo.setText("C#m");
            btnRe.setText("D#m");;
            btnFa.setText("F#m");
            btnSol.setText("G#m");
            btnLa.setText("A#m");
        }



        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tiposDeNotas.equals("susMaiores")){
                    // Aqui altero o texto do TextView.
                    txtNomeNota.setText("Dó Sustenido Maior");
                    // Aqui altero a imagem da nota.
                    imgNota.setImageResource(R.drawable.dosusmaior);
                    // Aqui carrego e executo o áudio correspondente.
                    player = MediaPlayer.create(NotasSustenidosActivity.this, R.raw.csus);
                    player.start();
                }else{
                    txtNomeNota.setText("Dó Sustenido Menor");
                    imgNota.setImageResource(R.drawable.dosusmenor);
                    player = MediaPlayer.create(NotasSustenidosActivity.this, R.raw.csusm);
                    player.start();
                }
            }
        });


        btnRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tiposDeNotas.equals("susMaiores")){
                    txtNomeNota.setText("Ré Sustenido Maior");
                    imgNota.setImageResource(R.drawable.resusmaior);
                    player = MediaPlayer.create(NotasSustenidosActivity.this, R.raw.dsus);
                    player.start();
                }else{
                    txtNomeNota.setText("Ré Sustenido Menor");
                    imgNota.setImageResource(R.drawable.resusmenor);
                    player = MediaPlayer.create(NotasSustenidosActivity.this, R.raw.dsusm);
                    player.start();
                }
            }
        });


        btnFa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tiposDeNotas.equals("susMaiores")){
                    txtNomeNota.setText("Fá Sustenido Maior");
                    imgNota.setImageResource(R.drawable.fasusmaior);
                    player = MediaPlayer.create(NotasSustenidosActivity.this, R.raw.fsus);
                    player.start();
                }else{
                    txtNomeNota.setText("Fá Sustenido Menor");
                    imgNota.setImageResource(R.drawable.fasusmenor);
                    player = MediaPlayer.create(NotasSustenidosActivity.this, R.raw.fsusm);
                    player.start();
                }
            }
        });

        btnSol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tiposDeNotas.equals("susMaiores")){
                    txtNomeNota.setText("Sol Sustenido Maior");
                    imgNota.setImageResource(R.drawable.solsusmaior);
                    player = MediaPlayer.create(NotasSustenidosActivity.this, R.raw.gsus);
                    player.start();
                }else{
                    txtNomeNota.setText("Sol Sustenido Menor");
                    imgNota.setImageResource(R.drawable.solsusmenor);
                    player = MediaPlayer.create(NotasSustenidosActivity.this, R.raw.gsusm);
                    player.start();
                }
            }
        });

        btnLa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tiposDeNotas.equals("susMaiores")){
                    txtNomeNota.setText("Lá Sustenido Maior");
                    imgNota.setImageResource(R.drawable.lasusmaior);
                    player = MediaPlayer.create(NotasSustenidosActivity.this, R.raw.asus);
                    player.start();
                }else{
                    txtNomeNota.setText("Lá Sustenido Menor");
                    imgNota.setImageResource(R.drawable.lasusmenor);
                    player = MediaPlayer.create(NotasSustenidosActivity.this, R.raw.asusm);
                    player.start();
                }
            }
        });


    }
}
