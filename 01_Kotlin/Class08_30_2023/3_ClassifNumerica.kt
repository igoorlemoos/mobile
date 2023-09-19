fun main(){
    // val numero = 7
    println("Digite um número para saber se é positivo/negativo ou zero:")
    val numero = readLine()!!.toDouble()

    if (numero > 0){
        println("O número é positivo")
    } else if (numero < 0){
        println("O número é negativo")
    } else {
        println("O número é zero")
    }
}