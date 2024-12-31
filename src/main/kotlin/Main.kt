package org.kotlin.notes

fun main() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    map.forEach { key, value -> println("$key -> $value") }

}


sealed class Error(var message: String) {
    class NetworkError : Error("Network failure")
    class DatabaseError : Error("Database cannot be reached")
    class UnknownError : Error("An unknown error has occurred")
}