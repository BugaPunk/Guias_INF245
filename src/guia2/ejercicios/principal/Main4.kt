package guia2.ejercicios.principal
import guia2.ejercicios.complemento.calcularCostoTotal
import guia2.ejercicios.complemento.calcularCostoParcial
import guia2.ejercicios.complemento.calcularFechaEntrega
import guia2.ejercicios.complemento.calcularMontoPorEmpleado

fun main() {
    // Datos de ejemplo para un registro
    val fechaTrabajo = "1/4/2021"
    val marca = "Suzuki"
    val modelo = "92"
    val tipoReparacion = "Carburador"
    val numeroRepuestos = 3
    val tiempoReparacion = 5
    val nroEmpleados = 2

    // Cálculos
    val costoParcial = calcularCostoParcial(tipoReparacion)
    val costoTotal = calcularCostoTotal(costoParcial, numeroRepuestos)
    val fechaEntrega = calcularFechaEntrega(fechaTrabajo, tiempoReparacion)
    val montoPorEmpleado = calcularMontoPorEmpleado(costoTotal, nroEmpleados)

    // Mostrar resultados
    println("Fecha de Trabajo: $fechaTrabajo")
    println("Marca: $marca")
    println("Modelo: $modelo")
    println("Tipo de Reparación: $tipoReparacion")
    println("Costo Parcial: $costoParcial")
    println("Costo Total: $costoTotal")
    println("Fecha de Entrega: $fechaEntrega")
    println("Número de Empleados: $nroEmpleados")
    println("Monto por Empleado: $montoPorEmpleado")
}

