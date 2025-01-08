package guia2.ejemplos

fun sumar(nro1: Int, nro2: Int): Int {
    return (nro1+nro2)
}

fun main() {
    println("La suma es => "+ sumar(5,5))
    println("=====================================")
    println("Ingrese un nro")
    val valor1 = readln().toInt()
    println("Ingrese un nro")
    val valor2 = readln().toInt()
    println("La suma es => "+ sumar(valor1, valor2))
}