fun main(){
    var numero = 10

    println("Variável: $numero")
    
    numero += 1
    println("Variável com incremento: $numero")
    println("Variável com incremento: ${++numero}")
    
    numero -= 1
    println("Variável sem incremento: $numero")
    println("Variável sem incremento: ${--numero}")

}