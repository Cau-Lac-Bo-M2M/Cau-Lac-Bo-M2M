package Collection.Map.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Thêm các phần tử
        linkedHashMap.put("One", 1);
        linkedHashMap.put("Two", 2);
        linkedHashMap.put("Three", 3);

        // Lấy giá trị theo khóa
        System.out.println("Value for 'Two': " + linkedHashMap.get("Two")); // Output: 2

        // Xóa phần tử
        linkedHashMap.remove("One");

        // Kiểm tra sự tồn tại của khóa
        System.out.println("Contains 'Three'? " + linkedHashMap.containsKey("Three")); // Output: true

        // Lấy tập hợp các khóa và giá trị
        System.out.println("Keys: " + linkedHashMap.keySet());
        System.out.println("Values: " + linkedHashMap.values());
    }
}

