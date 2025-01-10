package guia4.ejemplos

fun main() {
    val arrayListCarrera = ArrayList<String>()
    println("Ingrese la cantidad de datos para el array")
    val n = readln().toInt()

    for (i in 0 until n) {
        print("\n${i+1}.- Ingrese un elemento: ")
        var elemento = readln()
        arrayListCarrera.add(elemento)
    }

}