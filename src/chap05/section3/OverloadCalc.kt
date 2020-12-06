package chap05.section3

//오버로딩 기능은 같지만 인자를 다르게 하여 여러 처리를 하는 경우

private class Calc {
    //다양한 매개변수로 오버로딩된 메서드들
    fun add(x: Int, y: Int): Int = x + y
    fun add(x: Double, y: Double): Double = x + y
    fun add(x: Int, y: Int, z: Int): Int = x + y + z
    fun add(x: String, y: String): String = x + y
}

fun main() {
    val calc = Calc() //인스턴스화(객체)
    println(calc.add(3,2))
    println(calc.add(4.6, 7.7))
    println(calc.add(5,7,9))
    println(calc.add("Hello", "World!"))
}
