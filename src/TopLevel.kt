fun main(args: Array<String>) {
    printCount(1, 100)
    println("합계 = $count")
}

fun printCount(from: Int, to: Int) {
    for (i in from..to) {
        count += 1
    }
}

var count = 0

val TAB1 = "\t"
const val TAB2 = "\t"
