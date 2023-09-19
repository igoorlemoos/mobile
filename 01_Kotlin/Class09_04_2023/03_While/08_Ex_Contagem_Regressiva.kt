fun main() {

    println("Digite um número inteiro positivo: ")
    val input = readLine()

    if (input != null && input.isNotEmpty()) {
        val numero = input.toInt()

        var contador = numero

        while (contador >= 1) {
            println(contador)
            contador--
        }
    } else {
        println("Entrada inválida")
    }
}
