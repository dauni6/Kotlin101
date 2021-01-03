package chap11.section2

import kotlinx.coroutines.*
import java.util.concurrent.Executors

fun main() = runBlocking(Dispatchers.Default) {

    val threadPool = Executors.newFixedThreadPool(4)
    val myContext = threadPool.asCoroutineDispatcher()

    launch(Dispatchers.IO) {
        // launch는 runBlocking의 문맥을 그대로 이어받는다.
        delay(200L)
        println("Task from runBlocking")
    }

    coroutineScope {
        // 새로운 스코프
        launch(myContext) {
            // 바로 위의 스코프로부터 문맥을 받는다.
            delay(200L)
            println("Task from nested launch")
        }
        delay(200L)
        println("Task from coroutineScope")
    }

    println("end of runBlocking")

}
