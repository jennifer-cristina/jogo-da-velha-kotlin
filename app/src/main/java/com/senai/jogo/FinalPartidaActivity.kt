package com.senai.jogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class FinalPartidaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final_partida)

        // descreve a atividade a iniciar e carrega todos os dados necessários.
        val intent: Intent = getIntent()

        // Chamando o conteúdo da ImagenButton pelo id e colocando em uma variável
        val venceu = findViewById<ImageView>(R.id.vencedor)
        val novamente = findViewById<Button>(R.id.novamente)

        var vencedor = intent.getStringExtra("vencedor").toString().toInt()
        vencedor(vencedor, venceu)

        novamente.setOnClickListener(){
            val intent = Intent(this, ContraBolinhaActivity::class.java)
            startActivity(intent)
        }

    }

    // Quem é o vencedor
    fun vencedor(vencedor: Int, venceu: ImageView) {
        if (vencedor == 1) {
            venceu.background = getDrawable(R.drawable.bolinha)
        } else {
            venceu.background = getDrawable(R.drawable.xizinho)
        }
    }

}