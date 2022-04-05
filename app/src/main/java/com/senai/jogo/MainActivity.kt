package com.senai.jogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Chamando o conteúdo da ImagenButton pelo id e colocando em uma variável
        val bolinha = findViewById<Button>(R.id.bolinha)
        val xizinho = findViewById<Button>(R.id.xizinho)

        bolinha.setOnClickListener(){
            val intent = Intent(this, PartidaActivity::class.java)
            val opcao: Int = 1
            intent.putExtra("opcao", opcao.toString())
            startActivity(intent)

        }

        xizinho.setOnClickListener(){
            val intent = Intent(this, PartidaActivity::class.java)
            val opcao: Int = 2
            intent.putExtra("opcao", opcao.toString())
            startActivity(intent)
        }

    }
}