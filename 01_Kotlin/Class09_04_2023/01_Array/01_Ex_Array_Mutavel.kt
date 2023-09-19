// Criando uma lista mútavel de numeros inteiros vazia

fun main(){
    val numeros = mutableListOf<Int>()
    // Adicionando elementos à lista

    numeros.add(1)
    numeros.add(2)
    numeros.add(3)
    numeros.add(4)
    numeros.add(5)

    // Exibindo a lista
    println("Lista de números: $numeros")

    // Removendo um elemento da lista
    numeros.removeAt(2)


    println("Lista de números após a remoção: $numeros")

}