package guia5.ejemplos.ejemplo3

fun main() {
    val objT = Trabajador(500,"Julio Flores",2000.00,500.00)
    val objD = Docente(501,"Miguel Taboada",150,50.00)
    println("")
    println(objT.salidaTrabajador())
    println(objD.salidaDocente())
}