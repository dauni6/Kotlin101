package chap11.section3

import kotlinx.coroutines.*

val threadLocal = ThreadLocal<String?>() // 스레드-지역 변수 선언

fun main() = runBlocking<Unit> {
    threadLocal.set("main")
    println("Pre-main: thread local value: '${threadLocal.get()}'") // main

    val job = launch(Dispatchers.Default + threadLocal.asContextElement(value = "launch")) {
        //asContextElement를 사용하여 현재 launch 코루틴의 범위에서는 값으로 "launch"를 가진다.
        //스택은 없지만 일종의 지역변수처럼 사용한다.
        println("Launch start: thread local value: '${threadLocal.get()}'") // launch
        yield() // 지연함수 사용
        println("After yield: thread local value: '${threadLocal.get()}'") // launch
    }

    withContext(Dispatchers.Main) {  // Main은 UI요소를 건드릴 수 있는 문맥
//        println(myThreadLocal.get()) // main
//         myThreadLocal.set("UI") // 바뀌어도 바깥으로 전파되지 않는다. 따라서 여기서 끝나면 "UI"는 사용되지 않는다.
    }
    job.join()
    println("Post-main: thread local value: '${threadLocal.get()}'") // main

}