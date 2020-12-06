package chap06.section1.section2.delegateclass

interface Car {
    fun go(): String
}

class VanImpl(val power: String): Car {
    override fun go(): String {
        return "은 짐을 적재하며 $power 을 가집니다."
    }
}

class SportImpl(val power: String): Car {
    override fun go(): String {
        return "은 걍주용에 사용되며 $power 을 가집니다."
    }
}

class CarModel(val model: String, impl: Car): Car by impl {
    fun carInfo() {
        println("$model ${go()}") //참조없이 바로 인터페이스 구현 클래싀의 메서드에 접근가능
    }
}

fun main() {
    val myDamas = CarModel("Damas 2010", VanImpl("100마력"))
    val my350z = CarModel("350Z 2008", SportImpl("350마력"))

    myDamas.carInfo()
    my350z.carInfo()
}