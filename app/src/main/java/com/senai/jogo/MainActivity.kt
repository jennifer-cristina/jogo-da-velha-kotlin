package com.senai.jogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Chamando o conteúdo da TextView pelo id e colocando em uma variável
        val bolinha = findViewById<Button>(R.id.bolinha)

        bolinha.setOnClickListener(){
            val intent = Intent(this, DificuldadeActivity::class.java)
            startActivity(intent)
        }
    }
}