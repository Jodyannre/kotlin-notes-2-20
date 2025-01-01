package org.kotlin.notes

/* Clase contenedora para tener un fixed número de subclases */

class SealedClass {
    sealed class Staff {
        class Teacher(val numberOfLessons: Int) : Staff()
        class Manager(val Responsibility: String) : Staff()
        object Worker : Staff()
    }

    fun listTheTasks(staff: Staff) = when (staff) {
        is Staff.Teacher -> println("The teacher has ${staff.numberOfLessons} lessons today")
        is Staff.Manager -> println("The manager is doing ${staff.Responsibility} today")
        Staff.Worker -> println("Worker is fixing the projector for profs in CS, all respect to him.")
    }
}


/* example

sealed class Resultado {
    data class Exito(val data: String) : Resultado()
    data class Error(val mensaje: String) : Resultado()
    object Cargando : Resultado()
}

fun procesarResultado(resultado: Resultado) {
    when (resultado) {
        is Resultado.Exito -> println("Éxito: ${resultado.data}")
        is Resultado.Error -> println("Error: ${resultado.mensaje}")
        Resultado.Cargando -> println("Cargando...")
    }
}


fun main() {
    val result = Resultado.Exito("La petición fue exitosa.")

    procesarResultado(result)

}

 */