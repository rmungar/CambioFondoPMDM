package com.example.cambiofondopmdm

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var fondoActivo = false
        val boton = findViewById<Button>(R.id.BotonCambio)

        val layout = findViewById<ConstraintLayout>(R.id.main)

        boton.setOnClickListener {
            if (!fondoActivo) {
                layout.setBackgroundColor(Color.BLACK)
                layout.background.mutate()
                fondoActivo = true
            }else{
                layout.setBackgroundColor(Color.WHITE)
                layout.background.mutate()
                fondoActivo = false
            }
        }

    }
}