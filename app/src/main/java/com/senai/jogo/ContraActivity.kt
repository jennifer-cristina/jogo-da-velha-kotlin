package com.senai.jogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class ContraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contra)

        // Chamando o conteúdo da ImagenButton pelo id e colocando em uma variável
        val computador = findViewById<ImageButton>(R.id.computador)
        val amigo = findViewById<ImageButton>(R.id.amigo)

        computador.setOnClickListener(){
            val intent = Intent(this, DificuldadeActivity::class.java)
            startActivity(intent)
        }

        amigo.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}