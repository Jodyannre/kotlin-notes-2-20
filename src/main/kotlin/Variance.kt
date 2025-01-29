/* Invariance */

/*
This is the default mode, in which you can both produce and consume values.
 */

open class Animall
class Dog : Animal()
class Cat : Animal()

// Box class defined as invariant
class Box<T>

// Invariance with MutableList
// MutableList is defined as MutableList<T> in Kotlin, it's invariant.
// You can produce and consume values (get() and add()).
// Meaning you can't use a MutableList<Dog> where a MutableList<Animal> is expected and vice versa.
//val mutableAnimalsFromDogs: MutableList<Animal> = mutableListOf<Dog>() // This will give a compiler error
//val mutableDogsFromAnimals: MutableList<Dog> = mutableListOf<Animal>() // This will give a compiler error

// Invariance with Box
// Box is defined as Box<T> in Kotlin, it's invariant.
// Meaning you can't use a Box<Dog> where a Box<Animal> is expected and vice versa.
//val boxOfAnimalsFromDogs: Box<Animal> = Box<Dog>() // This will give a compiler error
//val boxOfDogsFromAnimals: Box<Dog> = Box<Animal>() // This will give a compiler error



/* Covariance */

/*
is only used in "output" positions, but not in "input"
positions, for example, in the return types of methods.
 */

// Box class defined as covariant
class Box2<out T>

// Now, you can use Box<Dog> wherever Box<Animal> is expected.
val dog: Dog = Dog()
val dogBox: Box2<Dog> = Box2<Dog>()
val animalBox: Box2<Animal> = dogBox // This is okay



/* Contravariance */

/*
is only used in "input" positions, but not in "output"
positions, for example, in the parameters of methods.
 */

class Box3<in T>

val animal: Animal = Dog()
val animalBox2: Box3<Animal> = Box3<Animal>()
val dogBox2: Box3<Dog> = animalBox2 // This is okay



/* use type variance */

fun copyAnimals(source: MutableList<out Animal>, destination: MutableList<in Animal>) {
    destination.addAll(source)
}

fun main() {
    val dogs: MutableList<Dog> = mutableListOf(Dog(), Dog())
    val cats: MutableList<Cat> = mutableListOf(Cat(), Cat())

    val animals: MutableList<Animal> = mutableListOf()

    copyAnimals(dogs, animals)
    copyAnimals(cats, animals)

    println(animals)
}


/* Star projection */

/*
Star projection is a special syntax that allows you to use a type parameter
in a position where a type argument is expected. For example, you can use
a type parameter in a return type position, or in a parameter position.
 */
class Box4<T>(val item: T)

fun printItems(boxes: List<Box4<*>>) {
    for (box in boxes) {
        println(box.item)
    }
}

fun main3() {
    val dogBox = Box4(Dog())
    val catBox = Box4(Cat())

    val boxes: List<Box4<*>> = listOf(dogBox, catBox)

    printItems(boxes)
}



/* Full example */

/*

open class Animal {
    fun feed() = println("The animal is fed")
}

class Dog : Animal() {
    fun pet() = println("The dog is petted")
}

class Cat : Animal() {
    fun ignore() = println("The cat ignores you")
}

class Box<in T, out R>(private var t: T, private val r: R) {
    fun put(t: T) {
        this.t = t
    }

    fun take(): R {
        return r
    }
}

fun main() {
    val dogBox: Box<Animal, Dog> = Box(Dog(), Dog())
    dogBox.put(Cat())  // OK: Cat is a subtype of Animal
    val dog: Dog = dogBox.take()  // OK: take() returns Dog

    val catBox: Box<Dog, Animal> = Box(Dog(), Cat())
    // Error: Can't put Cat in Box<Dog, Animal>
    // catBox.put(Cat())
    val animal: Animal = catBox.take()  // OK: take() returns Animal
}

 */


