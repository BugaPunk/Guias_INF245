package guia5.ejercicios.ejercicio1

// Clase EntidadEducacion
open class EntidadEducacion(
    nroDocentes: Int,
    nroEstudiantes: Int,
    estudiantes: List<Estudiante>,
    docentes: List<Docente>,

    val nombre: String,
    var anioFundacion: Int,
    val tipo: String
): Organizacion(nroDocentes, nroEstudiantes, estudiantes, docentes) {

    fun modificarAnio(nuevoAnio: Int) {
        println("El año de fundación es $anioFundacion")
        this.anioFundacion = nuevoAnio
        println("El año de fundación es $anioFundacion")
    }

}