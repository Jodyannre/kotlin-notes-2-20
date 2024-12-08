package org.kotlin.notes

fun main() {
    list@listOf(1, 2, 3, 4).forEach {
        if (it == 3) return@forEach
        println(it)
    }
}
