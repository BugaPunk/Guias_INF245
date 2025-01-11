package guia4.ejercicios.paquete02
import guia4.ejercicios.paquete01.Hospital

fun main() {
    val nombres = arrayOf("Juan", "Maria", "Carlos")
    val edades = arrayOf(30, 25, 40)
    val hospital = Hospital("Hospital General", 3, nombres, edades)
    println(hospital.toString())

    val nombres1 = arrayOf("Ronald", "Jorge", "Belen")
    val edades1 = arrayOf(30, 25, 40)
    val hospital1 = Hospital("Hospital Metodista", 3, nombres1, edades1)
    println(hospital1.toString())

    println("===========================")

    println("¿Que paciente desea saber su edad?")
    val buscarPaciente = readln()
    println("Edad de $buscarPaciente: ${hospital.mostrarEdadPaciente(buscarPaciente)}")

    println("¿Que paciente esta buscando?")
    val buscadorPaciente = readln()
    if (buscarPacienteEnHospitales(buscadorPaciente, hospital, hospital1))
        println("El paciente $buscadorPaciente SI esta registrado")
    else
        println("El paciente $buscadorPaciente NO esta registrado")
}

fun buscarPacienteEnHospitales(nombre: String, vararg hospitales: Hospital): Boolean {
    for (hospital in hospitales)
        if (hospital.verificarPaciente(nombre))
            return true
    return false
}