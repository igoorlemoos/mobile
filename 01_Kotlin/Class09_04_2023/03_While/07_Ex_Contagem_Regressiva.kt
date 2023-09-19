fun main() {

    println("Digite um número inteiro positivo: ")
    val numero = readLine()!!.toInt()

    var contador = numero
    while (contador >= 1) {
        println(contador)
        contador--
    }
}



