package org.kotlin.notes

/* Creaction of sequences*/

val sequenceOfStrings = sequenceOf("one", "two", "three", "four")
val sequenceOfInts = sequenceOf(1, 2, 3, 4)

/* Convert any collection to a sequence */

val listOfStrings = listOf("one", "two", "three", "four")
val listOfInts = listOf(1, 2, 3, 4)

val sequenceOfStrings2 = listOfStrings.asSequence()
val sequenceOfInts2 = listOfInts.asSequence()


/* From a function to a sequence */

val sequenceOfEvenNumbers = generateSequence(1) { it + 1 }
    .filter { it % 2 == 0 }
    .take(5)
//println(sequenceOfEvenNumbers.toList()) // [2, 4, 6, 8, 10]


/* with yield */

val evenNumbersSequence = sequence {
    yield(2) // return 2 and suspend the function
    yieldAll(listOf(4, 6)) // return 4 and 6 and suspend the function
    yieldAll(generateSequence(8) { it + 2 }) // generate an infinite sequence of even numbers starting at 8
}
//println(evenNumbersSequence.take(5).toList()) // [2, 4, 6, 8, 10]



