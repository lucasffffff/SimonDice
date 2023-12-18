package com.example.simondice

import androidx.lifecycle.ViewModel
import com.example.simondice.SimonDiceModel

class SimonDiceViewModel : ViewModel() {
    private val model = SimonDiceModel()

    fun generarYObtenerNuevaSecuencia(): List<Int> {
        model.generarNuevaSecuencia()
        return model.obtenerSecuenciaGenerada()
    }

    fun reiniciarJuego() {
        model.reiniciarJuego()
    }

    fun agregarColorUsuario(color: Int) {
        model.agregarColorUsuario(color)
    }

    fun verificarSecuenciaUsuario(): Boolean {
        return model.verificarSecuenciaUsuario()
    }
}
