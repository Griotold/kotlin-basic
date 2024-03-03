package learnclass
/**
 * setter 감추기
 * */
class Account2 {
    var balance: Long = 0
        private set

    var accountName: String = ""
        get() = "계좌이름:${field}"

    fun increaseBalance(value: Int) {
        this.balance += value
    }

    // setter 를 막아두고 이름을 명확하게 함으로 의도를 드러내자
    fun decreaseBalance(value: Int) {
        this.balance -= value
    }
}

fun main() {
    val account2 = Account2()
    // account2.balance = 100 // 컴파일 에러! setter 가 private 이기 때문에

    account2.increaseBalance(200)
    account2.accountName = "급여계좌"

    println("balance : ${account2.balance}, name : ${account2.accountName}")

}