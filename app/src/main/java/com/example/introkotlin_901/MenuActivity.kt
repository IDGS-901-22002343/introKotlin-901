package com.example.introkotlin_901

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin_901.Cinepolis.Cinepolis
import com.example.introkotlin_901.ejemplo1.SumaActivity
import com.example.introkotlin_901.ejemplo2.Saludo

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        val btnSaludo = findViewById<Button>(R.id.btn1)
        val btnCinepolis = findViewById<Button>(R.id.btnCinepolis)
        val btnSaludo2 = findViewById<Button>(R.id.btnSaludo)

        btnSaludo.setOnClickListener {
navegateToSaludo()
        }

        btnCinepolis.setOnClickListener {
            navegateToCinepolis()
        }
        btnSaludo2.setOnClickListener {
            navegateToSaludo2()
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navegateToSaludo() {
        val intent = Intent(this, SumaActivity::class.java)
        startActivity(intent)
    }

    private fun navegateToCinepolis() {
        val intent = Intent(this, Cinepolis::class.java)
        startActivity(intent)
    }
    private fun navegateToSaludo2() {
        val intent = Intent(this, Saludo::class.java)
        startActivity(intent)
    }

}