fun main(args: Array<String>) {
    pro1 += pro2
    print(pro1)

    val f1 = myFriend("홍길동", "010-123-4567", 3)
    f1.type = 2
    println("${f1.name}, ${f1.tel}, $[f1.ytpe")
}

var pro1 = 100
val pro2 = 200

class myFriend(var name: String, var tel: String, var type: Int) {

    init {
        this.type = if (type < 4) type else 4
    }

}


