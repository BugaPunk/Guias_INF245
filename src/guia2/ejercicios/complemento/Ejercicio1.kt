package guia2.ejercicios.complemento

fun calcularIngreso(pasajeros: Int, tarifa1: Double, tarifa2: Double): Double {
    return if (pasajeros >= 35) {
        pasajeros * tarifa1
    } else {
        pasajeros * tarifa2
    }
}

fun mostrarTotales(totalPasajeros: Int, totalIngreso: Double) {
    println("Cantidad total de pasajeros: $totalPasajeros")
    println("Ingreso total: $totalIngreso Bs")
}
