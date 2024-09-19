package Inheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
        System.out.println("Cars have " + car.doors + " doors");

        Bicycle bicycle = new Bicycle();
        bicycle.go();
        System.out.println(bicycle.pedals);
    }
}
