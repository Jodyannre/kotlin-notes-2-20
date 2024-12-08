package org.kotlin.notes

/* Default constructor */

class nueva {
    var name: String = "Unknown"
    var age: Int = 0
    var height: Double = 0.0
}

/* Primary constructor */

class nueva2(name: String, age:Int) {
    var name: String = name
    var age: Int = age
}

data class nueva3(val name: String, val age:Int) {
}

/* Secondary constructor */
class nueva4 {
    val name: String
    val age: Int

    init {
        println("Creating class")
    }

    constructor(name: String,age:Int) {
        this.name = name
        this.age = age
    }
}

/* Constructor delegation */

class nueva5(val name: String, age:Int) {

    constructor(age:Int,name:String): this(name,age) {

    }
}

/* Override constructor */

open class Person(open val name: String)

class Employee(override val name: String, val id: Int) : Person(name)


/* Inheritance */

open class A(name:String) {

}

class B(val name:String):A(name){

}

/* Implement*/

interface C
interface D

class E: C, D {

}


/* Nested class */

class Superhero {
    class MagicCloak {
    }

    class Hammer {
    }
}


/* Inner class - can access parent class data*/
class Cat(val name: String) {
    inner class Bow(val color: String) {
        fun printColor() {
            println("The cat named $name has a $color bow.")
        }
    }
}


