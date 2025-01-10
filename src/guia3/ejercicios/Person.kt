package guia3.ejercicios

class Person {
    var nombre: String = ""
    var paterno: String? = null
    var materno: String? = null

    constructor(_nombre: String, _paterno:String="", _materno:String="") {
        this.nombre = _nombre
        this.paterno = _paterno
        this.materno = _materno
    }

    constructor(_nombre: String, _paterno:String="") {
        this.nombre = _nombre
        this.paterno = _paterno
        this.materno = ""
    }

    fun imprimir(objP: Person) {
        println("\nNombre: $nombre \nPaterno: $paterno \nMaterno: $materno")
        println("\nNombre: ${objP.nombre} \nPaterno: ${objP.paterno} \nMaterno: ${objP.materno}")
    }
}

fun main() {
    println("Ingrese nombre")
    val nombre = readln()
    println("Ingrese apellido paterno")
    val apaterno = readln()
    println("Ingrese apellido materno")
    val amaterno = readln()
    val objP1 = Person(_nombre = nombre, _paterno = apaterno, _materno = amaterno)
    objP1.imprimir(objP1)

    println("========================================")

    println("Ingrese nombre")
    val nombre1 = readln()
    println("Ingrese apellido paterno")
    val apaterno1 = readln()
    val objP2 = Person(nombre1, apaterno1)
    objP2.imprimir(objP2)
    println("========================================")

    println("Ingrese nombre")
    val nombre2 = readln()
    println("Ingrese apellido materno")
    val amaterno2 = readln()
    val objP3 = Person(_nombre = nombre2, _materno = amaterno2)
    objP3.imprimir(objP3)
}