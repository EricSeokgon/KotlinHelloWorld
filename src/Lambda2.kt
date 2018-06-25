import java.lang.invoke.SerializedLambda

fun runLambda(lambda: (Int, Int) -> Int): Int {
    val lambdaList = ArrayList<(Int, Int) -> Int>() //#1
    lambdaList.add(lambda) //#2
    val a = lambdaList.get(0) //#3
    return a(10, 20) //#4
}

fun main(args: Array<String>) {
    val sum9 = { x: Int, y: Int -> x + y }  //#5

    println("List의 람다식을 실행한 합계는 ${runLambda(sum9)}")  //#6

}