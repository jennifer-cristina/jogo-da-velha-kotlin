package com.senai.jogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.Toast
import kotlin.random.Random

class PartidaComputadorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_partida_computador)

        // descreve a atividade a iniciar e carrega todos os dados necessários.
        val intent: Intent = getIntent()

        // Chamando o conteúdo da ImagenButton pelo id e colocando em uma variável
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
        var array = IntArray(9)
        var botoes: Array<ImageButton> = arrayOf(icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8,icon9)
        var computador = 3

        icon1.setOnClickListener() {
            jogar(icon1, jogador)
            icon1.setEnabled(false)
            jogarComputador(sortearIcon(botoes))
        }

        icon2.setOnClickListener() {
            jogar(icon2, jogador)
            icon2.setEnabled(false)
            jogarComputador(sortearIcon(botoes))
        }

        icon3.setOnClickListener() {
            jogar(icon3, jogador)
            icon3.setEnabled(false)
            jogarComputador(sortearIcon(botoes))
        }

        icon4.setOnClickListener() {

            icon4.setEnabled(false)
        }

        icon5.setOnClickListener() {

            icon5.setEnabled(false)
        }

        icon6.setOnClickListener() {

            icon6.setEnabled(false)
        }

        icon7.setOnClickListener() {

            icon7.setEnabled(false)
        }

        icon8.setOnClickListener() {

            icon8.setEnabled(false)
        }

        icon9.setOnClickListener() {

            icon9.setEnabled(false)
        }
    }

    // saber quem será vez
    fun jogar(btn: ImageButton, jogador: Int) {
        if (jogador == 2) {
            btn.background = getDrawable(R.drawable.xizinho)
        } else {
            btn.background = getDrawable(R.drawable.bolinha)
        }
    }

    fun jogarComputador(btn: ImageButton) {
        btn.background = getDrawable(R.drawable.bolinha)
    }


    fun vezComputador(computador: Int, jogador: Int, array: IntArray, botoes: Array<ImageButton>) {

        var cont = 0
        val posicao = Random.nextInt(0, 8)

        if(!verificarVazio(botoes)){
            if (array[posicao] != jogador && array[posicao] != computador) {
                if(jogador == 1) {
                    botoes[posicao].background = getDrawable(R.drawable.xizinho)

                    Toast.makeText(this, "maquina", Toast.LENGTH_SHORT).show()
                    cont++
                }
            }
        }

    }



































































































    



    fun sortearIcon(botoes: Array<ImageButton>) : ImageButton {
        var posicao = Random.nextInt(0, 8)
        while (botoes[posicao].isEnabled == false){
            posicao = Random.nextInt(0, 8)
        }
        return botoes[posicao]
    }

    fun verificarVazio(botoes: Array<ImageButton>) : Boolean {

        botoes[0].isEnabled = false
        botoes[1].isEnabled = false
        botoes[2].isEnabled = false
        botoes[3].isEnabled = false
        botoes[4].isEnabled = false
        botoes[5].isEnabled = false
        botoes[6].isEnabled = false
        botoes[7].isEnabled = false
        botoes[8].isEnabled = false
        botoes[9].isEnabled = false

        return true
    }
}
