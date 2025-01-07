package guia1.ejemplos
fun main() {
    val a: Int
    val b: Int

    print("Ingrese primer valor ")
    a = readln().toInt()
    print("Ingrese otro valor ")
    b = readln().toInt()

    val t = 2 + a + b
    println("El total es $t")
}