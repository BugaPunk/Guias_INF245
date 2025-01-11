package guia4.ejercicios.paquete01

class Hospital(var nombreHospital: String, var nroPacientes: Int, var nombres: Array<String>, var edades: Array<Int>) {

    fun mostrarEdadPaciente(nombre: String): Int? {
        for (i in 0 until nroPacientes) {
            if (nombres[i] == nombre) {
                return edades[i]
            }
        }
        return null
    }

    fun verificarPaciente(nombre: String): Boolean {
        for (i in 0 until nroPacientes) {
            if (nombres[i] == nombre) {
                return true
            }
        }
        return false
    }

    override fun toString(): String {
        return "\nNombre del Hospital='$nombreHospital'\nNro de Pacientes=$nroPacientes\nNombres=${nombres.contentToString()}\nEdades=${edades.contentToString()}"
    }
}