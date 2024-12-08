package org.kotlin.notes

/* Smart cast */

fun printLength(obj: Any) {
    if (obj is String) {
        println(obj.length)
    }
}


/* nullable cast */

fun main() {
    val obj: Any = 123
    val str: String? = obj as? String // Safe (nullable) cast operator
    if (str != null) {
        println(str.uppercase())
    }
}






