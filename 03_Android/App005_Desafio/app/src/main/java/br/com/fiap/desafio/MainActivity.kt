package br.com.fiap.desafio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btSomar = findViewById<Button>(R.id.btSomar)

        btSomar.setOnClickListener() {
            if (camposValidos()) {
                val n1 = findViewById<EditText>(R.id.textFirstNumber).toString().toDouble()
                val n2 = findViewById<EditText>(R.id.textSecondNumber).toString().toDouble()

                val soma = soma(n1, n2)

                val intent = Intent(this, ResultActivity::class.java)

                intent.putExtra("n1", n1)
                intent.putExtra("n2", n2)
                intent.putExtra("resultado", soma)

                intent.putExtra("result", intent)
                startActivity(intent)


            }
        }
    }

    fun camposValidos() : Boolean {
        var msg = ""
        val txtN1 = findViewById<EditText>(R.id.textFirstNumber).toString()
        val txtN2 = findViewById<EditText>(R.id.textSecondNumber).toString()

        if (txtN1.trim().isEmpty()) {
            msg = "Informe o primeiro número."
        }
        else if (txtN2.trim().isEmpty()) {
            msg = "Informe o segundo número."
        }
        else {
            return true
        }

        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
        return false
    }

    fun soma(n1 : Double, n2 : Double) : Double {
        return n1 + n2
    }
}