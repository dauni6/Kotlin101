package chap11.section3

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlin.system.measureTimeMillis

val ints: Flow<Int> = flow {
  for (i in 1..10) {
      delay(100)
      emit(i)
  }
}
suspend fun main() {
    val time = measureTimeMillis {
        ints.collect {
            println(it)
        }
    }
    println("Collected in $time ms")
}