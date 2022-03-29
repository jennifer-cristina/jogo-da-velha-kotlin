package com.senai.jogo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.*
import kotlin.concurrent.schedule

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Criar um time para abrir a segunda tela do aplicativo
        Timer().schedule(2500) { abrirContraQuem() }
    }

    private fun abrirContraQuem() {
        val intent = Intent(this, ContraBolinhaActivity::class.java)
        startActivity(intent)
        finish()
    }
}