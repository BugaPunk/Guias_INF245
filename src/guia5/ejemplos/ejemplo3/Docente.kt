package guia5.ejemplos.ejemplo3

class Docente(
    codigo: Int,
    nombre: String,
    var horas: Int,
    var importePorHora: Double):
    Persona(
        codigo,
        nombre,
        horas * importePorHora
    ) {
    fun salidaDocente(): String {
        return "Docente: " + super.salidaPersona()
    }
}