package learnclass

import learnclass.Color.*
import java.lang.RuntimeException

enum class Color {
    RED, ORANGE, YELLOW, GREEN, BLUE
}

fun main() {
    println(getKoreanColorName(RED))
}

fun getKoreanColorName(color: Color):String = when(color){
    RED, ORANGE -> "빨강 or 오렌지"
    YELLOW -> "노랑"
    GREEN -> "녹색"
    BLUE -> "파랑"
}

fun mix(c1:Color, c2:Color) =
    when {
        c1 == RED && c2 == YELLOW -> "오렌지"
        c1 == YELLOW && c2 == BLUE -> "녹색"
        else -> throw RuntimeException()
    }

