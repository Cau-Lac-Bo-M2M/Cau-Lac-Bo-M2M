package Inheritance.Multilevel;

public class Car extends Vehicle {
    int wheels = 4;
    int doors = 4;

    public Car(){
        System.out.println("Car constructor");
//        System.out.println("Car hash code: " + this.hashCode());
//        System.out.println("Car's super hash code: " + super.hashCode());
    }
}
