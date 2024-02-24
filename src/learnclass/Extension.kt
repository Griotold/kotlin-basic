package learnclass
/**
 * 확장 함수
 * */
// fun double(str:String) = str + str 와 동일
fun String.double() = this + this

fun main() {
    println("TTOO".double())

    // 이미 구현된 Collection.kt의 확장 함수
    println(setOf(1, 3, 4, 522, 34, 5).maxOrNull())

    println("My name is " add "Snow")

    println(
        mapOf(
            "key" to "Value",
            "key2" to "Value2"
        )
    )

    // 구조 분해
    val (firstName, lastName) = Pair("Snow", "Man")

    // 구조 분해 2
    mapOf(
        "key" to "Value",
        "key2" to "Value2"
    ).forEach {
        (key, value) -> println("${key} : ${value}")
    }
}

// 중위 함수 키워드 : infix
infix fun String.add(postfix: String) = this + postfix

