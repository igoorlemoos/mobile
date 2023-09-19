fun main() {
    var pares = intArrayOf(2, 4, 6, 8)
    var impares = intArrayOf(1, 3, 5, 7)

    var somaPares: Int = 0
    var somaImpares: Int = 0

    for (par in pares) {
        somaPares += par
    }

    for (impar in impares) {
        somaImpares += impar
    }

    val par_impar = somaPares + somaImpares

    println("Soma dos pares: $somaPares\nSoma dos impares: $somaImpares")
    println("Soma dos pares com impares: $par_impar ou ${somaPares+somaImpares}")

}
