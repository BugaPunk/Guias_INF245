package guia5.ejemplos.ejemplo3

open class Persona {
    private var codigo: Int = 0
    private var nombre: String = ""
    private var sueldo: Double = 0.0

    constructor(codigo: Int, nombre: String, sueldo: Double) {
        this.codigo = codigo
        this.nombre = nombre
        this.sueldo = sueldo
    }

    public fun salidaPersona(): String {
        return ("$codigo - $nombre - $sueldo")
    }
}