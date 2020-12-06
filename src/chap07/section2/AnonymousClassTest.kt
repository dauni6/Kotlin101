package chap07.section2

//자바에서는 익명 이너 클래스라는 것을 제공해 일회성으로 객체를 생성해 사용한다.
//코틀린에서는 object 키워드를 사용하는 익명 객체로 같은 기능을 수행한다.
//특히 오버라이드된 내용을 구현하기에 좋다.

interface Switcher { //인터페이스 선언
    public abstract fun on(): String //구현부 없음. 물론 기본적으로 코틀린은 있어도 된다. 자바의 경우 자바8부터 default를 이용하여 구현가능
}

private class Smartphone3(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) { //inner라서 바깥 클래스 접근 가능
        fun getInfo() = "${model}: Installed on $cpu with ${size}GB" //바깥 클래스의 프로퍼티 접근 가능
    }

    fun powerOn(): String {
        class Led(val color: String) { //지역 클래스 선언
            fun blink() = "Blinking $color on $model"
        }
        val powerStatus = Led("Red") //여기에서 지역 클래스가 사용됨
        val powerSwitch = object: Switcher {
            override fun on(): String {
                return powerStatus.blink()
            }
        } // 익명객체 블록의 끝
        return powerSwitch.on() //익명객체 메서드 사용
    } //powerOn() 블록 끝
}

fun main() {
    val myPhone = Smartphone3("Note10+")
    myPhone.ExternalStorage(256)
    println(myPhone.powerOn())
}

