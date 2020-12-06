package chap10

import chap10.dsl.Job
import chap10.dsl.Person

/**
 * DSL(Domain-Specific Language) 예제
 * 고객의 정보를 구체화하는 DSL을 만들어보기(고객 정보에서만 사용)
 **/

// 아래의 함수에서 this로 반환되는것과 it으로 반환되는 구조를 명확히 알 것.
fun main() {
    // person는 it을 반환하지만 it 보다는 this로 반환되는게 보기가 좋다
    val person = person {
        it.name = "Kildong"
        it.age = 40
    }
    println("${person.name}, ${person.age}")

    val person2 = person2 {
        name = "aloe"
        age = 1
    }

    println("${person2.name}, ${person2.age}")

    val person3 = person3 {
        name = "Dooly"
        age = 40000
    }

    println("${person2.name}, ${person2.age}")

    val job = Person().job {
        category = "service"
        position = "cashier"
        extension = 1
    }

    println("$job")

    val personJob = person3 {
        name = "G9"
        age = 8
        job {
            category = "game"
            position = "League of Legends"
            extension = 3
        }
    }

    println("${personJob.job?.category}, ${personJob.job?.position}, ${personJob.job?.extension}")

}

// 람다식을 매개변수로 가지고 Person 객체를 받는 block 함수를 갖고 있는 person 함수
fun person(block: (Person) -> Unit): Person {
    val p = Person()
    block(p)
    return p
}

// Person.()의 확장함수로 만들면 해당 확장함수는 Person객체를 이미 this로 가지고 있고 p.block()에 p가 안 들어가는 이유는
// 보다시피 Person.()의 확장함수에 아무것도 인자로 넣는것이 없기 때문이다.
fun person2(block: Person.() -> Unit): Person {
    val p = Person()
    p.block()
    return p // 이렇게하고 p를 반환하면 현재 Person자체를 반환하므로 밖에서도 this로 사용 가능하다.
}

// apply를 적용하여 축약형 만들어보기
fun person3(block: Person.() -> Unit): Person = Person().apply(block)

// 확장함수 사용하기
fun Person.job(block: Job.() -> Unit) {
    this.job = Job().apply(block) // this 생략가능
}
