package DataType_Variable;

public class Main {
    String globalVar = "Cau lac bo";
    static String staticVar = "M2M";

    public static void main(String[] args) {
        // PRIMITIVE
        // Integer
        byte byteVar = 100;
        short shortVar = 1000;
        int intVar = 100000;
        long longVar = 10000000000L;

        // Floating
        float floatVar = 3.14f;
        double doubleVar = 99.99;

        // Character
        char charVar1 = 'A';
        char charVar2 = 'B';
        char charVar3 = 'C';
        System.out.println("A + B = " + (charVar1 + charVar2));
        System.out.println();

        // Binary
        boolean binary = true;

        // REFERENCE
        // Wrapper class
        Integer integer = 19005656;
        String text = "Happy birthday";
        int[] myArray = {1, 3, 5, 7, 8};
        Human human = new Human("Hung", 25);

        System.out.println("Wrapper class: " + integer);
        System.out.println("String: " + text);
        System.out.println("Array: " + myArray);
        System.out.println("Object: " + human);
        System.out.println();

        // CASTING
        System.out.println("Implicit casting: " + (byteVar + 0.1));
        System.out.println("Explicit casting: " + (int) doubleVar);
        System.out.println("Character implicit casting: " + (charVar3 + 4));
        System.out.println("Character explicit casting: " + (char) 100);
    }

    public void myMethod() {
        int localVar = 9;
        System.out.println(localVar);
    }
}