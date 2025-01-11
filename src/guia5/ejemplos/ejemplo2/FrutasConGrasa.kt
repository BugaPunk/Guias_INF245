package guia5.ejemplos.ejemplo2

class FrutaConGrasa() : Frutas() {
    private var cantidadGrasa: Int = 0

    constructor(grasa: Int) : this() {
        this.cantidadGrasa = grasa
    }
}

fun main() {
    var objManzana = Frutas("Rojo", "Dulce", 4)
    val objAguacate = FrutaConGrasa(10)
    objAguacate.pudrirse()
}