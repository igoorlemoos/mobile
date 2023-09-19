// Desafio Prático - Calculadora de Média Escolar com INPUT

fun main() {
    // Solicitando a primeira nota para o usuario
    println("Digite a nota da primeira avaliação:")
    val nota1 = readLine()!!.toDouble()

    println("Digite a nota da segunda avaliação:")
    val nota2 = readLine()!!.toDouble()

    println("Digite a nota da terceira avaliação:")
    val nota3 = readLine()!!.toDouble()

    // Calculando a média escolar
    val media = (nota1 + nota2 + nota3) / 3

    // Imprimindo a média
    println("A média é: $media")
}
