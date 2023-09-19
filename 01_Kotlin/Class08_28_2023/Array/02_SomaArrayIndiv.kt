fun main() {
    val pares = intArrayOf(0, 2, 4, 6)
    val impares = intArrayOf(1, 3, 5, 7)

    val soma = IntArray(4)

    soma[0] = pares[0] + impares[0]
    soma[1] = pares[1] + impares[1]
    soma[2] = pares[2] + impares[2]
    soma[3] = pares[3] + impares[3]

    println("Registro 0 de soma [0] é ${soma[0]}")
    println("Registro 1 de soma [1] é ${soma[1]}")
    println("Registro 2 de soma [2] é ${soma[2]}")
    println("Registro 3 de soma [3] é ${soma[3]}")
}
