package guia2.ejercicios.complemento

fun calcularCostoParcial(tipoReparacion: String): Double {
    return when (tipoReparacion) {
        "Carburador" -> 400.0
        "Radiador" -> 500.0
        "Alternador" -> 200.0
        "Embrague" -> 150.0
        "Motor" -> 300.0
        else -> 100.0
    }
}

fun calcularCostoTotal(costoParcial: Double, numeroRepuestos: Int): Double {
    val subtotal = costoParcial * numeroRepuestos
    return subtotal + (subtotal * 0.045)
}

fun calcularMontoPorEmpleado(costoTotal: Double, nroEmpleados: Int): Double {
    val baseMonto = costoTotal / nroEmpleados
    return baseMonto + (baseMonto * 0.018)
}


fun calcularFechaEntrega(fechaTrabajo: String, tiempoReparacion: Int): String {

    return "$fechaTrabajo + $tiempoReparacion días"
}
