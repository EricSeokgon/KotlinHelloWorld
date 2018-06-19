//전형적인 형태의 함수
fun sum1(a: Int, b: Int): Int {
    return a + b
}

//코틀린 특유의 대입문 형태의 저읭된 함수
fun sum2_1(a: Int, b: Int): Int = a + b

fun sum2_2(a: Int, b: Int) = a + b

//익명 함수로 정의된 함수 #1(함수 타입이 지정됨)
val sum3_1: (Int, Int) -> Int = fun(x: Int, y: Int): Int { return x + y }
val sum3_2: (Int, Int) -> Int = fun(x, y): Int { return x + y }
val sum3_3: (Int, Int) -> Int = fun(x, y) = x + y

//익명 함수로 저으이된 함수 #2(함수 타입이 생략됨)
val sum4_1 = fun(x: Int, y: Int): Int { return x + y }
val sum4_2 = fun(x: Int, y: Int) = x + y

// 람다식으로 정의된 함수 #1(함수 타입이 지정됨)
val sum5: (Int, Int) -> Int = { x, y -> x + y }