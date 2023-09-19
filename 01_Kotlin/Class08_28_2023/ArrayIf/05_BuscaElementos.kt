fun main() {
    // Array de Strings

    val names = arrayOf("Igor", "Joederson", "Ricardo", "Mario")
    val searchName = "Igor"
    var found = false

    for (name in names) {
        if (name == searchName) {
            found = true
            break
        }
    }

    if(found == true){
        println("Nome '$searchName' encontrado na Array.")
    } else {
        println("Nome '$searchName' não foi encontrado na Array")
    }
}
