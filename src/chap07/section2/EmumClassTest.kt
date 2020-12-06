package chap07.section2

//열거형 클래스는 여러 개의 상수를 선언하고 열거된 값을 조건에 따라 선택할 수 있는 특수한 클래스이다.
//자료형이 동일한 상수를 나열할 수 있다. 단, 실드 클래스처럼 다양한 자료형을 다루지 못한다.

interface Score {
    fun getScore(): Int
}

enum class MemberType(var prio: String): Score {
    NORMAL("Thrid") {
        override fun getScore(): Int = 100
    },
    SILVER("Second") {
        override fun getScore(): Int = 500
    },
    GOLD("First") {
        override fun getScore(): Int = 1500
    }
}

fun main() {
    println(MemberType.NORMAL.getScore())
    println(MemberType.GOLD)
    println(MemberType.valueOf("SILVER"))
    println(MemberType.SILVER.prio)
}