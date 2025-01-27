package org.kotlin.notes

/*
By marking the measureTimeMillis function as inline, the Kotlin compiler will
replace any calls to this function with the actual code inside the function
body at compile time. This means that there will be no function call overhead
at runtime, which can be beneficial for performance-critical code.


 since the code of an inline function is inserted directly into the calling code,
 there is no need to create an additional function object, which reduces the
 overhead of function calls.

 Reduction of memory usage: the inline function avoids the creation of a function
 object and its closure object, which leads to a smaller memory footprint
 */

inline fun measureTimeMillis(block: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    block()
    return System.currentTimeMillis() - startTime
}

fun main() {
    val time = measureTimeMillis {
        // do some time-consuming operation
        Thread.sleep(1000)
    }
    println("Time taken: $time milliseconds")
}



/* reified */

/* reified is a keyword in Kotlin that is used to mark a type parameter as being
available at runtime. In other words, reified type parameters are those that are
not erased by the compiler but, instead, retain their type information at runtime.
 */

inline fun <reified T> printType() {
    println(T::class.qualifiedName)
}



