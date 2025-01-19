package org.kotlin.notes

/* Zip */

/*
fun main() {
    val listNumbers = listOf(1, 2, 3, 4, 5)
    val listStrings = listOf("one", "two", "three", "four", "five")

    // Zipping
    val zipped = listNumbers.zip(listStrings)
    println(zipped) // [(1, one), (2, two), (3, three), (4, four), (5, five)]

    // Unzipping
    val unzipped = zipped.unzip()
    println(unzipped) // ([1, 2, 3, 4, 5], [one, two, three, four, five])

    // Zipping with different length
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    // other way to call zip function
    val zippedWithDifferentLength = numbers.zip(listStrings)
    // ignore the rest of numbers
    println(zippedWithDifferentLength) // [(1, one), (2, two), (3, three), (4, four), (5, five)]

    // Zipping with transform
    val zippedWithTransform = numbers.zip(listStrings) { number, string ->
        "$number - $string"
    }
    println(zippedWithTransform) // [1 - one, 2 - two, 3 - three, 4 - four, 5 - five]
}
 */


/* Associate */

/*
fun main() {

    val listStrings = listOf("one", "two", "three", "four", "five")

    // Associate With
    val associatedWith = listStrings.associateWith { it.length }
    println(associatedWith) // {one=3, two=3, three=5, four=4, five=4}

    // Associate By
    val associatedBy = listStrings.associateBy { it.first().uppercase() }
    println(associatedBy) // {O=one, T=three, F=five}

    // Associate with a lambda
    val associatedWithLambda = listStrings.associate {
        it.first().uppercase() to it.length
    }
    println(associatedWithLambda) // {O=3, T=5, F=4}
}
 */


/* joinToString */

/*
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    // joinToString
    val joinToString = numbers.joinToString(
        separator = " ; ",
        prefix = "{ ",
        postfix = " }",
        limit = 3,
        truncated = "..."
    )
    println(joinToString) // { 1 ; 2 ; 3; ... }

    // joinTo appendable
    val joinTo = numbers.joinTo(
        StringBuilder(),
        separator = " ; ",
        prefix = "{ ",
        postfix = " }",
        limit = 3,
        truncated = "..."
    )
    println(joinTo) // {1 ; 2 ; 3...}

}
 */