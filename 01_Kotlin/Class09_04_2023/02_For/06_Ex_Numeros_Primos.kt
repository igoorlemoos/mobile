fun main() {

    val num = 14
    var isPrimo = true

    // Usando o loop para verificar se o numero é primo
    for (i in 2 until num) {
        if (num % i == 0) {
            isPrimo = false
            break
        }
    }

    if (isPrimo) {
        println("O número $num: é primo")
    } else {
        println("O numero $num: não é primo")
    }
}

// Ex: fazer caso o usuario for digitar o número, pra ver se é primo