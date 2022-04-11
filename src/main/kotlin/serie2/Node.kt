package serie2

class Node<E> {
    var previous: Node<E>? = null
    var next: Node<E>? = null
    var value: E? = null

    constructor() {}
    constructor(e: E) {
        value = e
    }
}
