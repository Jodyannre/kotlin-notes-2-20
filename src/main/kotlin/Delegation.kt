package org.kotlin.notes

interface Greeter {
    fun greet(name:String)
}

class Person2(val name:String, val greeter: Greeter): Greeter by greeter {
}

class EnglishGreeter: Greeter {
    override fun greet(name:String) {
        println("Hello my name is: $name")
    }
}

class SpanishGreeter(): Greeter {

    override fun greet(name: String) {
        println("Hola my nombre es: $name")
    }
}



fun main() {
    val englishGreeter = EnglishGreeter()
    val spanishGreeter = SpanishGreeter()

    val person = Person2("John", englishGreeter)
    val person2 = Person2("Joan", spanishGreeter)

    person.greet(person.name)
    person2.greet(person.name)

}