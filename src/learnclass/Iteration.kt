package learnclass

fun main() {
    val students = mutableMapOf<Int, String>()

    students[1] = "Jack"
    students[2] = "Diana"
    students[3] = "Frost"

    for (c in students) {
        println("번호:${c.key}, 이름:${c.value}")
    }

    // 구조 분해
    for ((num, name) in students) {
        println("번호:${num}, 이름:${name}")
    }

    // immutable Map 선언 - 실무에서 많이 쓰는 방식
    val st = mapOf(
        1 to "Jack",
        2 to "Diana",
        3 to "Frost"
    )
}