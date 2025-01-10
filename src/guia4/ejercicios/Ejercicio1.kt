package guia4.ejercicios

fun main() {
    println("Ingrese el nro de pacientes:")
    val numPacientes = readln().toInt()

    val nombres = ArrayList<String>()
    val generos = ArrayList<String>()
    val edades = ArrayList<Int>()

    for (i in 1..numPacientes) {
        println("$i.- Ingrese el nombre del paciente: ")
        val nombre = readln()
        nombres.add(nombre)

        println("$i.- Ingrese el genero del paciente: ")
        val genero = readln()
        generos.add(genero)

        println("Ingrese la edad del paciente $i:")
        val edad = readln().toInt()
        edades.add(edad)
    }

    println("Pacientes con edad mayor a 60 años son....")
    for (i in 0 until numPacientes) {
        if (edades[i] > 60) {
            println("Nombre: ${nombres[i]}, Género: ${generos[i]}, Edad: ${edades[i]}")
        }
    }

    println("Ingrese el nombre del paciente para mostrar su edad:")
    val nombreBuscar = readln()
    for (i in 0 until numPacientes) {
        if (nombres[i] == nombreBuscar) {
            println("La edad del paciente $nombreBuscar es: ${edades[i]}")
            break
        }
    }
}