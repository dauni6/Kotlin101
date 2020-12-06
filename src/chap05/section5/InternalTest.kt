package chap05.section5.internal

internal class InternalTest {
    internal var i = 1
    internal fun internalFunc() {
        i += 1
    }
}

class Other {
    internal val it = InternalTest()
    fun test() {
        it.i = 3
        it.internalFunc()
    }
}

fun main() {
    val it = InternalTest()
    it.i = 10
    it.internalFunc()

}