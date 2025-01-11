package guia4.ejemplos

fun main() {
    val hasMapPersona = HashMap<Int, String>()

    println("Ingrese la cantidad de elementos a registrar")
    val n = readln().toInt()
    var clave: Int
    var valor: String

    for (i in 0 until n) {
        println("Introducir clave--->:")
        clave= readln().toInt()
        println("Introducir valor--->:")
        valor= readln()
        hasMapPersona[clave] = valor
    }
    //Mostramos los elementos clave valor
    println("$hasMapPersona")
}