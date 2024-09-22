package Inheritance.Multilevel;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        System.out.println("--------------------------------");
        car.stop();
        System.out.println("Cars have " + car.doors + " doors");
//        car.start();
    }
}
