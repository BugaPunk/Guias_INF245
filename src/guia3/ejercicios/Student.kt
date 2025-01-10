package guia3.ejercicios

class Student {
    var aPaterno: String = ""
    var aMaterno: String = ""
    var nombre: String = ""
    var nombreM: String = ""
    var nota: Int = 0

    constructor(aPaterno: String, aMaterno: String, nombre: String, nombreM: String, nota: Int) {
        this.aPaterno = aPaterno
        this.aMaterno = aMaterno
        this.nombre = nombre
        this.nombreM = nombreM
        this.nota = nota
    }

    fun imprimir(objStd: Student) {
        println("\nApellido Paterno: ${objStd.aPaterno}" +
                "\nApellido Materno: ${objStd.aMaterno}" +
                "\nNombre de la materia: ${objStd.nombreM}" +
                "\nNota: ${objStd.nota}")
    }
}

fun encontrarEstudianteConNotaMayor(estudiantes: List<Student>): Student? {
    var estudianteConNotaMayor: Student? = null
    var notaMayor = 0

    for (estudiante in estudiantes) {
        if (estudiante.nota > notaMayor) {
            notaMayor = estudiante.nota
            estudianteConNotaMayor = estudiante
        }
    }

    return estudianteConNotaMayor
}

fun verificarMateria(estudiantes: List<Student>): Boolean {
    val materia = estudiantes[0].nombreM
    for (estudiante in estudiantes) {
        if (estudiante.nombreM != materia) {
            return false
        }
    }
    return true
}

fun main() {
    val estudiantes = listOf(
        Student("Choque", "Sillo", "Ronald", "BD2", 100),
        Student("Barrientos", "Gabriel", "Chris", "Ing Software", 80),
        Student("Tarqui", "Mamani", "Carlos", "Ing Software", 90)
    )
    println("===========================")
    for (estudiante in estudiantes) {
        estudiante.imprimir(estudiante)
    }
    println("===========================")
    val estudianteConNotaMayor = encontrarEstudianteConNotaMayor(estudiantes)

    if (estudianteConNotaMayor != null) {
        println("El estudiante con la nota mayor es: ${estudianteConNotaMayor.nombre} ${estudianteConNotaMayor.aPaterno} ${estudianteConNotaMayor.aMaterno}")
        println("Nota: ${estudianteConNotaMayor.nota}")
    } else {
        println("No se encontraron estudiantes")
    }
    println("===========================")
    val mismaMateria = verificarMateria(estudiantes)

    if (mismaMateria) {
        println("Todos los estudiantes están cursando la misma materia")
    } else {
        println("No todos los estudiantes están cursando la misma materia")
    }
}