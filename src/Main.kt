fun sum(a: Int, b: Int): Int {
    return a + b
}

// expression body
fun sum2(a: Int, b: Int) = a + b

fun main() {
    println(sum(1, 2))
    println(sum2(1, 2))
}