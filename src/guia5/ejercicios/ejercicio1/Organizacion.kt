package guia5.ejercicios.ejercicio1
// Clase principal: Organización
open class Organizacion(
    val nroDocentes: Int,
    val nroEstudiantes: Int,
    val estudiantes: List<Estudiante>,
    val docentes: List<Docente>
) {

}

class Docente(val nombre: String, val edad: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Docente

        if (nombre != other.nombre) return false
        if (edad != other.edad) return false

        return true
    }
}

class Estudiante(val nombre: String, val edad: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Estudiante

        if (nombre != other.nombre) return false
        if (edad != other.edad) return false

        return true
    }
}
