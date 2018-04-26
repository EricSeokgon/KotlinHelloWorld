class Frined(var name: String, var tel: String, var type: Int = 4) {
    init {
        this.type = if (type < 4) type else 4 // 1:"학교", 2:"회사", 3:"SNS", 4:"기타"
    }
}

fun main(args: Array<String>) {
    val frined1 = Frined("홍길동", "010-1234-5678")
    println(frined1.type)

    val frined2 = Frined("깁성달", "010-2345-6788", 3)
    println(frined2.type)

    val frined3 = Frined("깁성달", "010-2345-6788", 5)
    println(frined2.type)
}