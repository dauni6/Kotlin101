package chap11.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withTimeoutOrNull

fun main() = runBlocking<Unit>{
    val result = withTimeoutOrNull(4000L) {
        repeat(3) { i ->
            println("I'm sleeping $i...")
            delay(500L)
        }
        "Done" // 코루틴 블록이 취소되면 이 값이 result에 반환됨
    }
    println("Result is $result")
}