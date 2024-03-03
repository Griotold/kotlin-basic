package learnclass
/**
 * Backing Field 학습 - 뒷받침하는 필드
 * */
class Account {
    // 필드 이름이 balance 이지만 getter, setter 내에서는 "field" 로  접근한다
    var balance: Long = 0
        set(value) {
            if (value < 0) throw IllegalStateException("음수 잔액은 불가합니다.")

            field = value
        }

    var accountName: String = ""
        get() = "계좌이름:$field"
}

fun main() {
    val account = Account()
    account.balance = 100
    account.accountName = "급여계좌"
    println("balance : ${account.balance}")
    println("accountName : ${account.accountName}")
}