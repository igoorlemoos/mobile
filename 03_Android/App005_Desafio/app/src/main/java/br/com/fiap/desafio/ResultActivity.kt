package br.com.fiap.desafio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val n1 = intent.getDoubleExtra("n1", 0.0)
        val n2 = intent.getDoubleExtra("n2", 0.0)
        val soma = intent.getDoubleExtra("resultado", 0.0)

        var txtResultado = findViewById<TextView>(R.id.textResultado)
        txtResultado.text = "$n1 + $n2 = $soma"
    }
}