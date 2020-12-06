package chap07.section2

//특별한 키워드인 inner를 사용해 선언된 내부 클래스, 자바에서는 키워드가 없으면 멤버클래스이다.
//이너 클래스는 바깥 클래스의 멤버들에 접근 가능하다
//바깥 클래스의 private 멤버도 접근이 가능하다.

private class Smartphone(val model: String) {
    private val cpu = "Exynos"

    inner class ExternalStorage(val size: Int) {
        fun getInfo() = "${model}: Installed on $cpu with ${size}GB" //바깥 클래스의 프로퍼티 접근 가능
    }
}

fun main() {
    val mySdcard = Smartphone("S10").ExternalStorage(64)
    println(mySdcard.getInfo())
}

//정리하기
//inner이기때문에 바깥 클래스 접근 가능하다. private 접근 가능하다.
