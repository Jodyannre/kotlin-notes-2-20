package org.kotlin.notes

operator fun String.unaryMinus() = this.reversed()

fun main() {
    val name = "Kotlin"
    println(-name) // niltoK
}


/* Infix */

infix operator fun String.times(n: Int) = this.repeat(n)
/*
fun main() {
    val s = "Kotlin"
    println(s * 3) //KotlinKotlinKotlin
}
*/


/* Pair */

operator fun Pair<Int, Int>.unaryMinus() = Pair(-first, -second)
operator fun Pair<Int, Int>.inc() = Pair(first + 1, second + 1)

/*
fun main() {
    var p = Pair(1, 2)
    println(-p) // (-1, -2)
    println(++p) // (2, 3)
}
*/


/* Ej-Times*/

operator fun Int.times(n: Int) = this * n * 2