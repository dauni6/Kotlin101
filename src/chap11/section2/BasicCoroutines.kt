package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() { // 메인스레드의 문맥
    val job = GlobalScope.launch {  // 새로운 코루틴을 백그라운드에서 즉시실행
        delay(1000L) // 1초의 넌블로킹 지연
        println("World!") // 지연 후 클릭
        doSomething()
    }
    println("Hello, ") // 메인 스레드가 코루틴이 지연되는동안 계속 실행
    println("job: ${job.isActive}, ${job.isCompleted}")
    Thread.sleep(2000L) // 메인스레드가 JVM에서 바로 종료되지 않도록 하기 위해 2초 기다림
    println("job: ${job.isActive}, ${job.isCompleted}")
}

suspend fun doSomething() {
    println("Do something")
}
