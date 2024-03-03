package learnclass
/**
 * Object : Util 클래스를 만들때 사용하면 유용하다.
 * 언어 차원에서 싱글톤 패턴을 제공
 * */
// Object 라고 선언하면 static 키워드가 필요가 없다.
object NumberUtils {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}

// data : 롬복의 @Data 와 유사
data class Child3(val subName: String, val familyName: String, val age: Int) {

    // Java 의 static method 를 대체하는 용도
    // 모든 Child3 가 공유할 수 있는 녀석
    // 상수 + 팩토리 생성자
    companion object {
        const val MAX_CHILDREN_COUNT = 4
        fun ofDefaultAge(
            subName: String,
            familyName: String
        ): Child3 = Child3(subName, familyName, 0)
    }
}


fun main() {
    println(NumberUtils.sum(1, 2))
    println(Child3.ofDefaultAge("Snow", "John"))
}