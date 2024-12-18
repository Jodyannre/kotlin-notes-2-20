package org.kotlin.notes

fun main() {
    val map = mapOf(1 to "one", 2 to "two", 3 to "three")

    map.forEach { key, value -> println("$key -> $value") }

}