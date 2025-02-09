
// SAM -> Single Abstract Method
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

fun filter(numbers: List<Int>, predicate: IntPredicate): List<Int> {
    return numbers.filter { predicate.accept(it) }
}

fun main() {
    val isEven = IntPredicate { it % 2 == 0 }
    val evenNumbers = filter(listOf(1, 2, 3, 4), isEven)
    println(evenNumbers) // output: [2, 4]

}