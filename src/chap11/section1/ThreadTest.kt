package chap11

//1. 클래스로 만들기. 클래스로 만드려면 우선 스레드를 상속해야함
class SimpleThread : Thread() {
    override fun run() {
       println("Class Thread ${Thread.currentThread()}")
    }
}

//2. 인터페이스로 만들기. Runnable을 구현하여 사용
// Runnable 인터페이스를 사용했을 때의 장점은 여라가지 구현이 가능하다는 것 이고
// 다른 클래스를 상속받을 수도 있다.
// class SimpleRunnable : Runnable, View.OnClickListener 등등등...
class SimpleRunnable : Runnable {
    override fun run() {
        println("Interface Thread ${Thread.currentThread()}")
    }
}

fun main() {
    val thread = SimpleThread()
    thread.start() // start로 실행하며 main과는 분리된 새로운 독립적인 스레드가 실행됨.

    val runnable = SimpleRunnable()
    val thread2 = Thread(runnable)
    thread2.start()

    // 3. 익명객체 사용하여 스레드 사용하기(클래스 객체를 만들지 않고도 사용하기에 바로 사용이 가능)
    object : Thread() {
        override fun run() {
            println("object Thread ${Thread.currentThread()}")
        }
    }.start() // 익명객체라고 생성과 동시에 바로 start() 사용함

    // 4. 람다식 형태로 사용하기
    Thread {
        println("Lambda Thread ${Thread.currentThread()}")
    }.start()
}