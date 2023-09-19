fun main(){
    println("Digite a cor em português:")
    val cor = readLine() ?: ""  // caso for nulo fica vazio

    val traducao = when(cor){
        "vermelho" -> "red"
        "azul" -> "blue"
        "verde" -> "green"
        else -> "Cor desconhecida"
    }

    println("Tradução:$traducao")
}