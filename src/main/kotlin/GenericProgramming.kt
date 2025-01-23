package org.kotlin.notes



class Box<T>(t: T) {

    /* Constructor accepts
    * a variable of "some type"
    * and sets it to a field */

    var value = t  // A field of "some type"
        get() = field
        set(value) {
            field = value;
        }

}


val obj1: Box<Int> = Box<Int>(123)
val obj2: Box<String> = Box<String>("abc")

val obj1 = Box(123)
val obj2 = Box("abc")



class RandomCollection<T>(val items: List<T>) {
    fun get(index: Int): T {
        return items[index]
    }

    fun length(): Int {
        return items.size
    }
}



/* types
val myType = typeOf<Int>()
 */