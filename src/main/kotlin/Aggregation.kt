package org.kotlin.notes

fun main() {
    val names = listOf("John", "Jane", "Mary", "Peter", "John", "Jane", "Mary", "Peter")

    // Grouping by the first letter of the name
    val groupedNames = names.groupBy { it.first() }
    println(groupedNames) // {J=[John, Jane, John, Jane], M=[Mary, Mary], P=[Peter, Peter]}
}

/* With transformation*/
/*
fun main() {
    val names = listOf("John", "Jane", "Mary", "Peter", "John", "Jane", "Mary", "Peter")

    // Grouping by the length of the name and values transformed to uppercase
    val groupedNames2 = names.groupBy(keySelector = { it.length },
        valueTransform = { it.uppercase() })
    println(groupedNames2) // {4=[JOHN, JANE, MARY, JOHN, JANE, MARY], 5=[PETER, PETER]}
}
*/


/* Groupiing by
fun main() {
    val names = listOf("John", "Jane", "Mary", "Peter", "John", "Jane", "Mary", "Peter")

    // Grouping by the first letter and eachCount
    val groupedNames3 = names.groupingBy { it.first() }.eachCount()
    println(groupedNames3) // {J=4, M=2, P=2}

    // Grouping by the first letter and folding (accumulates) the length of the names
    val groupedNames4 = names.groupingBy { it.first() }
        .fold(0) { acc, name -> acc + name.length }
    println(groupedNames4) // {J=16, M=8, P=10}

    // Grouping by length and reducing to the longest name
    // we use "_" because the first parameter is the key, but we don't use it
    val groupedNames5 = names.groupingBy { it.length }
        .reduce { _, acc, name -> if (name.length > acc.length) name else acc }
    println(groupedNames5) // {4=John, 5=Peter}

}
 */


/* Aggregation

fun main() {
    val names = listOf("John", "Jane", "Mary", "Peter", "John", "Jane", "Mary", "Peter")

    // Grouping and using aggregate to get the size of the group
    // we don't use the key, so we use "_"
    val groupedNames6 = names.groupingBy { it.first() }
        .aggregate { _, accumulator: Int?, _, first ->
            if (first) 1 else accumulator!! + 1
        }
    println(groupedNames6) // {J=4, M=2, P=2}

    // Grouping and using aggregate, returning even or odd size according to the size of the group
    val groupedNames7 = names.groupingBy { it.first() }
        .aggregate { _, accumulator: Boolean?, element, first ->
            if (first) element.length % 2 == 0 else accumulator!! && element.length % 2 == 0
        }
    println(groupedNames7) // {J=true, M=true, P=false}

}
 */
