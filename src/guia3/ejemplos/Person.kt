package guia3.ejemplos

class Person {
    var nombre: String? = null
    private var edad: Int = 0

    constructor(_nombre: String, _edad: Int) {
        this.nombre = _nombre
        this.edad = _edad
    }

    fun imprimir() {
        println("Nombre: $nombre y tiene una edad de $edad")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}

fun main() {
    val objP = Person("Apolinar",33)
    objP.imprimir()
    objP.esMayorEdad()
}