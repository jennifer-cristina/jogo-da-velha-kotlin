package com.senai.jogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DificuldadeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dificuldade)

        // Chamando o conteúdo da Button pelo id e colocando em uma variável
        val facil = findViewById<Button>(R.id.facil)
        val medio = findViewById<Button>(R.id.medio)
        val dificil = findViewById<Button>(R.id.dificil)

        facil.setOnClickListener(){
            val intent = Intent(this, EscolhaJogadorActivity::class.java)
            val facil: Int = 3
            intent.putExtra("facil", facil.toString())
            startActivity(intent)
        }

//        medio.setOnClickListener(){
//            val intent = Intent(this, PartidaActivity::class.java)
//            startActivity(intent)
//        }
//
//        dificil.setOnClickListener(){
//            val intent = Intent(this, PartidaActivity::class.java)
//            startActivity(intent)
//        }
    }
}