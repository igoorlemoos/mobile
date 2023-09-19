fun main(){
    val idade = 25
    val possuiCarteiraDeMotorista = true

    if (idade >= 18 && possuiCarteiraDeMotorista){  // AND
        println("Você pode dirigir legalmente")
    } else {
        println("Você não pode dirigir legamente")
    }

    val temIngresso = false
    val estaComCamisaDoTime = true
    
    if (temIngresso || estaComCamisaDoTime) {  // OR
        println("Você pod entrar no estádio")
    } else {
        println("Você não pode entrar no estádio")
    }
}