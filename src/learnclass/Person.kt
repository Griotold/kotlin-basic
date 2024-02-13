package learnclass

class Person(val name: String, var age: Int, var isMarried: Boolean)

fun main() {
    val person = Person("Griotold", 30, false)

    println(person.age)
    println(person.name)
    println(person.isMarried)
}
