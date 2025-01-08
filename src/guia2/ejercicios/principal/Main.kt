package guia2.ejercicios.principal
import guia2.ejercicios.complemento.calcularIngreso
import guia2.ejercicios.complemento.mostrarTotales

fun main() {

    val cantidadPasajeros = listOf(40, 30, 50, 25, 35, 20) // Lista de cantidad de pasajeros
    val tarifa1 = 10.0
    val tarifa2 = 10.5

    var totalIngreso = 0.0
    var totalPasajeros = 0

// Calcula y muestra los resultados
    for (pasajeros in cantidadPasajeros) {
        val ingreso = calcularIngreso(pasajeros, tarifa1, tarifa2)
        totalIngreso += ingreso
        totalPasajeros += pasajeros

        println("Cantidad de pasajeros: $pasajeros")
        println("Ingreso del viaje: $ingreso Bs")
        println()
    }

    mostrarTotales(totalPasajeros, totalIngreso)
}