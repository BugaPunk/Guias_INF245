package guia3.ejemplos

class People(_nombre: String, _edad: Int) {
    var nombre: String = _nombre
    private var edad: Int = _edad

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
    val objP = People("Miguel Taboada",20)
    objP.imprimir()
    objP.esMayorEdad()
}