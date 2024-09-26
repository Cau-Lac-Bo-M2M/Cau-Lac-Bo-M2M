package Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();

        // Thêm các phần tử
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Lấy giá trị theo khóa
        System.out.println("Value for 'Two': " + hashMap.get("Two")); // Output: 2

        // Xóa phần tử
        hashMap.remove("One");

        // Kiểm tra sự tồn tại của khóa
        System.out.println("Contains 'Three'? " + hashMap.containsKey("Three")); // Output: true

        // Lấy tập hợp các khóa và giá trị
        System.out.println("Keys: " + hashMap.keySet());
        System.out.println("Values: " + hashMap.values());
    }
}
