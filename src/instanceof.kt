fun main(args: Array<String>) {
    val b: String = "코틀린을 배우자"
    if (b is String) {
        println("String 타입임")
    } else {
        println("String 타입이 아님")
    }
}