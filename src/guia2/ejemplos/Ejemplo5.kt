package guia2.ejemplos

fun sumar2digitos(nro1: Int, nro2: Int): Int {
    return (nro1*nro2)
}

fun main() {
    println("Ingrese un nro")
    val valor1 = readln().toInt()
    println("Ingrese un nro")
    val valor2 = readln().toInt()
    println("=====================================")
    println("La suma de $valor1 y $valor2 es ${sumar2digitos(nro2 = valor2, nro1 = valor1)}")
}