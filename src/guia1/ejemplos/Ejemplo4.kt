package guia1.ejemplos
fun main() {

    println("Ingrese un nro comprendido entre 1 y 4 para las estaciones del año")
    val estacion: Int = readln().toInt()

    when (estacion) {
        1 -> println("La estacion es Primavera")
        2 -> println("La estacion es Verano")
        3 -> println("La estacion es Otoño")
        4 -> println("La estacion es Invierno")
        else -> print("Opcion incorrecta")
    }
}