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

    println("a는 ${recognize('a')}")
    println("3는 ${recognize('3')}")
    println("@는 ${recognize('@')}")
}

// in으로 범위검사
fun recognize(c:Char) = when(c) {
    in '0'..'9' -> "숫자"
    in 'a'..'z', in 'A'..'Z' -> "알파벳"
    else -> "숫자도 문자도 아님"
}