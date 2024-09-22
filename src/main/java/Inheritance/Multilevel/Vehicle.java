package Inheritance.Multilevel;

public class Vehicle extends Machine {
    void go() {
        System.out.println("Vehicle is moving");
    }

    void stop() {
        System.out.println("Vehicle is stopped");
    }

//    public Vehicle() {
//        System.out.println("Vehicle constructor");
//        System.out.println("Vehicle hash code: " + this.hashCode());
//    }
}
