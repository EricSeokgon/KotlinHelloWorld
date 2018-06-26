fun parseInt(value: String): Int {
    return value.toInt()
}

fun main(args: Array<String>) {
    var err: Int? = 100

    try {
        err = parseInt("7A")
    } catch (e: Exception) {
        err = 0
    } catch (e: NumberFormatException) {
        err = null
    }
    println(err)
}