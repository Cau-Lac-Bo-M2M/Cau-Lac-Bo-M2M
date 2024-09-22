package Inheritance.Hierarchical;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("--------------------------------");
        Bicycle bicycle = new Bicycle();
        System.out.println("--------------------------------");

        car.stop();
        car.go();
        bicycle.stop();
        bicycle.go();
    }
}
