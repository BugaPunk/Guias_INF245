package guia2.ejercicios.principal

fun main() {
    val fechaTrabajo = "1/4/2021"
    val tipoReparacion = "Carburador"
    val numeroRepuestos = 3
    val tiempoReparacion = 5
    val nroEmpleados = 2

    val costoParcial = calcularCostoParcial(tipoReparacion)
    val costoTotal = calcularCostoTotal(costoParcial, numeroRepuestos)
    val montoPorEmpleado = calcularMontoPorEmpleado(costoTotal, nroEmpleados)

    println("Fecha de Trabajo: $fechaTrabajo")
    println("Tipo de Reparación: $tipoReparacion")
    println("Costo Parcial: $costoParcial")
    println("Costo Total: $costoTotal")
    println("Monto por Empleado: $montoPorEmpleado")
}

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
