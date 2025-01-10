package guia3.ejercicios
// realizar un una class poo para la clase Estudiante, paterno materno, nombre de la materia, materia y su nota, escribir
// los métodos para mostrar los datos instanciar 2 estudiantes
class Estudiante {
    private var aPaterno: String = ""
    private var aMaterno: String = ""
    private var nombreM: String = ""
    private var nota: Int = 0

    fun inicializar (aPaterno: String, aMaterno: String, nombreM: String, nota: Int) {
        this.aPaterno = aPaterno
        this.aMaterno = aMaterno
        this.nombreM = nombreM
        this.nota = nota
    }

    override fun toString(): String {
        return "Estudiante:\nApellido Paterno='$aPaterno'\n Apellido Materno='$aMaterno'\n Nombre de la Materia='$nombreM'\n NOTA=$nota"
    }
}


fun main() {
    println("Ingrese Apellido Paterno")
    val paterno: String = readln()
    println("Ingrese Apellido Materno")
    val materno: String = readln()
    println("Ingrese nombre de la materia")
    val nombreM: String = readln()
    println("Ingrese nota")
    val nota: Int = readln().toInt()

    println("======================")

    println("Ingrese Apellido Paterno")
    val paterno2: String = readln()
    println("Ingrese Apellido Materno")
    val materno2: String = readln()
    println("Ingrese nombre de la materia")
    val nombreM2: String = readln()
    println("Ingrese nota")
    val nota2: Int = readln().toInt()

    val objP = Estudiante()
    objP.inicializar(paterno, materno, nombreM, nota)
    println(objP.toString())
    println("======================")
    val objP2 = Estudiante()
    objP2.inicializar(paterno2, materno2, nombreM2, nota2)
    println(objP2.toString())
    
}