package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    val request = launch { // runBlocking의 문맥을 그대로 상속받아 사용
        println("parent launch : ${this.coroutineContext}, ${Thread.currentThread().name}")
        repeat(3) { i ->
            launch {
                println("child launch : ${this.coroutineContext}, ${Thread.currentThread().name}")
                // 여기 launch역시 runBlocking의 문맥을 그대로 상속받아 사용
                delay((i + 1) * 200L) // delay 200ms, 400ms, 600ms
                println("Coroutine $i is done")
            }
        }
        println("request: I'm done and i don't explicitly join my children that are still active")
    }
    request.join() // request의 완료 대기, 이때 하위 코루틴도 모두 대기한다.
    println("Now processing of the request is complete")
}