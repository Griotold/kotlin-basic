package learnclass
/**
 * // 컴파일러 입장에서는 에러가 2개 뿐이 없다는 걸 모르기 때문에
 * // else 절을 추가해줘야만 한다!
 * // 이 문제를 sealedClass 를 사용하면 편리하다
 * */
interface Error

class FileError(val fileName:String) : Error

class DatabaseError(val dbmsType:DbmsType) : Error

enum class DbmsType {
    MYSQL, MARIA
}

// 컴파일러 입장에서는 에러가 2개 뿐이 없다는 걸 모르기 때문에
// else 절을 추가해줘야만 한다!
// 이 문제를 sealedClass 를 사용하면 편리하다
fun getErrorMessage(error: Error) = when (error) {
    is FileError -> "Error is occurred at : ${error.fileName}"
    is DatabaseError -> "Error on DBMS : ${error.dbmsType}"
    else -> throw IllegalArgumentException("Unknown type")
}
