package DataType_Variable;

public class Human {
    private String name;
    private int age;

    public void Human() {

    }

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

//    @Override
//    public String toString() {
//        return "Human{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
