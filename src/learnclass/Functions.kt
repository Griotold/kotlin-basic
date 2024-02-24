package learnclass

// 최상위 함수
fun getMyName(
    firstName: String = "foo",
    lastName: String = "bar",         // 맨 끝에도 콤마를 넣어 줄 수 있다.
): String = "$firstName $lastName"

fun main() {
    println(getMyName("Steve", "Jobs"))
    println(getMyName("Jobs", "Steve"))

    // 이름이 있는 파라미터
    println(getMyName(firstName = "Steve", lastName = "Jobs"))
    println(getMyName(lastName = "Jobs", firstName = "Steve"))

    // 디폴트 파라미터
    println(getMyName())
    println(getMyName(firstName = "Steve"))
    println(getMyName(lastName = "Jobs"))

}