package guia2.ejemplos

fun suma(nro1: Int, nro2: Int) = nro1 + nro2
fun main() {
    println("Ingrese un nro")
    val valor1 = readln().toInt()
    println("Ingrese un nro")
    val valor2 = readln().toInt()
    println("=====================================")
    println("La suma es => "+ suma(valor1, valor2))
}