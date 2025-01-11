package guia5.ejercicios.ejercicio1

class Colegio(
    nroDocentes: Int,
    nroEstudiantes: Int,
    estudiantes: List<Estudiante>,
    docentes: List<Docente>,

    nombre: String,
    anioFundacion: Int,
    tipo: String,
    val turno: String
) : EntidadEducacion(nroDocentes, nroEstudiantes, estudiantes, docentes, nombre, anioFundacion, tipo) {

}