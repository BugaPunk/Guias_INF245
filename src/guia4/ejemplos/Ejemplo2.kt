package guia4.ejemplos

fun main() {
    var matriz = Array(3) {IntArray(3)}
    for (fil in (0 until 3)) {
        for (col in (0 until 3)) {
            println("Ingrese un elemento")
            matriz[fil][col] = readln().toInt()
        }
    }

    for (fil in (0 until 3))
        for (col in (0 until 3))
            println("${matriz[fil][col]}")
}