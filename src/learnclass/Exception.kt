package learnclass

import java.io.IOException

// 코틀린에서는 체크트 익셉션을 던지더라도 메서드 시그니처에 붙이지 않아도 된다.
fun main() {
    try {
        Integer.parseInt("123")
    } catch (e: Exception) {
        throw IOException("Checked Exception")
    } finally {
        println("무조건 실행되는 코드")
    }
}