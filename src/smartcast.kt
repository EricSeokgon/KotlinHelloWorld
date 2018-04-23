fun main(args: Array<String>) {
    smartCast("스마트 캐스트 테스트")
}

fun smartCast(t: Any) {
    if (t is String)
        println("t=${t.length}")
    if (t !is String)
        return
    else
        println("t = ${t.length}")

    if (t !is String || t.length == 0)
        return

    if (t is String && t.length > 0)
        println("t =${t.length}")

    when (t) {
        is Int -> println(t + 1)
        is String -> println(t.length + 1)
        is IntArray -> println(t.sum())
    }

}
