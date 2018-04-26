class Frined {
    var name: String
    var tel: String
    var type: Int

    constructor(name: String) : this(name, " ", 4) {
    }

    constructor(name: String, tel: String = " ", type: Int = 4) {
        this.name = name
        this.tel = tel
        this.type = if (type < 4) type else 4
    }


}
