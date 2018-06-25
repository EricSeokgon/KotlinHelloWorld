data class FriendMine(val name: String, val age: Int, val tel: String) //#1

val friend = listOf(FriendMine("김선달", 30, "010-123-4567"),
        FriendMine("홍길동", 28, "010-234-5678"),
        FriendMine("전신주", 27, "010-345-6789"),
        FriendMine("황토길", 30, "010-456-7890"),
        FriendMine("박문수", 33, "010-567-8901"))

fun findHong(friendList: List<FriendMine>) {
    for (friend in friendList) {
        if (friend.name.substring(0, 1) == "황") {
            println("홍씨를 찾았음")
            return
        }
    }
    println("홍씨 찾기가 종료됨")
}

fun findPark(fr: List<FriendMine>) {
    fr.forEach {
        if (it.name.substring(0, 1) == "박") {
            println("박씨를 찾았음")
            return
        }
    }
    println("박씨 찾기가 종료됨")
}

fun findHwang(fr: List<FriendMine>) {
    fr.forEach here@{
        if (it.name.substring(0, 1) == "박") {
            println("황씨를 찾았음")
            return@here
        }
    }
    println("황씨 찾기가 종료됨")
}

fun main(args: Array<String>) {
    findHong(friend)
    findPark(friend)
    findHwang(friend)
}