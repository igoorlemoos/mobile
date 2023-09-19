fun main()
{
    println("Digite sua idade:")
    val idadeInput = readLine()

    if(idadeInput == null){
        println("Entrada inválida")
        return
    }

    val idade = idadeInput.toIntOrNull()    

    if(idade == null){
        println("Idade inválida. Por favor digite um número válido")
        return
    }

    if(idade>=18){
        println("Você é maior de idade")
    } else {
        println("Você é menor de idade")
    }
}