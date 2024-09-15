package Function;

public class demoFunction {
    public static void main(String[] args) {
        demoFunction demo = new demoFunction();

        // void function
        demo.checkTeenager(15);

        // return an Object
        String sayHi = demo.getGreeting("Hendrick");
        System.out.println(sayHi);

        // no param
        demo.printWelcomeMessage();

        // multiple param
        int result = demo.multiplyNumbers(2, 3, 4);
        System.out.println("Multiplication result: " + result);

        // use ... (varargs)
        demo.printNames("Hùng", "Giang", "Thạch");

        // Array is a parameter
        int[] arr = {1, 2, 3, 4, 5};
        demo.printArrayElements(arr);

        // return an Array
        int[] evens = demo.getEvenNumbers(10);
        System.out.print("Even numbers: ");
        for (int i : evens) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Generic
        String[] names = {"Java", "Python", "C++"};
        demo.printGenericArray(names);
    }

    // void function
    public void checkTeenager(int age) {
        if (age >= 13 && age <= 19) {
            System.out.println("You're teenager");
            return;
        }
        System.out.println("No you're not a teenager");
    }

    // return an Object
    public String getGreeting(String name) {
        return "Hi " + name;
    }

    // no param
    public void printWelcomeMessage() {
        System.out.println("Welcome to the Java Function Demo");
    }

    // multiple param
    public int multiplyNumbers(int a, int b, int c) {
        return a * b * c;
    }

    // use ... (varargs): nhận một số lượng tham số không xác định
    public void printNames(String... names) {
        for (String name : names) {
            System.out.println("Xin chào " + name);
        }
    }

    // Array is a parameter
    public void printArrayElements(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // return an Array
    public int[] getEvenNumbers(int limit) {
        // count even numbers
        int count = 0;
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        // create Array with count
        int[] evenNumbers = new int[count];
        int index = 0;
        for (int i = 0; i <= limit; i++) {
            if (i % 2 == 0) {
                evenNumbers[index++] = i;
            }
        }
        return evenNumbers;
    }

    // Generic
    public <T> void printGenericArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
    }
}
