package chap08.section1.limit

private open class Animal(val size: Int)

private class Cat(val jump: Int): Animal(50)

private class Spider(val poison: Boolean): Animal(1)

//형식 매개변수의 타입을 Animal로 제한
private class Box<out T: Animal> (val element: T) { //val만 가능하다.
    fun getAnimal(): T = element
   /* fun setAnimal(new: T) { //out일 경우에는 반환타입만 가능하고 메서드 매개변수로 사용불가해서 set할 수 없다.
        element = new  //in이면 가능
    }*/
}

fun main() {
    val c1= Cat(10)
    val s1 = Spider(true)

    var a1: Animal = c1
    a1 = s1
    println("s1 ${a1.size} ${a1.poison}")

    //val b1: Box<Animal> = Box<Animal>()
   /* val b2: Box<Animal> = Box<Cat>()
    val b3 = Box<Spider>()*/
    //val b4: Box<Number> = Box<Int>() //out이라서 가능

}