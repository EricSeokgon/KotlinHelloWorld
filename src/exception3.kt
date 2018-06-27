class UserException2 : Throwable {
    constructor() {}
    constructor(msg: String) : super(msg) {}
}

fun throwEx2() {
    println("throwEx2() 함수에서 UserException2 예외가 발생됨")
    throw UserException2()
}

fun throwEx3() {
    println("throwEx3() 함수에서 UserException2 예외가 발생됨")
    throw UserException2("이 예외는 사용자 예외임")
}

fun main(args: Array<String>) {
    try {
        throwEx2()
    } catch (e: UserException2) {
        e.printStackTrace()
    }

    try {
        throwEx3()
    } catch (e: UserException2) {
        e.printStackTrace()
    }
}