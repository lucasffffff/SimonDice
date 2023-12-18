package com.example.simondice

class SimonDiceModel {
    private val secuenciaGenerada = mutableListOf<Int>()
    private val secuenciaUsuario = mutableListOf<Int>()

    fun generarNuevaSecuencia() {
        val nuevoColor = (1..4).random() // 1 representa un color específico
        secuenciaGenerada.add(nuevoColor)
    }

    fun obtenerSecuenciaGenerada(): List<Int> {
        return secuenciaGenerada
    }

    fun reiniciarJuego() {
        secuenciaGenerada.clear()
        secuenciaUsuario.clear()
    }

    fun agregarColorUsuario(color: Int) {
        secuenciaUsuario.add(color)
    }

    fun verificarSecuenciaUsuario(): Boolean {
        return secuenciaUsuario == secuenciaGenerada
    }
}
