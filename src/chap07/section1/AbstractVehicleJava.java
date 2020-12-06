package chap07.section1;

abstract class Vehicle2 {
    String name;
    String color;
    double weight;
    double maxSpeed;

    String year = "2020"; //초기화 가능

    public Vehicle2(String _name, String _color, double _weight, double _maxSpeed) { //생성자
        this.name = _name;
        this.color= _color;
        this.weight = _weight;
        this.maxSpeed = _maxSpeed;
    }

    //추상 메서드(반드시 하위 클래스에서 오버라이딩 하여 구현해야함)
    abstract public void start();
    abstract public void stop();

    //일반 메서드도 사용가능
    public void displaySpecs() {
        System.out.println("Name:" + name + " Color: " + color + " Weight: " + weight + " Year: " + year + " Max Speed: " + maxSpeed);
    }
}

class Car2 extends Vehicle2 {

    public Car2(String _name, String _color, double _weight, double _maxSpeed) {
        super(_name, _color, _weight, _maxSpeed);
    }

    @Override
    public void start() {
        System.out.println("Car2 Started");
    }

    @Override
    public void stop() {
        System.out.println("Car2 Stop");
    }
}

class Motorcycle2 extends Vehicle2 {

    public Motorcycle2(String _name, String _color, double _weight, double _maxSpeed) {
        super(_name, _color, _weight, _maxSpeed);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle2 Started");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle Stop");
    }
}

class AbstractVehicleJava {
    public static void main(String[] args) {
        Car2 car2 = new Car2("SuperMatiz", "Yellow", 1110.0, 270.0);
        Motorcycle2 motor2 = new Motorcycle2("DreamBike", "red", 173.0, 100.0);

        car2.year = "2013"; //초기화 되어 있기 때문에 바로 사용가능함
        car2.displaySpecs(); //일반 메소드이기 때문에 상속만 받으면 바로 사용 가능.
        car2.start(); //오버라이딩하여 재구성했기 때문에 사용 가능.

        motor2.displaySpecs();
        motor2.start();

        
    }
}
