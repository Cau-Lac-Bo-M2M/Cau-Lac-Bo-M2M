package Collection.Map.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        Map<String, Integer> hashtable = new Hashtable<>();

        // Thêm các phần tử
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);

        // Lấy giá trị theo khóa
        System.out.println("Value for 'Two': " + hashtable.get("Two")); // Output: 2

        // Xóa phần tử
        hashtable.remove("One");

        // Kiểm tra sự tồn tại của khóa
        System.out.println("Contains 'Three'? " + hashtable.containsKey("Three")); // Output: true

        // Lấy tập hợp các khóa và giá trị
        System.out.println("Keys: " + hashtable.keySet());
        System.out.println("Values: " + hashtable.values());
    }
}

