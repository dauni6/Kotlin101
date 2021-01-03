package chap11.section2

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking<Unit> {
    val job = launch {
        delay(1000L)
        println("World!")
        doSomething2()
    }
    println("Hello, ")
    println("job: ${job.isActive}, ${job.isCompleted}")
    //Thread.sleep(2000L)
    job.join() // 명시적으로 코루틴이 완료되길 기다림. 취소할 경우 job.cancel()을 사용
    println("job : ${job.isActive}, ${job.isCompleted}")
}

suspend fun doSomething2() {
    println("Do something")
}
