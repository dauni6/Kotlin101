package chap08.section1

private open class Parent

private class Child: Parent()

class Cup<T>

fun main() {
    //val obj1: Child = Parent() 캐스팅 불가능, 상위클래스 인스턴스를 하위클래스의 타입으로 받을 수 없다.
    val obj2: Parent = Child() //업캐스팅은 가능하다.

    val obj3: Cup<Parent> = Cup<Parent>()
    val obj4: Cup<Child> = Cup<Child>()
    //형식매개변수에서는 기본적으로 형변환이 되지않는 무변성을 갖는다. 따라서
    //val obj5: Cup<Parent> = Cup<Child>() 와 그 반대의 경우도 되지않으며, 서로 관련도 없다.
    //단 이것을 가능하게 하려면 in, out 키워드를 사용하면 된다. 이를 통해 형식매개변수간 관계를 지정할 수 있다.
    //또한 형식매개변수는 기본적으로 null이 가능한 형태이다.





}