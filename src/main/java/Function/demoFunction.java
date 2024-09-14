package Function;

public class demoFunction {
    public void checkTeenager(int age){
        if (age >= 13 && age <= 19) {
            System.out.println("You're teenager");
            return;
        }
        System.out.println("No you're not");
    }
    public String getGreeting(String name) {
        return "Xin chào, " + name;
    }

    public static void main(String[] args) {
        demoFunction demo = new demoFunction();

        demo.checkTeenager(25);
        String sayHi = demo.getGreeting("Hung");
        System.out.println(sayHi);
    }
}
