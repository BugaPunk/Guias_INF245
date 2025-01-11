package guia5.ejemplos.ejemplo2

open class Frutas() {
    private var color: String = ""
    private var sabor: String = ""
    private var precio: Int = 0

    constructor(color: String, sabor: String, precio: Int) : this() {
        this.color = color
        this.sabor = sabor
        this.precio = precio
    }

    fun pudrirse() {
        print("La fruta se esta pudriendo")
    }
}