package chap06.section1.section2

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0) { property, oldValue, newValue ->
        newValue > oldValue //만약 조건에 맞지 않다면 거부권 행사함
    }
    
    println(max)
    max = 10 //변경감지
    println(max)

    max = 5 //기존의 10보다 작으므로 조건에 맞지않음
    println(max)
}