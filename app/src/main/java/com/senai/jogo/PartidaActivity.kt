package com.senai.jogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class PartidaActivity : AppCompatActivity() {
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
        val icon4 = findViewById<ImageButton>(R.id.icon4)
        val icon5 = findViewById<ImageButton>(R.id.icon5)
        val icon6 = findViewById<ImageButton>(R.id.icon6)
        val icon7 = findViewById<ImageButton>(R.id.icon7)
        val icon8 = findViewById<ImageButton>(R.id.icon8)
        val icon9 = findViewById<ImageButton>(R.id.icon9)

        var jogador = intent.getStringExtra("opcao").toString().toInt()
        var jogadorAtual = jogador
        var array = IntArray(9)

        icon1.setOnClickListener() {
            array[0] = jogadorAtual
            Toast.makeText( this, "jogador: " + jogadorAtual, Toast.LENGTH_SHORT).show()
            jogar(icon1, jogadorAtual,array)
            jogadorAtual = proximoJogador(jogadorAtual)

            icon1.setEnabled(false)
        }

        icon2.setOnClickListener() {
            array[1] = jogadorAtual
            Toast.makeText( this, "jogador: " + jogadorAtual, Toast.LENGTH_SHORT).show()
            jogar(icon2, jogadorAtual,array)
            jogadorAtual = proximoJogador(jogadorAtual)
            icon2.setEnabled(false)
        }

        icon3.setOnClickListener() {
            array[2] = jogadorAtual
            Toast.makeText( this, "jogador: " + jogadorAtual, Toast.LENGTH_SHORT).show()
            jogar(icon3, jogadorAtual,array)
            jogadorAtual = proximoJogador(jogadorAtual)
            icon3.setEnabled(false)
        }

        icon4.setOnClickListener() {
            array[3] = jogadorAtual
            Toast.makeText( this, "jogador: " + jogadorAtual, Toast.LENGTH_SHORT).show()
            jogar(icon4, jogadorAtual,array)
            jogadorAtual = proximoJogador(jogadorAtual)
            icon4.setEnabled(false)
        }

        icon5.setOnClickListener() {
            array[4] = jogadorAtual
            Toast.makeText( this, "jogador: " + jogadorAtual, Toast.LENGTH_SHORT).show()
            jogar(icon5, jogadorAtual,array)
            jogadorAtual = proximoJogador(jogadorAtual)
            icon5.setEnabled(false)
        }

        icon6.setOnClickListener() {
            array[6] = jogadorAtual
            Toast.makeText( this, "jogador: " + jogadorAtual, Toast.LENGTH_SHORT).show()
            jogar(icon6, jogadorAtual,array)
            jogadorAtual = proximoJogador(jogadorAtual)
            icon6.setEnabled(false)
        }

        icon7.setOnClickListener() {
            array[7] = jogadorAtual
            Toast.makeText( this, "jogador: " + jogadorAtual, Toast.LENGTH_SHORT).show()
            jogar(icon7, jogadorAtual,array)
            jogadorAtual = proximoJogador(jogadorAtual)
            icon7.setEnabled(false)
        }

        icon8.setOnClickListener() {
            array[8] = jogadorAtual
            Toast.makeText( this, "jogador: " + jogadorAtual, Toast.LENGTH_SHORT).show()
            jogar(icon8, jogadorAtual,array)
            jogadorAtual = proximoJogador(jogadorAtual)
            icon8.setEnabled(false)
        }

        icon9.setOnClickListener() {
            array[9] = jogadorAtual
            Toast.makeText( this, "jogador: " + jogadorAtual, Toast.LENGTH_SHORT).show()
            jogar(icon9, jogadorAtual,array)
            jogadorAtual = proximoJogador(jogadorAtual)
            icon9.setEnabled(false)
        }

    }

        // saber quem será vez
        fun jogar(btn: ImageButton, jogador: Int, array: IntArray){
            if (jogador == 1){
                btn.background = getDrawable(R.drawable.xizinho)
                verificarVencedor(array)
                Toast.makeText( this, "teste" , Toast.LENGTH_SHORT).show()
            }else{
                btn.background = getDrawable(R.drawable.bolinha)
                verificarVencedor(array)
                Toast.makeText( this, "teste" , Toast.LENGTH_SHORT).show()
            }
        }

      // definir próximo jogador
      fun proximoJogador(jogadorAtual: Int): Int {
          if (jogadorAtual == 1) {
              return 0
          } else {
              return 1
          }
      }


      fun verificarVencedor(array: IntArray){
              if(array[0] == array[1] && array[0] == array[2]){
                  return Toast.makeText( this, "vencedooooooor" , Toast.LENGTH_SHORT).show()
              } else if(array[3] == array[4] && array[3] == array[5]) {
                  return Toast.makeText(this, "vencedoor", Toast.LENGTH_SHORT).show()
              }

      }







}