package Inheritance.Multiple;

public class Penguin implements Swimmable, Flyable{
    @Override
    public void fly() {
        System.out.println("Penguin can't fly");
    }

    @Override
    public void swim() {
        System.out.println("Penguin can swim");
    }
}
