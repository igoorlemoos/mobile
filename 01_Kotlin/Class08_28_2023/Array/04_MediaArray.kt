fun main(){
    var values = doubleArrayOf(12.5, 9.8, 15.2, 18.7)
    var soma = 0.0

    for(value in values){
        soma += value
    }

    val media = soma / values.size
    print("A média dos elementos é: $media")
}