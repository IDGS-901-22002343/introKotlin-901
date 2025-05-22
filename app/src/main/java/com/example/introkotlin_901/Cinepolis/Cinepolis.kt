package com.example.introkotlin_901.Cinepolis

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin_901.R

class Cinepolis : AppCompatActivity() {

    private lateinit var etNombre: EditText
    private lateinit var etPersonas: EditText
    private lateinit var etBoletos: EditText
    private lateinit var tvTotal: TextView
    private lateinit var rbSi: RadioButton
    private lateinit var rbNo: RadioButton


    private val precioUnitario = 12.0
    private val descuento1 = 0.10
    private val descuento2 = 0.15
    private val descuentoCINECO = 0.10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cinepolis)

        etNombre = findViewById(R.id.etNombre)
        etPersonas = findViewById(R.id.etPersonas)
        etBoletos = findViewById(R.id.etBoletos)
        tvTotal = findViewById(R.id.tvTotal)
        rbSi = findViewById(R.id.rbSi)
        rbNo = findViewById(R.id.rbNo)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    fun calcular(view: View?) {
        val nombre = etNombre.text.toString().trim()
        if (nombre.isEmpty()) {
            Toast.makeText(this, "Debe ingresar un nombre", Toast.LENGTH_SHORT).show()
            return
        }

        val personasText = etPersonas.text.toString()
        if (personasText.isEmpty()) {
            Toast.makeText(this, "Debe ingresar el número de personas", Toast.LENGTH_SHORT).show()
            return
        }

        val personas = personasText.toIntOrNull()
        if (personas == null || personas <= 0) {
            Toast.makeText(this, "Debe ser al menos una persona", Toast.LENGTH_SHORT).show()
            return
        }

        val boletosText = etBoletos.text.toString()
        if (boletosText.isEmpty()) {
            Toast.makeText(this, "Debe ingresar el número de boletos", Toast.LENGTH_SHORT).show()
            return
        }

        val boletos = boletosText.toIntOrNull()
        if (boletos == null || boletos <= 0) {
            Toast.makeText(this, "Debe ingresar un número válido de boletos", Toast.LENGTH_SHORT).show()
            return
        }

        val limiteBoletos = personas * 7
        if (boletos > limiteBoletos) {
            Toast.makeText(this, "Máximo $limiteBoletos boletos para $personas personas", Toast.LENGTH_SHORT).show()
            return
        }

        var total = boletos * precioUnitario

        when {
            boletos in 3..5 -> total *= (1 - descuento1)
            boletos > 5 -> total *= (1 - descuento2)
        }

        if (rbSi.isChecked) {
            total *= (1 - descuentoCINECO)
        }

        tvTotal.text = String.format("$ %.2f", total)

        val metodoPago = if (rbSi.isChecked) "Tarjeta CINECO" else "Efectivo"
        Toast.makeText(this, "Gracias por Comprar $nombre :)))))", Toast.LENGTH_LONG).show()
    }

    fun mostrarMensaje(){

    }

}