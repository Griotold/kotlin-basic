package learnclass
/**
 * 상속 학습
 * */
// 상위 클래스는 open 으로 열어줘야 상속이 가능하다.
open class Parent(val familyName: String)

// 1. 방법 1 - 권장
// 코틀린 스타일
class Child(
    val subName: String,
    familyName: String = ""
) : Parent(familyName = familyName)

// 2. 방법 2 - Java 와 비슷하게
// 자주 쓰지는 안씀
class Child2 : Parent {
    private val subName: String

    constructor(subName: String) : this(subName, "")

    constructor(subName: String, familyName: String) : super(familyName) {
        this.subName = subName
    }
}