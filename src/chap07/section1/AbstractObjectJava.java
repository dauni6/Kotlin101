package chap07.section1;

//이번에는 자바로 한 번 일회성 단일 인스턴스를 만들어 보자
abstract class Printer2 {
    abstract public void print();
}

interface Katok2 {

     default void alarm(){
         System.out.println("자바8 부터 default는 구현가능");
     };

     public abstract void alarm2(); //기본적으로 추상메서드가 public abstarct로 지정되어 있다. 따라서 적을 필요는 없다.
}

public class AbstractObjectJava {
    public static void main(String[] args) {

        Printer2 printer = new Printer2() {
            String word = "안녕하세요 자바의 object 역할인 익명 클래스 입니다.";

            @Override
            public void print() {
                System.out.println(word);

            }
        };
        printer.print();

        Katok2 katok2 = new Katok2() {
            String word = "인터페이스로 구현 됨";
            @Override
            public void alarm2() {
                System.out.println(word);
            }
        };

        katok2.alarm();
        katok2.alarm2();

    }
}

//문득 이런 생각을 했다. 일회성인데 왜 추상클래스나 interface까지 만들어서 쓰는걸까?
//그런데 안드로이드 앱 개발할때도 보면 object를 사용하여 일회성 단일 인스턴스를 사용한다.
//그냥 그 부분에 필요에 맞게, 입맛에 맞게 사용하기 위해서 쓰는게 아닌가 싶다.
//이렇게 짧은 코드로만 보면 덩그러니 클래스 파일에, 추상클래스 있고, 익명 클래스하나 만들고 끝.
//이렇게만 보면 물론 추상클래스나 인터페이스 만드는게 의미가 없어보이지만,
//프로그램이 커졌을때를 생각해보자. 그 기능을 여기저기서 일회성으로 콜백으로 써야된다면 반드시 필요하다고본다.
//필요없다면 왜 생겼을까?
