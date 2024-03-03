package learnclass
/**
 * 생성자 학습
 * */

// 1. 정석적인 방법 -> 권장하지 않음
class User constructor(_userName: String) {
    val userName: String

    init {
        userName = _userName
    }

}

// 2. 중복 생략
class User2(_userName: String) {
    val userName: String = _userName
}

// 3. 최종 버전
class User3(val userName: String)

// 4. named parameter, 필드 기본값
class User4(
    val userName: String,
    val level: Int = 1        // 기본값을 지정!
)
fun main() {
    println(User("Benny").userName)
    println(User2("Paul").userName)
    println(User3("Ted").userName)
    println(User4(userName = "Chani").level)              // 1
    println(User4(userName = "Jayce", level = 3).level)   // 3
}