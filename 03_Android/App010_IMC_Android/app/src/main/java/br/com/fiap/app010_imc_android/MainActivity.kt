package br.com.fiap.app010_imc_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rbMasculino = findViewById<RadioButton>(R.id.radioBtMasc)
        val rbFeminino = findViewById<RadioButton>(R.id.radioBtFem)
        val txtAltura = findViewById<EditText>(R.id.editTextAltura)
        val btPesoIdeal = findViewById<Button>(R.id.btPesoIdeal)

        btPesoIdeal.setOnClickListener(){
            val altura = txtAltura.text.toString().toDouble()

            val pesoIdeal : Double = if (rbMasculino.isChecked) {
                (72.7 * altura) - 58
            } else {
                (62.1 * altura) - 44.7
            }

            val dec = DecimalFormat("#.00")
            val mensagem = "Peso Ideal = ${dec.format(pesoIdeal)} kg"
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
        }
    }
}