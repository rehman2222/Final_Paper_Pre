class Engine {
    public void start() {
        System.out.println("Engine started!");
    }
}

class Car {
    private Engine engine; // Aggregation - Car has an Engine

    public Car() {
        engine = new Engine(); // Creating an Engine object
    }

    public void drive() {
        engine.start();
        System.out.println("Car is driving!");
    }
}

public class Agregation {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive();
    }
}