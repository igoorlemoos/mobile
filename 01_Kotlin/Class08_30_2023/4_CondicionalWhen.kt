fun main(){
    // val diaSemana = 3
    println("Digite o dia da semana:")
    var diaSemana = readLine()!!.toInt()

    val mensagem = when (diaSemana){
        1 -> "Domingo"
        2 -> "Segunda-feira"
        3 -> "Terça-feira"
        else -> "Outro dia"
    }

    println("Hoje é $mensagem.")
}