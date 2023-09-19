// Crie um programa que utilize um loop While ou do-while para encontrar a potência de 2 que seja maior do que um determinado valor inserido pelo usuário.
// Lembre-se de solicitar a entrada do usuário, calcular as potências de 2 e sair do loop quando encontrar a primeira potência maior que o valor inserido

fun main() {
    println("Digite o valor para ser buscado: ")

    // Lê a entrada do usuário como uma String ea converte para um valor inteiro
    // Se a conversão falhar, o valor padrão 0 é usado
    val valor = readLine()?.toInt() ?: 0
    
    // Inicializa a potência como 1 e o expoente como 0
    var potencia = 1
    var expoente = 0

    while (potencia <= valor) {

        potencia = Math.pow(2.0, expoente.toDouble()).toInt()

        expoente++
    
    }  

    expoente -= 1

    println("A primeira potência de 2 maior que $valor é 2^$expoente: $potencia")

}

