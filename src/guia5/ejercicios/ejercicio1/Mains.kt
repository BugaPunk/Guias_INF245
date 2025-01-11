package guia5.ejercicios.ejercicio1

fun main() {
    //A
    val estudiantes = listOf(Estudiante("Juan", 20), Estudiante("Maria", 22))
    val docentes = listOf(Docente("Pedro", 35), Docente("Ana", 40))

    val normal = Normal(docentes.size, estudiantes.size,estudiantes,docentes,"Normal Técnico", 1990, "Privado", "Técnico")
    val instituto = Instituto(docentes.size, estudiantes.size,estudiantes,docentes,"Instituto Tecnológico", 1950, "Público")
    val colegio = Colegio(docentes.size, estudiantes.size,estudiantes,docentes,"Instituto Tecnológico", 1950, "Colegio Nacional", "Tarde")

    //B
    fun buscarInstitucionesEstudiante(estudiante: Estudiante): List<String> {
        val instituciones = mutableListOf<String>()
        if (normal.estudiantes.contains(estudiante)) {
            instituciones.add("normal")
        }
        if (instituto.estudiantes.contains(estudiante)) {
            instituciones.add("instituto")
        }
        if (colegio.estudiantes.contains(estudiante)) {
            instituciones.add("colegio")
        }
        return instituciones
    }

    val estudiante = Estudiante("Juan", 20)
    val institucionesEstudiante = buscarInstitucionesEstudiante(estudiante)
    println("Instituciones en las que está inscrito el estudiante ${estudiante.nombre}: $institucionesEstudiante")

    //C
    fun buscarInstitucionesDocente(docente: Docente): Boolean {
        return normal.docentes.contains(docente) && instituto.docentes.contains(docente) && colegio.docentes.contains(docente)
    }

    val docente = Docente("Pedro", 35)
    val imparteClasesEnTodas = buscarInstitucionesDocente(docente)
    println("El docente ${docente.nombre} imparte clases en las 3 instituciones: $imparteClasesEnTodas")

    // D
    println("Ingrese un año para modificar en el colegio")
    val nuevoAnio = readln().toInt()
    colegio.modificarAnio(nuevoAnio)
}