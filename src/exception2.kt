class UserException : Throwable()

fun throEx() {
    println("throwEx()함수에서 UserException 예외가 발생됨")
    throw UserException()
}

fun main(args: Array<String>) {
    try {
        throEx()
    } catch (e: UserException) {
        println("예외를 처리하였음")
    }
}