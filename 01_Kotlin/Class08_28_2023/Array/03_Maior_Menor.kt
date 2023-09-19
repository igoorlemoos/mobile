fun main() {
    val number = intArrayOf(8, 1, 9, 25, 30, 3, 15)

    var min = number[0]
    var max = number[0]

    for (numero in number) {
        if (numero < min) {
            min = numero
        }
        if (numero > max) {
            max = numero
        }
    }

    println("O menor número é: $min\nO maior número é $max")
    
}
