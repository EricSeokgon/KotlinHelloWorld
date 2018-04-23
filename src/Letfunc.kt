fun main(args: Array<String>) {
    val userID: String? = getUserID()
    //sendNOtification(userID)
    if (userID != null) sendNotification(userID)
    userID?.let { userID -> sendNotification(userID) }
    userID?.let { sendNotification(it) }

    userID?.let {
        println("$userID 님에게 알림 메시지를 보냈습니다.")
        println("$it 님에게 알림 메시지를 보냈습니다.")
    }

}

fun sendNotification(userID: String) {
    //이 사용자에게 알람 메시지를 보내는 코드를 이곳에 추가한다.
    println("$userID 님에게 알림 메시지를 보냈습니다.")
}

fun getUserID(): String? {
//사용자 id를 입력받는 코드를 이곳에 추가한다.
    return "user01"
}
