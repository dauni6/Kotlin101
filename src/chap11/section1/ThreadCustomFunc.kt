package chap11

fun thread(start: Boolean = true, isDaemon: Boolean = false,
    contextClassLoader: ClassLoader? = null, name: String? = null,
    priority: Int = -1, block: () -> Unit): Thread { // block 람다식이 마지막이므로 실행할때는 { } 을 통해 마지막에 작성하도록 됨

    val thread = object : Thread() {
        override fun run() {
            println("block() run")
            block()
        }
    }

    if (isDaemon) // 백그라운드 실행 여부(백그라운드 서비스를 제공하기 위한 스레드, 보통 운영체제에 의해 낮은 우선순위가 부여됨)
        thread.isDaemon = isDaemon
    if (priority > 0) // 우선순위(1:낮으 ~ 5:보통 ~ 10: 높음)
        thread.priority = priority
    if (name != null) // 이름
        thread.name = name
    if (contextClassLoader != null)
        thread.contextClassLoader = contextClassLoader
    if (start)
        thread.start()
    return thread
}

fun main() {
    // 스레드의 옵션 변수를 손쉽게 설정할 수 있음
    thread(start = true) {
        println("Current Threads(Custom function : ${Thread.currentThread()}")
        println("Priority: ${Thread.currentThread().priority}")
        println("Name : ${Thread.currentThread().name}")
        println("Name : ${Thread.currentThread().isDaemon}")
    }
}