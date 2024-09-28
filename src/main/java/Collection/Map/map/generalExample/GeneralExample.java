package Collection.Map.map.generalExample;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;
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
        Map<String, Integer> studentGrades = new HashMap<>(16, 0.75f);
//        Map<String, Integer> studentGrades = new LinkedHashMap<>(16, 0.75f);
//        Map<String, Integer> studentGrades = new TreeMap<>(16, 0.75f);
//        Map<String, Integer> studentGrades = new Hashtable<>(16, 0.75f);
//        Map<String, Integer> studentGrades = new ConcurrentHashMap<>(16, 0.75f);

        // Thêm các cặp key-value vào HashMap
        studentGrades.put("Nguyen Van A", 85);
        studentGrades.putIfAbsent("Tran Thi B", 90);
        studentGrades.put("Le Van C", 78);
        studentGrades.replace("Le Van C", 78, 69);

        // Truy xuất giá trị theo key
        int grade = studentGrades.get("Nguyen Van A");
        System.out.println("Điểm của Nguyen Van A: " + grade);

        // Lặp qua các phần tử trong HashMap
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
