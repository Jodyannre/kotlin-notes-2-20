package org.kotlin.notes

/* Bolde recibe un valor inicial, reduce toma el primer elemento como inicial */
val list = listOf(1, 2, 3, 4, 5)

var sum = list.fold(0) { acc, i ->
    println("acc: $acc, i: $i, acc + i: ${acc + i}")
    acc + i
}

var sum1 = list.reduce() { acc, i ->
    println("acc: $acc, i: $i, acc + i: ${acc + i}")
    acc + i
}

/* Diferente orden, de derecha a izquierda */
val sum3 = list.foldRight(0) { i, acc -> acc + i }

val sum4 = list.reduceRight { i, acc -> acc + i }

/* Indexado */
val sum5 = list.foldIndexed(0) { index, acc, i ->
    if (index % 2 == 0) acc + i else acc
}
var sum6 = list.reduceIndexed { index, acc, i ->
    if (index % 2 == 0) acc + i else acc
}

/* Con nullables */

val sum7 = emptyList<Int>().fold(0) { acc, i -> acc + i }

val sum8 = emptyList<Int>().reduceOrNull { acc, i -> acc + i } ?: 0 // is null



/* Valores intermedios */

val runningSum = list.runningFold(0) { acc, i -> acc + i }

val runningProduct = list.runningReduce { acc, i -> acc * i }

// with index
val runningSumWithIndex = list.runningFoldIndexed(0) { index, acc, i ->
    if (index % 2 == 0) acc + i else acc
}
val runningProductWithIndex = list.runningReduceIndexed { index, acc, i ->
    if (index % 2 == 1) acc * i else acc
}