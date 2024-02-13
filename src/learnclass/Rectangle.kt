package learnclass

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun main() {
    val rectangle = Rectangle(4, 4)

    println(rectangle.isSquare)
}
