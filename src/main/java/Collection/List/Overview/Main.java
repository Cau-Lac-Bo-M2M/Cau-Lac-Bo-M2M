package Collection.List.Overview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = Arrays.stream(numbers).reduce(0, Integer::sum); // 55
        int max = Arrays.stream(numbers).reduce(0, Integer::max);
        int mul = Arrays.stream(numbers).reduce(0, (a,b) -> a*b);
        System.out.println(max);
        System.out.println("sum : " + sum); // 55

    }

    public static void add() {
        Collection<String> collection = new ArrayList<>();
        collection.add("Duy");
        collection.add("Nam");
        System.out.println(collection); // [Duy, Nam]
    }

    public static void addAll() {
        Collection<String> collection1 = new ArrayList<>();
        collection1.add("Duy");

        Collection<String> collection2 = new ArrayList<>();
        collection2.add("Nam");
        collection2.add("An");

        collection1.addAll(collection2);
        System.out.println(collection1); // [Duy, Nam, An]
    }

    public static void remove() {
        Collection<String> collection = new ArrayList<>();
        collection.add("Duy");
        collection.add("Nam");
        collection.remove("Nam");
        System.out.println(collection); // [Duy]
    }

    public static void size(){
        Collection<String> collection = new ArrayList<>();
        collection.add("Duy");
        collection.add("Nam");
        System.out.println(collection.size()); // 2
    }

    public static void clear(){
        Collection<String> collection = new ArrayList<>();
        collection.add("Duy");
        collection.add("Nam");
        collection.clear();
        System.out.println(collection); // []
    }

    public static void contains(){
        Collection<String> collection = new ArrayList<>();
        collection.add("Duy");
        System.out.println(collection.contains("Duy")); // true
        System.out.println(collection.contains("Nam")); // false
    }

    public static void toArray(){
        Collection<String> collection = new ArrayList<>();
        collection.add("Duy");
        collection.add("Nam");

        Object[] array = collection.toArray();
        for (Object name : array) {
            System.out.println(name);
        }
        // Output:
        // Duy
        // Nam
    }

    public static void isEmpty(){
        Collection<String> collection = new ArrayList<>();
        System.out.println(collection.isEmpty()); // true
        collection.add("Duy");
        System.out.println(collection.isEmpty()); // false
    }

    public static void stream(){
        Collection<String> collection = new ArrayList<>();
        collection.add("Duy");
        collection.add("Nam");

        collection.stream()
                .filter(name -> name.startsWith("D"))
                .forEach(System.out::println); // Duy

        for (String a: collection){

        }
    }
}