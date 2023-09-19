fun analisarIdade(idade: Int){
    val mensagem = when {
        idade < 10 -> "Menor de idade"
        idade in 10..64 -> "Adulto"
        else -> "Idoso"
    }

    println(mensagem)
}

fun main(){
    analisarIdade(19)
}