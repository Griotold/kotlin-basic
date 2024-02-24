package learnclass

interface Clickable {
    fun click():Unit
}

class Button : Clickable {       // 상속이건 구현이건 : 로 통일
    override fun click() {       // override 키워드!
        println("Button is clicked")
    }

    // 얘는 Button 클래스 안에서만 사용 가능
    private fun internalPrint() {
        println("Internal out")
    }
}


fun main() {
    Button().click()
    //    Button.internalPrint()
    privatePrint()
}

// 파일 안에 최상위 private 함수는 파일 안에서 호출 가능
private fun privatePrint() {
    println("Internal out")
}