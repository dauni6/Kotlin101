package chap05.section1

//Brid 클래스란 일종의 선언, 개념일 뿐 실제 메모리에 존재해 실행되고 있는 것은 아니다
//그러나 객체(object)는 물리적인 메모리 영역에서 실행되고 있는 클래스의 실체이다.
//따라서 클래스로부터 객체를 생성해 내야하며 구체화 또는 인스턴스화(instantiate)되었다고 말할 수 있다.
//메모리에 올라간 객체를 인스턴스(instance)라고도 부른다.
//이 예제에서 val coco = Brid() 객체의 선언이지만, coco라는 녀석은 Brid로부터 만들어진객체 coco 이다.
class Bird (
        var name: String,
        var wing: Int,
        var beak: String,
        var color: String) {

    fun fly() = println("Fly $wing") //한줄로 병합하기 ctrl + shift + J
    fun sing(vol: Int) = println("Sing $vol")
}

fun main() {
    val coco = Bird("bobi", 2, "long", "red")
    println(coco)
    println(coco.name)
    coco.name = "kaing" //setter 로 할당
    println(coco.name)
}