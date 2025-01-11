package guia5.ejemplos.ejemplo3

class Trabajador(
    codigo: Int,
    nombre: String,
    sueldo: Double,
    var bonificacion: Double):
    Persona(
        codigo,
        nombre,
        sueldo + bonificacion
    ) {
    fun salidaTrabajador(): String {
        return "Trabajador: " + super.salidaPersona()
    }
}