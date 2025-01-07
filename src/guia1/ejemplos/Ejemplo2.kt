package guia1.ejemplos
fun main() {
    val a: Int
    val b: Int
    val c: Int

    print("Ingrese primer valor ")
    a = readln().toInt()
    print("Ingrese otro valor ")
    b = readln().toInt()

    if (a > b) {
       c = a - b
    } else {
        c = b - a
    }
    print("El valor de la expresion es -> $c")
}