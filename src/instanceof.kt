fun main(args: Array<String>) {

    open class A {}
    class B : A() {}

    val x = B()
    if (x is A) {
        println("A 타입임")
    } else {
        println("A 타입이 아님")
    }
    if (x is B) {
        println("B 타입임")
    } else {
        println("B 타입이 아님")
    }
}