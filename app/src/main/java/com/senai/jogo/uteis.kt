package com.senai.jogo

import android.content.Intent
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity

// Verificar se deu Velha
fun verificarVelha(array: IntArray) : Boolean {
//        if(array[0] != 0 && array[1] != 0 && array[2] != 0 && array[3] != 0
//            && array[4] != 0 && array[5] != 0 && array[6] != 0 && array[7] != 0 && array[8] != 0){
//            return true
//        } else {
//            return false
//        }
    return array[0] != 0 && array[1] != 0 && array[2] != 0 && array[3] != 0
            && array[4] != 0 && array[5] != 0 && array[6] != 0 && array[7] != 0 && array[8] != 0
}

fun verificarVencedor(array: IntArray) : Boolean {

    // Vitórias seguindo a sequencia horizontal
    if (array[0] != 0 && array[1] != 0 && array[2] != 0) {
        if (array[0] == array[1] && array[0] == array[2]) {
            return true

        }
    }

    if (array[3] != 0 && array[4] != 0 && array[5] != 0) {
        if (array[3] == array[4] && array[3] == array[5]) {

            return true
        }
    }

    if (array[6] != 0 && array[7] != 0 && array[8] != 0){
        if (array[6] == array[7] && array[6] == array[8]){

            return true
        }
    }

    // Vitórias seguindo a sequencia vertical
    if (array[0] != 0 && array[3] != 0 && array[6] != 0){
        if (array[0] == array[3] && array[0] == array[6]){

            return true
        }
    }

    if (array[1] != 0 && array[4] != 0 && array[7] != 0){
        if (array[1] == array[4] && array[1] == array[7]){

            return true
        }
    }

    if (array[2] != 0 && array[5] != 0 && array[8] != 0){
        if (array[2] == array[5] && array[2] == array[8]){

            return true
        }
    }

    // Vitórias seguindo a sequencia diagonal
    if (array[0] != 0 && array[4] != 0 && array[8] != 0){
        if (array[0] == array[4] && array[0] == array[8]){

            return true
        }
    }

    if (array[2] != 0 && array[4] != 0 && array[6] != 0){
        if (array[2] == array[4] && array[2] == array[6]){

            return true
        }
    }

    return false

}

