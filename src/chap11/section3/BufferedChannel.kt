package chap11.section3

import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val channel = Channel<Int>(3) // 버퍼 capacity 값을 줌
    val sender = launch(coroutineContext) { // 송신자 측
        repeat(10) {
            println("Sending $it")
            channel.send(it) // 지속적으로 보내다가 꽉 차면 일시 지연
        }
    }
    // 아무것도 받지 않고 1초 기다린 후
    delay(1000)
    sender.cancel() // 송시자의 작업을 취소
}