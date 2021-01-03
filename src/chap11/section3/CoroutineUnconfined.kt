package chap11.section3

import kotlinx.coroutines.*


fun main() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) { // not confined -- 메인스레드에서 작업
        println("Unconfined    : I'm working in thread ${Thread.currentThread().name}")
        delay(500)
        println("Unconfined    : after delay in thread ${Thread.currentThread().name}")
    }

    launch { // 부모의 문맥, main runBlocking 코루틴
        println("main runBlocking : I'm working in thread ${Thread.currentThread().name}")
        delay(1000)
        println("main runBlocking : after delay in thread ${Thread.currentThread().name}")
    }
}