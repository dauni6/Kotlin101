package chap11.section3

import kotlinx.coroutines.*

fun main() = runBlocking {
    // 여러개의 코루틴 블록 만들기
    val jobs = arrayListOf<Job>()
    jobs += launch {
        // 기본 launch블록의 내용 확인
        println("launch: ${this.coroutineContext}, ${Thread.currentThread()}")
    }
    jobs += launch(Dispatchers.Default) {
        println("launch(default): ${this.coroutineContext}, ${Thread.currentThread()}")
    }

    jobs += launch(Dispatchers.Unconfined) {
        println("launch(unconfined): ${this.coroutineContext}, ${Thread.currentThread()}")
        delay(500)
        println("launch(unconfined): ${this.coroutineContext}, ${Thread.currentThread()}")
    }

    jobs += launch(Dispatchers.IO) {
        println("launch(IO): ${this.coroutineContext}, ${Thread.currentThread()}")
    }

    jobs += launch(newSingleThreadContext("myThread")) {
        println("launch(NEW): ${this.coroutineContext}, ${Thread.currentThread()}")
    }

    jobs.forEach {
        it.join() // 각각의 job을 받아서 join 시키기
    }
}
