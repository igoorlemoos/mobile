fun main(){
    val originalArray = arrayOf(1,2,3,4,5)
    val reversedArray = originalArray.reversedArray()

    println("Aray Original: ${originalArray.joinToString()}")
    println("Array invertida: ${reversedArray.joinToString()}")
}