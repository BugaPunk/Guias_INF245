package guia2.ejercicios.complemento

data class Empleado(
    val nombre: String,
    val anioIngreso: Int,
    val cargo: String,
    val haberBasico: Double
) {
    fun calcularAniosTrabajo(): Int {
        val anioActual = 2025
        return anioActual - anioIngreso
    }

    fun calcularCategoria(aniosTrabajo: Int): String {
        return when {
            aniosTrabajo in 1..4 -> "D"
            aniosTrabajo in 5..8 -> "C"
            aniosTrabajo in 9..13 -> "B"
            aniosTrabajo > 13 -> "A"
            else -> "Sin categoría"
        }
    }

    fun calcularBonoMovilidad(): Double {
        return if (cargo.equals("Mensajero", ignoreCase = true)) 200.0 else 0.0
    }

    fun calcularBonoExtra(categoria: String): Double {
        return when (categoria) {
            "A" -> haberBasico * 0.1
            "B" -> haberBasico * 0.1
            "C" -> haberBasico * 0.07
            "D" -> haberBasico * 0.03
            else -> 0.0
        }
    }

    fun calcularBonoAntiguedad(categoria: String, aniosTrabajo: Int): Double {
        val porcentaje = when (categoria) {
            "A" -> 0.035
            "B" -> 0.03
            "C" -> 0.027
            "D" -> 0.02
            else -> 0.0
        }
        return haberBasico * porcentaje * aniosTrabajo
    }

    fun calcularTotalGanado(bonoMovilidad: Double, bonoExtra: Double, bonoAntiguedad: Double): Double {
        return haberBasico + bonoMovilidad + bonoExtra + bonoAntiguedad
    }

    fun calcularDescuentoIVA(totalGanado: Double): Double {
        return if (haberBasico >= 3000) totalGanado * 0.13 else 0.0
    }

    fun calcularDescuentoAFP(totalGanado: Double): Double {
        return totalGanado * 0.055
    }

    fun calcularDescuentoClub(): Double {
        return if (haberBasico >= 1900) 100.0 else 0.0
    }
}
