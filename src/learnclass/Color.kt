package learnclass

import learnclass.Color.*

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