package chap07.section1

//일단 객체화 할 수 없다.
//이 추상 클래스를 상속 받는 클래스에서 반드시 구체화 해주어야 된다.
//추상클래스에서는 프로퍼티에 상태 정보를 저장할 수 있다, 그러나 인터페이스에서는 프로퍼티 상태 저장이 불가능 하다.
//마찬가지로 일반 메서드를 구현할 수 있다.
//추상 클래스는 다른 클래스의 상위클래스로 쓰이려면 상속의 개념인 open을 넣어줄 필요가 없다. 이미 abstract 키워드 자체가 상속과 오버라이딩을 허용하고 있다.
//인터페이스도 마찬가지. 하지만 일반 메서드나 프로퍼티를 오버라이딩 하려면 open 키워드는 필요하다.

abstract class Vehicle constructor(val name: String, val color: String, val weight: Double) { //주생성자 필드변수는 3개, 초기화되어있진 않음
    //추상 프로퍼티(반드시 하위클래스에서 재정의해 초기화 해야함)
    abstract var maxSpeed: Double

    //일반 프로퍼티(초기값 상태 저장 가능)
    var year = "2020" //초기화 된 상태.

    //추상 메서드(반드시 하위 클래스에서 구현해야함)
    abstract fun start()
    abstract fun stop()

    //일반 메서드
    fun displaySpecs() {
        println("Name: $name, Color: $color, Weight: $weight, Year: $year, Max Speed: $maxSpeed")
    }
}

class Car(name: String, color: String, weight: Double, override var maxSpeed: Double) : Vehicle(name, color, weight) {

    override fun start() {
       println("Car Started")
    }

    override fun stop() {
        println("Car Stop")
    }
}

class Motorcycle(name: String,color: String, weight: Double, override var maxSpeed: Double): Vehicle(name, color, weight) {
    override fun start() {
      println("Motorcycle Started")
    }

    override fun stop() {
        println("Motorcycle Stop")
    }
}

fun main() {

    val car = Car("SuperMatiz", "Yellow", 1110.0, 270.0)
    val motor = Motorcycle("DreamBike", "red", 173.0, 100.0)

    car.year = "2013"

    car.displaySpecs()
    car.start()
    motor.displaySpecs()
    motor.start()

}