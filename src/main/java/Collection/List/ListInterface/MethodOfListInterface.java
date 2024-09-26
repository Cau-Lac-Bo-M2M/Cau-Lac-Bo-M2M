package Collection.List.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MethodOfListInterface {
    public static void add() {
        List<String> list = new ArrayList<>();
        list.add("Duy");
        list.add("Nam");
        System.out.println(list); // [Duy, Nam]
    }

    public static void addAll() {
        List<String> list1 = new ArrayList<>();
        list1.add("Duy");

        List<String> list2 = new ArrayList<>();
        list2.add("Nam");
        list2.add("An");

        list1.addAll(list2);
        System.out.println(list1); // [Duy, Nam, An]
    }

    public static void get() {
        List<String> list = new ArrayList<>();
        list.add("Duy");
        list.add("Nam");
        System.out.println(list.get(1)); // Nam
    }

    public static void iterator() {
        List<String> list = new ArrayList<>();
        list.add("Duy");
        list.add("Nam");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Output:
        // Duy
        // Nam
    }

    public static void set() {
        List<String> list = new ArrayList<>();
        list.add("Duy");
        list.add("Nam");

        list.set(1, "An");
        System.out.println(list); // [Duy, An]
    }

    public static void remove() {
        List<String> list = new ArrayList<>();
        list.add("Duy");
        list.add("Nam");

        list.remove("Nam");
        System.out.println(list); // [Duy]
    }

    public static void removeAll() {
        List<String> list1 = new ArrayList<>();
        list1.add("Duy");
        list1.add("Nam");

        List<String> list2 = new ArrayList<>();
        list2.add("Nam");

        list1.removeAll(list2);
        System.out.println(list1); // [Duy]
    }

    public static void clear() {
        List<String> list = new ArrayList<>();
        list.add("Duy");
        list.add("Nam");

        list.clear();
        System.out.println(list); // []
    }

    public static void size() {
        List<String> list = new ArrayList<>();
        list.add("Duy");
        list.add("Nam");

        System.out.println(list.size()); // 2
    }

    public static void toArray() {
        List<String> list = new ArrayList<>();
        list.add("Duy");
        list.add("Nam");

        Object[] array = list.toArray();
        for (Object name : array) {
            System.out.println(name);
        }
        // Output:
        // Duy
        // Nam
    }

    public static void contains() {
        List<String> list = new ArrayList<>();
        list.add("Duy");

        System.out.println(list.contains("Duy")); // true
        System.out.println(list.contains("Nam")); // false
    }
}
