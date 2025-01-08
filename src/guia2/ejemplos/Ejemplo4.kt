package guia2.ejemplos

fun adicion(nro1: Int, nro2: Int = 44): Int {
    return (nro1+nro2)
}

fun main() {
    println("Ingrese un nro")
    val valor1 = readln().toInt()
    println("=====================================")
    println("La suma con el segundo parámetro predeterminado es => "+ adicion(valor1))
    println("=====================================")

    println("Ingrese un nro")
    val valor2 = readln().toInt()
    println("=====================================")
    println("La suma es => "+ adicion(valor1, valor2))
}