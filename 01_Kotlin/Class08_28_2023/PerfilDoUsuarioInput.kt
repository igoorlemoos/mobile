// Perfil do Usuario com INPUT

fun main() {

    println("Digite o nome:")
    var nome = readLine()!!.toString()

    println("Digite a idade:")
    var idade = readLine()!!.toInt()

    println("Digite o e-mail:")
    var email = readLine()!!.toString()

    println("Digite se o usuario está ativo, true/false")
    var ativoUsuario = readLine()!!.toBoolean()

    println("Nome: $nome, idade: $idade")
    println("Email: $email")
    println("Usuario ativo: $ativoUsuario")
}
