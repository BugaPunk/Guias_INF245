package guia5.ejercicios.ejercicio1

class Instituto(
    nroDocentes: Int,
    nroEstudiantes: Int,
    estudiantes: List<Estudiante>,
    docentes: List<Docente>,

    nombre: String,
    anioFundacion: Int,
    tipo: String,
) : EntidadEducacion(nroDocentes, nroEstudiantes, estudiantes, docentes, nombre, anioFundacion, tipo) {

}
