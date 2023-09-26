package br.com.fiap.app008_cadastrologin

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

        // Encontra o botão de somar no layout usando findViewById
        val btnSomar = findViewById<Button>(R.id.btnSomar)

        // Encontra os campos de entrada de texto no layout usando findViewById
        val txtN1 = findViewById<EditText>(R.id.txtN1)
        val txtN2 = findViewById<EditText>(R.id.txtN2)

        // Define um listener de clique para o botão de somar
        btnSomar.setOnClickListener {
            // Verifica se os campos de entrada são válidos usando a função camposValidos
            if (camposValidos()) {
                // Obtém os valores dos campos de entrada e os converte para Double
                val n1 = txtN1.text.toString().toDouble()
                val n2 = txtN2.text.toString().toDouble()

                // Calcula a soma dos números usando a função soma
                val soma = soma(n1, n2)

                // Cria uma intent para abrir a ResultadoActivity e passa os dados como extras
                val intentResultado = Intent(this, ResultadoActivity::class.java)
                intentResultado.putExtra("n1", n1)
                intentResultado.putExtra("n2", n2)
                intentResultado.putExtra("resultado", soma)

                // Inicia a ResultadoActivity
                startActivity(intentResultado)
            }
        }
    }

    // Função que verifica se os campos de entrada estão preenchidos
    private fun camposValidos(): Boolean {

        // Encontra os campos de entrada novamente usando findViewById
        val txtN1 = findViewById<EditText>(R.id.txtN1)
        val txtN2 = findViewById<EditText>(R.id.txtN2)

        // Verifica se algum dos campos está em branco
        if (txtN1.text.isBlank() || txtN2.text.isBlank()) {
            // Exibe uma mensagem de erro usando um Toast
            Toast.makeText(this, "Preencha todos os campos", Toast.LENGTH_SHORT).show()
            // Retorna false para indicar que os campos não são válidos
            return false
        }

        // Retorna true se ambos os campos estão preenchidos
        return true
    }

    // Função que calcula a soma de dois números
    private fun soma(n1: Double, n2: Double): Double {
        return n1 + n2
    }
}