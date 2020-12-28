package chap11.section1.section2

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.awt.Image

fun main() = runBlocking<Unit> { // this: CoroutineScope
    launch {
        delay(1200L)
        println("Task from runBlocking")
    }

    coroutineScope { // 코루틴 스코프 생성
        launch {
            delay(500L)
            println("Task from nested launch")
        }

        delay(100L)
        println("Task from coroutine scope")
    }
    println("Coroutine scope is over")
}


