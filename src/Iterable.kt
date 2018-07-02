fun main(args: Array<String>) {
    var ar = listOf(0, 1, 2, 3, 4, 5, 6)
    val num = ar.iterator()
    var item: Int
    while (num.hasNext()) {
        item = num.next()
        print("$item")

    }
    println()

    for (item in ar) {
        print("$item")
    }

}