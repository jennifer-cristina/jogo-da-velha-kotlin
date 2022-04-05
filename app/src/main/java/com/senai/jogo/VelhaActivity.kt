package com.senai.jogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class VelhaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_velha)

        // Chamando o conteúdo da ImagenButton pelo id e colocando em uma variável
        val novamente = findViewById<Button>(R.id.novamente)

        novamente.setOnClickListener(){
            val intent = Intent(this, ContraBolinhaActivity::class.java)
            startActivity(intent)
        }
    }
}