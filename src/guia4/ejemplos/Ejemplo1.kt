package guia4.ejemplos

fun main() {
    val vectorA = IntArray(5)
    print("\nIntroducimos el tamaño del vector: ")
    val n = readln().toInt()
    for (i in 0 until n) {
        print("\n${i+1}.- Ingrese los elementos del vector: ")
        vectorA[i] = readln().toInt()
    }

    //Mostramos los elementos del vector
    for (i in 0 until n)
        println("\nElemento en la posición $i es ${vectorA[i]}")
}