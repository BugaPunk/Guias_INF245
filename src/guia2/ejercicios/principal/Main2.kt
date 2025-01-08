package guia2.ejercicios.principal

import guia2.ejercicios.complemento.Empleado

fun main() {

    val empleado = Empleado(
        nombre = "Julio",
        anioIngreso = 1997,
        cargo = "Gerente",
        haberBasico = 5500.0
    )

    val aniosTrabajo = empleado.calcularAniosTrabajo()
    val categoria = empleado.calcularCategoria(aniosTrabajo)
    val bonoMovilidad = empleado.calcularBonoMovilidad()
    val bonoExtra = empleado.calcularBonoExtra(categoria)
    val bonoAntiguedad = empleado.calcularBonoAntiguedad(categoria, aniosTrabajo)
    val totalGanado = empleado.calcularTotalGanado(bonoMovilidad, bonoExtra, bonoAntiguedad)
    val descuentoIVA = empleado.calcularDescuentoIVA(totalGanado)
    val descuentoAFP = empleado.calcularDescuentoAFP(totalGanado)
    val descuentoClub = empleado.calcularDescuentoClub()
    val totalDescuentos = descuentoIVA + descuentoAFP + descuentoClub
    val liquidoPagable = totalGanado - totalDescuentos

    println("Empleado: ${empleado.nombre}")
    println("Líquido Pagable: $liquidoPagable")
}