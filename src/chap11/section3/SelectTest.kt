package chap11.section3

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*
import kotlinx.coroutines.selects.select
import java.util.*

fun main() = runBlocking<Unit> {
    val routine1 = GlobalScope.produce {
        delay(Random().nextInt(1000).toLong())
        send("A")
    }

    val routine2 = GlobalScope.produce {
        delay(Random().nextInt(1000).toLong())
        send("B")
    }

    val result = select<String> { // 먼저 수행된 것을 받게 된다.
        routine1.onReceive {result -> result}
        routine2.onReceive {result -> result}
    }

    println("Result was $result")

}