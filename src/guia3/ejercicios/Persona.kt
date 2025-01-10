package guia3.ejercicios

class Persona {
    private var nombre: String = ""
    private var edad: Int = 0

    fun inicializar(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }

    fun imprimir() {
        println("Nombre: $nombre y su edad es $edad")
    }

    fun esMayorEdad() {
        if (edad >= 18)
            println("Es mayor de edad $nombre")
        else
            println("No es mayor de edad $nombre")
    }
}

fun main() {
    val objP = Persona()
    objP.inicializar("Ernesto", 25)
    objP.imprimir()
    objP.esMayorEdad()
}