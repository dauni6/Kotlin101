package chap11.section3

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel

fun main() = runBlocking<Unit> {
    val channel = Channel<Int>()
    launch {
        // 여기에 다량의 CPU 연산 작업이나 비동기 로직을 둘 수 있음
        for (x in 1..5) channel.send(x * x)
        channel.close() // 모두 보내고 닫기 명시
    }
    // for 루프를 사용해 끝까지 읽기
    for (element in channel) println(element)
    println("Done!")
}