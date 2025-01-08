package guia1.ejemplos
fun main() {
    val c: Int

    print("Ingrese primer valor ")
    val a: Int = readln().toInt()
    print("Ingrese otro valor ")
    val b: Int = readln().toInt()

    c = if (a > b) {
        a - b
    } else {
        b - a
    }
    print("El valor de la expresión es -> $c")
}