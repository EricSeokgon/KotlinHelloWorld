fun calcTotal(from: Int, to: Int): Int {
    var total: Int = 0
    val lambda = there@{ f: Int, t: Int ->
        for (i in f..t) {
            total += i
        }
        return@there
    }
    lambda(from, to)

    return total
}

fun main(args: Array<String>) {
    println("1부터 100까지의 합계는 ${calcTotal(1, 100)}입니다.")
}