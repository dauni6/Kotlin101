package chap05.section1

class Bird2 {
    //property
    var name: String
    var wing: Int
    var beak: String
    var color: String
    
    //부생성자
    constructor(_name: String, _wing: Int, _beak: String, _color: String) {
        name = _name //_(언더바) 있으면 어짜피 이름이 달라서 this 가 필요없다.
        wing = _wing
        this.beak = _beak
        this.color = _color
    }

    constructor(_name:String, _color: String) {
        name = _name
        color = _color
        wing = 2 //빠진 부분은 반드시 초기화 해줘야함
        beak = "short"
    }

    fun fly() = println("Fly $wing")
    fun sing(vol: Int) = println("Sing $vol")
}

fun main() {
    val coco = Bird2("charming", 2, "short", "blue")
    val coco2 = Bird2("hally", "dark")
    coco.color = "yellow"

    println(coco)
    println(coco.color)
    coco.fly()
    coco.sing(4)

    println()
    println(coco)
    println(coco2.name)
    println(coco2.color)
    println(coco2.wing)
    println(coco2.beak)

}