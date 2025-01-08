package guia1.ejemplos
fun main() {
    var cant = 0
    print("Cuantos valores ingresara para analizar: ")
    val cantidad = readln().toInt()
    for (i in 1..cantidad) {
        print("Ingrese un valor: ")
        val valor = readln().toInt()
        if (valor % 2 == 0)
            cant++
    }
    println("Cantidad de pares: $cant")
}