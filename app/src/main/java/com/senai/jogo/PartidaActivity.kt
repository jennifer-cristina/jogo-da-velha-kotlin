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
        val intent: Intent = getIntent()

        // Chamando o conteúdo da ImagenButton pelo id e colocando em uma variável
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
        mudarVez(jogadorAtual, vez)
        var array = IntArray(9)

        icon1.setOnClickListener() {
            array[0] = jogadorAtual
            jogar(icon1, jogadorAtual, array)
            jogadorAtual = proximoJogador(jogadorAtual)
            mudarVez(jogadorAtual, vez)
            icon1.setEnabled(false)
        }

        icon2.setOnClickListener() {
            array[1] = jogadorAtual
            jogar(icon2, jogadorAtual, array)
            jogadorAtual = proximoJogador(jogadorAtual)
            mudarVez(jogadorAtual, vez)
            icon2.setEnabled(false)
        }

        icon3.setOnClickListener() {
            array[2] = jogadorAtual
            jogar(icon3, jogadorAtual, array)
            jogadorAtual = proximoJogador(jogadorAtual)
            mudarVez(jogadorAtual, vez)
            icon3.setEnabled(false)
        }

        icon4.setOnClickListener() {
            array[3] = jogadorAtual
            jogar(icon4, jogadorAtual, array)
            jogadorAtual = proximoJogador(jogadorAtual)
            mudarVez(jogadorAtual, vez)
            icon4.setEnabled(false)
        }

        icon5.setOnClickListener() {
            array[4] = jogadorAtual
            jogar(icon5, jogadorAtual, array)
            jogadorAtual = proximoJogador(jogadorAtual)
            mudarVez(jogadorAtual, vez)
            icon5.setEnabled(false)
        }

        icon6.setOnClickListener() {
            array[5] = jogadorAtual
            jogar(icon6, jogadorAtual, array)
            jogadorAtual = proximoJogador(jogadorAtual)
            mudarVez(jogadorAtual, vez)
            icon6.setEnabled(false)
        }

        icon7.setOnClickListener() {
            array[6] = jogadorAtual
            jogar(icon7, jogadorAtual, array)
            jogadorAtual = proximoJogador(jogadorAtual)
            mudarVez(jogadorAtual, vez)
            icon7.setEnabled(false)
        }

        icon8.setOnClickListener() {
            array[7] = jogadorAtual
            jogar(icon8, jogadorAtual, array)
            jogadorAtual = proximoJogador(jogadorAtual)
            mudarVez(jogadorAtual, vez)
            icon8.setEnabled(false)
        }

        icon9.setOnClickListener() {
            array[8] = jogadorAtual
            jogar(icon9, jogadorAtual, array)
            jogadorAtual = proximoJogador(jogadorAtual)
            mudarVez(jogadorAtual, vez)
            icon9.setEnabled(false)
        }

    }

    // saber quem será vez
    fun jogar(btn: ImageButton, jogador: Int, array: IntArray) {
        if (jogador == 2) {
            btn.background = getDrawable(R.drawable.xizinho)
            verificarResultado(array, jogadorAtual = jogador )
        } else {
            btn.background = getDrawable(R.drawable.bolinha)
            verificarResultado(array, jogadorAtual = jogador )
        }
    }

    // definir próximo jogador
    fun proximoJogador(jogadorAtual: Int): Int {
        if (jogadorAtual == 1) {
            return 2
        } else {
            return 1
        }
    }

    // Mudar a vez do jogador
    fun mudarVez(jogadorAtual: Int, vez: ImageView){
        if(jogadorAtual == 1){
            vez.background = getDrawable(R.drawable.bolinha)
        } else {
            vez.background = getDrawable(R.drawable.xizinho)
        }
    }

    fun verificarVencedor(array: IntArray) : Boolean {

        // Vitórias seguindo a sequencia horizontal
        if (array[0] != 0 && array[1] != 0 && array[2] != 0) {
            if (array[0] == array[1] && array[0] == array[2]) {
                Toast.makeText(this, "vencedooooooor", Toast.LENGTH_SHORT).show()
                return true
            }
        }

        if (array[3] != 0 && array[4] != 0 && array[5] != 0) {
            if (array[3] == array[4] && array[3] == array[5]) {
                Toast.makeText(this, "vencedoor", Toast.LENGTH_SHORT).show()
                return true
            }
        }

        if (array[6] != 0 && array[7] != 0 && array[8] != 0){
            if (array[6] == array[7] && array[6] == array[8]){
                Toast.makeText(this, "vencedoor", Toast.LENGTH_SHORT).show()
                return true
            }
        }

        // Vitórias seguindo a sequencia vertical
        if (array[0] != 0 && array[3] != 0 && array[6] != 0){
            if (array[0] == array[3] && array[0] == array[6]){
                Toast.makeText(this, "vencedoor", Toast.LENGTH_SHORT).show()
                return true
            }
        }

        if (array[1] != 0 && array[4] != 0 && array[7] != 0){
            if (array[1] == array[4] && array[1] == array[7]){
                Toast.makeText(this, "vencedoor", Toast.LENGTH_SHORT).show()
                return true
            }
        }

        if (array[2] != 0 && array[5] != 0 && array[8] != 0){
            if (array[2] == array[5] && array[2] == array[8]){
                Toast.makeText(this, "vencedoor", Toast.LENGTH_SHORT).show()
                return true
            }
        }

        // Vitórias seguindo a sequencia diagonal
        if (array[0] != 0 && array[4] != 0 && array[8] != 0){
            if (array[0] == array[4] && array[0] == array[8]){
                Toast.makeText(this, "vencedoor", Toast.LENGTH_SHORT).show()
                return true
            }
        }

        if (array[2] != 0 && array[4] != 0 && array[6] != 0){
            if (array[2] == array[4] && array[2] == array[6]){
                Toast.makeText(this, "vencedoor", Toast.LENGTH_SHORT).show()
                return true
            }
        }

        return false

    }

    // Verificar se deu Velha
    fun verificarVelha(array: IntArray) : Boolean {
        if(array[0] != 0 && array[1] != 0 && array[2] != 0 && array[3] != 0
            && array[4] != 0 && array[5] != 0 && array[6] != 0 && array[7] != 0 && array[8] != 0){
            return true
        } else {
            return false
        }
    }

    fun verificarResultado(array: IntArray, jogadorAtual: Int){
        if(verificarVencedor(array)) {
            val intent = Intent(this, FinalPartidaActivity::class.java)
            val vencedor: Int = jogadorAtual
            intent.putExtra("vencedor", vencedor.toString())
            startActivity(intent)
        } else if(verificarVelha(array)){
            val intent = Intent(this, VelhaActivity::class.java)
            startActivity(intent)
        }
    }




}