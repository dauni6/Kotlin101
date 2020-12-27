package chap11.section1.section2

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

private suspend fun doWork(): String {
    delay(1000L)
    return "Work1"
}

private suspend fun doWork2(): String {
    delay(3000L)
    return "Work2"
}

private fun worksInParallel(): Job {
    val one = GlobalScope.async {
        doWork()
    }

    val two = GlobalScope.async {
        doWork2()
    }

    val job = GlobalScope.launch {
        val combined = one.await() + "_" + two.await()
        println("Kotlin Combined: $combined")
    }
    return job
}

private fun worksInSerial(): Job {
    // 순차적 실행
    val job = GlobalScope.launch {
        val one = doWork()
        val two = doWork2()
        println("Kotlin One : $one")
        println("Kotlin Two : $two")
    }
    return job
}

fun main() {
    runBlocking {
        val time = measureTimeMillis {
//            val job = worksInSerial()
//            job.join()
            val job = worksInParallel()
            job.join()
        }
       println("time: $time")
    }
}
