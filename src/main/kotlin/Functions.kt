package org.kotlin.notes

/* Lambda*/

val mul2 = { a: Int, b: Int -> a * b }
val dec2: (Int) -> Int = {x -> x.dec()}
val operatorAdd2: (Int, Int) -> Int = {x: Int, y: Int -> x + y}

/* Syntactic sugar */

fun isNotDot(c: Char): Boolean = c != '.'
val originalText = "I don't know... what to say..."
val textWithoutDots = originalText.filter(::isNotDot)
// originalText.filter({ c -> c != '.' })


/* Extension functions */

fun Int.print():Unit = println(this)


/* Function references */
val dec: (Int) -> Int = Int::dec
fun add(x: Int, y: Int) = x + y
val operatorAdd: (Int, Int) -> Int = ::add


/* Scope functions */
/*
    Apply
    Also

    With
    Let
    Run

    1. apply and also return context objects.

2. let, run, and with return a lambda result.
 */


/* Infix functions */

infix fun Int.add(x: Int): Int = this + x

fun main() {
    println(1.add(2)) // result is 3 as extension function
    println(1 add 2)  // result is 3 as infix function
}


/* Lambda with receiver */

// Safe Builder String with Lambda with receiver
fun myString(init: StringBuilder.() -> Unit): String {
    return StringBuilder().apply(init).toString()
}

fun main2() {
    val str = myString {
        this.append("Hello, ".uppercase())
        append("World!")
    }
    println(str) // HELLO, World!
}



/*
data class TreeNode(val value: String) {
    val children = mutableListOf<TreeNode>()

    fun addChild(child: TreeNode) {
        children.add(child)
    }

    fun parent(): TreeNodeBuilder {
        return TreeNodeBuilder(root)
    }
}

class TreeNodeBuilder(private val root: TreeNode? = null) {
    private val currentNode: TreeNode

    init {
        currentNode = if (root != null) {
            root
        } else {
            TreeNode("")
        }
    }

    fun value(value: String): TreeNodeBuilder {
        val node = TreeNode(value)
        currentNode.addChild(node)
        return this
    }

    fun child(): TreeNodeBuilder {
        val childBuilder = TreeNodeBuilder(currentNode)
        currentNode.addChild(childBuilder.build())
        return childBuilder
    }

    fun parent(): TreeNodeBuilder {
        if (root != null) {
            return TreeNodeBuilder(root)
        } else {
            throw IllegalStateException("Cannot go back to parent node. Already at the root.")
        }
    }

    fun build(): TreeNode {
        return currentNode
    }
}

fun buildTree(): TreeNodeBuilder {
    return TreeNodeBuilder()
}

fun main() {
    val tree = buildTree()
        .value("Root")
        .child()
            .value("Child 1")
            .child()
                .value("Grandchild 1.1")
            .parent()
            .child()
                .value("Grandchild 1.2")
            .parent()
        .parent()
        .child()
            .value("Child 2")
            .child()
                .value("Grandchild 2.1")
            .parent()
        .build()

    printTree(tree)
}

fun printTree(node: TreeNode, level: Int = 0) {
    val indentation = "  ".repeat(level)
    println("$indentation${node.value}")
    for (child in node.children) {
        printTree(child, level + 1)
    }
}
 */


