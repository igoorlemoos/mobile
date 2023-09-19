fun main(){
    println("Informe seu nome de usuario:")
    val usuarioInput = readLine()

    println("Informe sua senha: ")
    val senhaInput = readLine()

    val usuario = "Igor"
    val senha = "Senha123"

    if(usuario == usuarioInput && senha == senhaInput){
        println("Acesso permitido")
    } else {
        println("Acesso negado")
    }
}