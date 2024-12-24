package org.kotlin.notes

class Message(var text: String, var next: Message? = null) { }

class MessageBox(var head: Message, var tail: Message = head) : Iterable<Message> {

    init {
        if (tail != head) {
            head.next = tail
        }
    }

    fun add(newMessage: Message) {
        tail.next = newMessage // change 'next' pointer of the former last element to a new message
        tail = newMessage // new message becomes a new tail
    }

    override fun iterator(): Iterator<Message> {
        return MessageBoxIterator(this)
    }
}

class MessageBoxIterator(messageBox: MessageBox) : Iterator<Message> {

    private var current: Message = Message("EMPTY_PRE_HEAD", next = messageBox.head)

    override fun hasNext(): Boolean {
        return current.next != null
    }

    override fun next(): Message {
        if (current.next == null) throw NoSuchElementException()

        current = current.next!!
        return current
    }
}



fun main() {
    val animals = setOf("dog", "cat", "snake", "mouse")
    var animalsIterator = animals.iterator();
    for(animal in animals){
        println(animal)
    }
    while (animalsIterator.hasNext()) {
        print("${animalsIterator.next()} ")
    }
    animalsIterator.next()
}