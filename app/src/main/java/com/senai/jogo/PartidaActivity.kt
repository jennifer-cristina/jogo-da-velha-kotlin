package com.senai.jogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class PartidaActivity : AppCompatActivity() {
    //jogador
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_partida)


        // descreve a atividade a iniciar e carrega todos os dados necessários.
        val intent:Intent = getIntent()

        // Chamando o conteúdo da ImagenButton pelo id e colocando em uma variável
        val bolinha = findViewById<Button>(R.id.bolinha)
        val xizinho = findViewById<Button>(R.id.xizinho)
        val vez = findViewById<ImageView>(R.id.vez)
        val icon1 = findViewById<ImageButton>(R.id.icon1)
        val icon2 = findViewById<ImageButton>(R.id.icon2)
        val icon3 = findViewById<ImageButton>(R.id.icon3)
        val icon4 = findViewById<Button>(R.id.icon4)
        val icon5 = findViewById<Button>(R.id.icon5)
        val icon6 = findViewById<Button>(R.id.icon6)
        val icon7 = findViewById<Button>(R.id.icon7)
        val icon8 = findViewById<Button>(R.id.icon8)
        val icon9 = findViewById<Button>(R.id.icon9)

        var jogador = intent.getStringExtra("opcao").toString().toInt()
        var jogadorAtual = jogador

        icon1.setOnClickListener() {
            Toast.makeText( this, "jogador: " + jogadorAtual, Toast.LENGTH_SHORT).show()
            jogar(icon1, jogadorAtual)
            jogadorAtual = proximoJogador(jogadorAtual)
        }

        icon2.setOnClickListener() {
            Toast.makeText( this, "jogador: " + jogadorAtual, Toast.LENGTH_SHORT).show()
            jogar(icon2, jogadorAtual)
            jogadorAtual = proximoJogador(jogadorAtual)
        }

        icon3.setOnClickListener() {
            Toast.makeText( this, "jogador: " + jogadorAtual, Toast.LENGTH_SHORT).show()
            jogar(icon3, jogadorAtual)
            jogadorAtual = proximoJogador(jogadorAtual)
        }

    }

        // saber quem será vez
        fun jogar(btn: ImageButton, jogador: Int){
            if (jogador == 1){
                btn.background = getDrawable(R.drawable.xizinho)
            }else{
                btn.background = getDrawable(R.drawable.bolinha)
            }
        }

      // definir próximo jogador
      fun proximoJogador(jogadorAtual: Int): Int {
          if(jogadorAtual == 1){
              return 0
          }else{
              return 1
          }
      }






}