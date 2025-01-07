package guia1.ejercicios

fun main() {
    val clientes = mutableListOf(
        Cliente("Juan", 2, 50.0),
        Cliente("Maria", 3, 50.0),
        Cliente("Pedro", 4, 50.0),
        Cliente("Ana", 5, 50.0),
        Cliente("Luis", 2, 50.0),
        Cliente("Sofia", 3, 50.0),
        Cliente("Carlos", 4, 50.0),
        Cliente("Isabel", 5, 50.0)
    )

    var totalVentas = 0.0

    for (cliente in clientes) {
        val pagoVenta = cliente.numeroPorciones * cliente.precioPlato
        val descuento = if (cliente.numeroPorciones >= 4) pagoVenta * 0.1 else 0.0
        val totalAPagar = pagoVenta - descuento

        println("Cliente: ${cliente.nombre}")
        println("Pago de venta: $pagoVenta")
        println("Descuento: $descuento")
        println("Total a pagar: $totalAPagar")
        println()

        totalVentas += totalAPagar
    }

    println("Total ventas: $totalVentas")
}

data class Cliente(val nombre: String, val numeroPorciones: Int, val precioPlato: Double)