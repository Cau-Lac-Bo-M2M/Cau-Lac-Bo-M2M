package Collection.Map.map.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;

public class BulkOperationsExample {
    public static void main(String[] args) {
        // Tạo ConcurrentHashMap với dữ liệu ban đầu
        ConcurrentHashMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
        concurrentMap.put("Apple", 50);
        concurrentMap.put("Orange", 30);
        concurrentMap.put("Banana", 70);
        concurrentMap.put("Mango", 40);

        // Sử dụng forEach để duyệt qua tất cả các phần tử
        concurrentMap.forEach(1, (key, value) -> System.out.println(key + ": " + value));

        // Sử dụng search để tìm phần tử theo điều kiện
        String result = concurrentMap.search(1, (key, value) -> {
            if (value > 50) return key;
            return null;
        });
        System.out.println("Fruit with quantity > 50: " + result);

        // Sử dụng reduce để tính tổng các giá trị
        int totalQuantity = concurrentMap.reduceValues(1, Integer::sum);
        System.out.println("Total quantity of all fruits: " + totalQuantity);
    }
}

