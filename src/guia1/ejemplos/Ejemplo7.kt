package guia1.ejemplos
fun main() {
    var x = 1
    var suma = 0
    while (x <= 10) {
        print("Ingrese un valor: ")
        val valor = readln().toInt()
        suma = suma + valor
        x++
    }
    println("La suma de los 10 valores ingresados es $suma")
    val promedio = suma / 10
    println("El promedio es de $promedio")
}