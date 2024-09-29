package Collection.Map.map.generalExample;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class GeneralExample {
    public static void main(String[] args) {
        /*
         * In Java, a HashMap automatically increases its capacity when
         * the number of entries exceeds the product of the current capacity and the load factor.
         * This process is known as rehashing.
         * --
         * When does it increase?
         * The capacity increases when the number of entries exceeds the threshold, which is calculated as: [ \text{threshold} = \text{current capacity} \times \text{load factor} ]
         * --
         * By how much does it increase?
         * When the capacity is increased, it is typically doubled. For example, if the current capacity is 16, it will be increased to 32.
         * Example
         * If you have a HashMap with an initial capacity of 16 and a load factor of 0.75, the threshold will be: [ 16 \times 0.75 = 12 ]  When the 13th entry is added, the capacity will be increased to 32.
         */
        // Tạo một đối tượng HashMap với sức chứa ban đầu là 16 và hệ số tải là 0.75 -- default value
        HashMap<Integer, Integer> studentGrades = new HashMap<>();
//        LinkedHashMap<String, Integer> studentGrades = new LinkedHashMap<>(16, 0.75f);
//        TreeMap<String, Integer> studentGrades = new TreeMap<>(Comparator.reverseOrder());
//        Hashtable<String, Integer> studentGrades = new Hashtable<>(16, 0.75f);
//        ConcurrentHashMap<String, Integer> studentGrades = new ConcurrentHashMap<>(16, 0.75f);

        // Thêm các cặp key-value vào HashMap
        studentGrades.put(2, 85);
        studentGrades.putIfAbsent(9, 90);
        studentGrades.put(5, 78);
//        studentGrades.replace("Tran Thi B", 69);
//        studentGrades.put("null", null);
//        studentGrades.put(null, 77);

        // Truy xuất giá trị theo key
//        int grade = studentGrades.get("Nguyen Van A");
//        System.out.println("Điểm của Nguyen Van A: " + grade);

        // Lặp qua các phần tử trong HashMap for-each
        for (Map.Entry<Integer, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
