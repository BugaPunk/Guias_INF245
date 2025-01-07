package guia1.ejemplos
fun main() {
    do {
        println("Ingrese un valor comprendido entre 0 y 9 ...")
        val valor = readln().toInt()
    } while (!((valor >= 0) && (valor <= 9)))

    println("Ingrese un nro de un digito")
}