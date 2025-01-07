package guia1.ejemplos
fun main() {
    print("Ingrese un valor: ")
    val valor = readln().toInt()
    var x = 1
    while (x <= valor) {
        println(x)
        x++
    }
}