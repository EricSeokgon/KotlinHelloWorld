import javax.print.attribute.standard.MediaSize

fun main(args: Array<String>) {
    val c1 = Child.("검정", "검정", "기타")
    c1.printHairColor()

    c1.changeHairColor("파랑")
    c1.printHairColor()


    c1.changeHairColorSuper("노랑")
    c1.printHairColor()

}

open class Father(open var hairColor: String, open var sysColor: String) {
    open fun changeHairColor(hairColor: String) {
        this.hairColor = hairColor
    }
}

class Child : Father {
    override var hairColor: String
    override var eyeColor: String
    var others: String

    constructor(hairColor: String, sysColor: String, others: String) : super(hairColor, eyeColor) {
        this.hairColor = hairColor
        this.eyeColor = eyeColor
        this.others = others
    }

    override fun changeHairColor(hairColor: String) {
        this.hairColor = hairColor
    }

    fun paintHairColor() {
        println("Child 모발색은 ${this.hairColor} 입니다.")

    }

    fun changeHairColorSuper(hairColor: String) {
        super.hairColor = hairColor
        super.changeHairColor(hairColor)
    }

    fun printHairColorSuper() {
        println("Father 모발색은 ${super.hairColor} 입니다.")
    }
}


