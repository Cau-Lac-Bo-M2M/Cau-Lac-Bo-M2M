package Inheritance.Hierarchical;

public class Bicycle extends Vehicle{
    String name;
    int pedals = 2;

    public Bicycle(){
        super();
        System.out.println("Bicycle constructor");
    }
}
