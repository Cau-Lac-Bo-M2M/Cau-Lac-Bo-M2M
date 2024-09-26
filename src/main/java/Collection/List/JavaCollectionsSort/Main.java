package Collection.List.JavaCollectionsSort;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Duy");
        names.add("An");
        names.add("Nam");

        // Sắp xếp danh sách
        Collections.sort(names);

        // In danh sách đã sắp xếp
        System.out.println(names); // [An, Duy, Nam]
    }

    public static void sortInteger(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);

        // Sắp xếp danh sách
        Collections.sort(numbers);

        // In danh sách đã sắp xếp
        System.out.println(numbers); // [2, 5, 8]
    }
}
