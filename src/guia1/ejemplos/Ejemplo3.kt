package guia1.ejemplos
fun main() {

    print("Ingrese un nro comprendido entre 1 y 4 para las estaciones del año")
    val estacion: Int = readln().toInt()

    if (estacion == 1) {
        println("La estacion elegida es Primavera")
    } else if (estacion == 2) {
        println("La estacion elegida es Verano")
    }  else if (estacion == 3) {
        println("La estacion elegida es Otoño")
    } else if (estacion == 4) {
        println("La estacion elegida es Invierno")
    } else {
        println("Opcion incorrecta")
    }
}