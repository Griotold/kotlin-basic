package learnclass
// sealed class 를 사용하면 새로운 클래스가 추가되었을 때
// 컴파일 에러가 발생하여 유지보수가 수월해진다!
// sealed class 내에 구현체를 넣어줄 수도 있고
// 아래 처럼 같은 파일 내에 넣어줘도 된다.
sealed class Error2

class FileError2(val fileName: String) : Error2()

class DatabaseError2(val dbmsType2: DbmsType2) : Error2()

class RedisError(val host: String) : Error2()

enum class DbmsType2 {
    MYSQL, MARIA
}

fun getErrorMessage2(error2: Error2) = when (error2) {
    is FileError2 -> "Error is occurred at : ${error2.fileName}"
    is DatabaseError2 -> "Error is occurred at : ${error2.dbmsType2}"
    is RedisError -> TODO()
}


