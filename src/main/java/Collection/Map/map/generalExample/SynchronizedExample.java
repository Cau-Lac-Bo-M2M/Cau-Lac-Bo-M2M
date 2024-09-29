package Collection.Map.map.generalExample;

import java.util.*;

public class SynchronizedExample {
    public static void main(String[] args) {
        // Tạo một HashMap và sử dụng đồng bộ hóa bên ngoài để đảm bảo an toàn trong môi trường nhiều luồng
        Map<String, String> syncMap = Collections.synchronizedMap(new HashMap<>());
//        HashMap<String, String> syncMap = new HashMap<>();
//        Map<String, String> syncMap = Collections.synchronizedMap(new LinkedHashMap<>());
//        Map<String, String> syncMap = Collections.synchronizedMap(new TreeMap<>());

        // Thêm các phần tử vào Map
        syncMap.put("USA", "Washington, D.C.");
        syncMap.put("Japan", "Tokyo");
        syncMap.put("Vietnam", "Hanoi");

        Thread thread1 = new Thread(() -> {
            syncMap.remove("France");
            syncMap.put("Germany", "Berlin");
            System.out.println("Thread 1 thêm Germany: " + syncMap.get("Germany"));
        });

        Thread thread2 = new Thread(() -> {
            syncMap.remove("Germany");
            syncMap.put("France", "Paris");
            System.out.println("Thread 2 thêm France: " + syncMap.get("France"));
        });

        Thread thread0 = new Thread(() -> {
            syncMap.forEach((key, value) -> {
                System.out.println(key + ": " + value);
            });
        });

        thread2.start();
        thread1.start();
        thread0.start();

        try {
            thread1.join();
            thread0.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Truy xuất giá trị theo key
        String capital = syncMap.get("Vietnam");
        System.out.println("Thủ đô của Việt Nam là: " + capital);
    }
}
