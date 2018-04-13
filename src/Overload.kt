fun main(args: Array<String>) {
    val m1 = Score(100, 200)
    val m2 = Score(300, 400)
    println(m1 + m2)
    println(m1 * m2)

    var a: Int = 0
    var b: Int = 100
    println("++a = ${++a}, b-- = ${b--}")
    println("++a = ${++a}, b-- = ${b--}")

}

data class Score(val a: Int, val b: Int) {
    operator fun plus(other: Score): Score {
        return Score(a + other.a, b + other.b)

    }

}

operator fun Score.times(other: Score): Score {
    return Score(a * other.a, b * other.b)
}

operator fun Score.unaryMinus(): Score {
    return Score(-a, -b)

}