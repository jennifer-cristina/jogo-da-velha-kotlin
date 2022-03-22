package com.senai.jogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

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
        val icon2 = findViewById<Button>(R.id.icon2)
        val icon3 = findViewById<Button>(R.id.icon3)
        val icon4 = findViewById<Button>(R.id.icon4)
        val icon5 = findViewById<Button>(R.id.icon5)
        val icon6 = findViewById<Button>(R.id.icon6)
        val icon7 = findViewById<Button>(R.id.icon7)
        val icon8 = findViewById<Button>(R.id.icon8)
        val icon9 = findViewById<Button>(R.id.icon9)

        var jogador = intent.getStringExtra("opcao").toString().toInt()

        icon1.setOnClickListener() {
            joga(icon1, jogador)
        }
    }

        // saber quem será vez
        fun joga(btn: ImageButton, jogador: Int){
            if (jogador % 2 != 0){
                btn.background = getDrawable(R.drawable.xizinho)
            }else{
                btn.background = getDrawable(R.drawable.bolinha)
            }
        }








}