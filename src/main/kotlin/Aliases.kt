typealias Kitten = Pet.Kitten
class Pet {
    class Kitten(name: String) {
        var kittenName = name
        fun getName(): String {
            return kittenName
        }
    }
}

fun main() {
    var kitten: Kitten = Kitten("Fluffy")
    println(kitten.getName()) // Fluffy
    println(kitten.getName().length) // 6
}



/* With generics */

typealias DessertBox<T> = BoxForSomeDessert<T>

class BoxForSomeDessert<T>(var dessert: T) {
    fun getDessertFromBox(): T {
        return dessert
    }
}

class Tart(var name: String) {}

fun main2() {
    var tartBox = DessertBox(Tart("tastytart"))
    println(tartBox.getDessertFromBox().name) // tastytart
}

