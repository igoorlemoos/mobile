fun main(){
    println("Digite um número:")
    val numero = readLine()?.toIntOrNull() ?: 0

    val classificacao = when {
        numero > 0 -> "Positivo"
        numero < 0 -> "Negativo"
        else -> "Zero"
    }

    println("Classificação: $classificacao")
}