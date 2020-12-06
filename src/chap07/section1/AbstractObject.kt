package chap07.section1

//이번에 object를 이용해서 하위클래스를 생성하지 않고 단일 인스턴스 객체로 생성해보겠다.
//이렇게 하면 단점이 코드가 줄어들고, 일회성으로 사용하기에 좋다.

abstract class Printer {
    abstract fun print() //추상메서드 이기에 반드시 하위클래스에서 구현해야한다. 이번에는 object를 사용하여 단일 인스턴스의 필드 메서드로 구현해보자.
}

interface Katok {
    fun alarm()
}


fun main() {
    val myPrinter = object: Printer() { //단일 객체 인스턴스
        val word = "안녕하세요"
        override fun print() {
            println("$word object를 이용 단일 인스턴스로 만들었습니다.")
        }
    }

    val katok = object: Katok{
        val word = "인터페이스입니다"
        override fun alarm() {
            println("$word object를 사용하여 인터페이스 역시 단일 인스턴스로 사용가능합니다.")
        }
    }

    myPrinter.print()
    katok.alarm()
    
}

//자, 지금까지 내가 한게 뭘까? abstract 클래스인 Printer를 만들었다.
//왜? 상속받는 구현부에서 사용할 수 있도록, 다시 한 번 생각해보자면 abstract는 객체 생성이 목적이 아니다. 구현부에서 이 녀석을 활용해야 되는 것 이다.
//내가 안드로이드에서 콜백함수를 이용할 때, 많이 사용했던 obejct, 막연하게 그냥 쓰기만 했는데, 그 실체는 abstract 또는 interface였으리라..