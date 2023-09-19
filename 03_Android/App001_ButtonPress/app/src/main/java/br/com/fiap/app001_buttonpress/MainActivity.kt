package br.com.fiap.app001_buttonpress

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Define o layout da tela usando o arquivo de layout activity_main.xml
        setContentView(R.layout.activity_main)

        // Encontra o botão na interface do usuario usando o ID "button"
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView) // Encontra a TextView

        // Define um ouvinte de clique para o botão
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val message = "Você pressionou o botão!"
                // Ação a ser executada quando o botão for clicado

                showToast(message)
                textView.text = message
            }
        })
    }

    // Função que exibe uma mensagem em um toast
    private fun showToast(message: String) {
        // Cria um objeto Toast para exibir a mensagem
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        Log.i("Button", "O botão foi acionado")
    }
}