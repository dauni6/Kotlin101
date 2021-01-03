package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    GlobalScope.launch { // 만일 launch만 사용하면 종료되지 않음
        repeat(1000) { i ->
            println("I'm sleeping $i...")
            delay(500L)
        }
    }
    delay(1300L)
}