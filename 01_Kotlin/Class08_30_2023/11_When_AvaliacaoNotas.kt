fun main(){
    val nota = 85

    val conceito = when (nota) {
        in 0..49 -> "F"
        in 50..59 -> "D"
        in 60..69 -> "C"
        in 70..79 -> "B"
        in 80..89 -> "A"
        else -> "Nota inválida"
    }

    println("Conceito: $conceito")
}