package chap07.section1

public interface Bird {
    public abstract val wings: Int //추상 프로퍼티
    public abstract fun fly() //추상 메서드
    public fun jump() = println("bird jump!")
}

public interface Horse {
    public abstract val maxSpeed: Int //추상 프로퍼티
    public abstract fun run() //추상 메서드
    public fun jump() = println("jump!, max speed: $maxSpeed")
}

class Pegasus(): Bird, Horse {
    override val wings: Int = 2

    override val maxSpeed: Int = 100

    override fun fly() = println("Fly!")
    override fun run() = println("Run!")

    override fun jump() {
        super<Horse>.jump()
        println("and Jump!")
    }
}

fun main() {
    val pegasus = Pegasus()
    pegasus.jump()
}