package org.kotlin.notes

var names: String? = "Kotlin"
val length: Int? = names?.length
val result = length ?: 0