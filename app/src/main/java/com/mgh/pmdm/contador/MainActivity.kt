package com.mgh.pmdm.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var contador=0
    //ESTO ES UN COMENTARIO
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Referencia al TextView
        val textViewContador=findViewById<TextView>(R.id.textViewContador)

        // Inicializamos el TextView con el contador a 0
        textViewContador.setText(contador.toString())

        // Referencia al botón
        val btMas=findViewById<Button>(R.id.btMas)

        // Asociaciamos una expresióin lambda como
        // respuesta (callback) al evento Clic sobre
        // el botón
        btMas.setOnClickListener {
            contador++
            textViewContador.setText(contador.toString())
        }

        val btMenos=findViewById<Button>(R.id.btMenos)

        btMenos.setOnClickListener {
            contador--
            textViewContador.setText(contador.toString())
        }

    }
}