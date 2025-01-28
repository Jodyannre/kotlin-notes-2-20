package org.kotlin.notes

open class Book {}
class Magazine : Book() {}
class Stone {}

class Storage<T : Book>() {
    // some code
}

val storage1 = Storage<Book>()
val storage2 = Storage<Magazine>()



/* Not Nullable */

fun <T : String?> elvisLike(first: T, second: T & Any): T & Any = first ?: second

fun main() {
    elvisLike<String>("", "123").length    // Compiles successfully and returns 0

    //elvisLike<String>("", null).length     // Compilation error: 'null' cannot be a value of a non-null type

    elvisLike<String?>(null, "123").length // Compiles successfully and returns 3

    //elvisLike<String?>(null, null).length  // Compilation error: 'null' cannot be a value of a non-null type
}


/* Multiple Bounds */
/*
fun <T> sortByDate(list: List<T>)
        where T : Book, T : Watchable<T> {...}

 */