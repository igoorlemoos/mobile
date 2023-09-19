package br.com.fiap.app002_raffle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//    }

    // O método onCreate é chamado quando a atividade é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Define o layout da atividade com arquivo XML activity_main.xml
        setContentView(R.layout.activity_main)
        Log.i("Btn", "O número foi sorteado")
    }

    fun sortearNumero(view: View) {
        // Encontra o TextView com o ID textoResultado no layout
        val texto = findViewById<TextView>(R.id.textoResultado)

        // Gera um número aleatório entre 0 e 10 (inclusive)
        val numero = Random().nextInt(11)

        // Define o texto do TextView para mostrar o número sorteado
        texto.text = "Número: $numero"
    }


}