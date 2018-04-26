class Frined(var name: String, var tel: String, var type: Int) {
    init {
        this.type = if (type < 4) type else 4
    }

}