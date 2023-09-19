fun main() {
    print("Digite sua idade")
    val idade = readLine()?.toIntOrNull()

    print("Você possui carteira de motorista? (true/false)")
    val possuiCarteiraDeMotorista = readLine()?.toBoolean()

    if(idade == null || possuiCarteiraDeMotorista == null) {
        println("Entrada inválida")
        return
    }

    if (idade >= 18 && possuiCarteiraDeMotorista){
        println("Você pode dirigir legalmente")
    } else {
        println("Você não pode dirigir legalmente")
    }
}