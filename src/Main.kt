val i: Int = 123
val j = 321
var age = 26


fun sum(a: Int, b: Int): Int {
    return a + b
}

// expression body
fun sum2(a: Int, b: Int) = a + b

fun main() {
    age = 25
    print("age is ${sum(age, 3)}")
}