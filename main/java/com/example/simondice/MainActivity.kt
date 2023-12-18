package com.example.simondice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: SimonDiceViewModel
    private lateinit var secuenciaGenerada: List<Int>
    private var pasoActual = 0
    private var bloqueado = true
    private val handler = Handler()
    private val delay = 1000L

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(SimonDiceViewModel::class.java)

        val btnRed = findViewById<Button>(R.id.btnRed)
        val btnGreen = findViewById<Button>(R.id.btnGreen)
        val btnBlue = findViewById<Button>(R.id.btnBlue)
        val btnYellow = findViewById<Button>(R.id.btnYellow)
        val btnReiniciar = findViewById<Button>(R.id.btnReiniciar)

        btnRed.setOnClickListener { onColorClick(1) }
        btnGreen.setOnClickListener { onColorClick(2) }
        btnBlue.setOnClickListener { onColorClick(3) }
        btnYellow.setOnClickListener { onColorClick(4) }

        btnReiniciar.setOnClickListener {
            viewModel.reiniciarJuego()
            iniciarJuego()
        }

        iniciarJuego()
    }

    private fun iniciarJuego() {
        secuenciaGenerada = viewModel.generarYObtenerNuevaSecuencia()
        pasoActual = 0
        bloqueado = true
        mostrarSecuencia()
    }

    private fun mostrarSecuencia() {
        val runnable = Runnable {
            if (pasoActual < secuenciaGenerada.size) {
                iluminarBoton(secuenciaGenerada[pasoActual])
                pasoActual++
                mostrarSecuencia()
            } else {
                bloqueado = false
            }
        }

        handler.postDelayed(runnable, delay)
    }

    private fun iluminarBoton(color: Int) {
        // Implementa la iluminación del botón correspondiente al color
    }

    private fun onColorClick(color: Int) {
        if (!bloqueado) {
            iluminarBoton(color)
            viewModel.agregarColorUsuario(color)
            if (viewModel.verificarSecuenciaUsuario()) {
                if (pasoActual == secuenciaGenerada.size) {
                    // El jugador completó la secuencia
                    iniciarJuego()
                }
            } else {
                // El jugador cometió un error
                iniciarJuego()
            }
        }
    }
}
