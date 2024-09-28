package Collection.Map.map.hashtable;

import java.util.Hashtable;

public class ThreadSafeHashtableExample {
    public static void main(String[] args) {
        // Tạo một Hashtable an toàn trong môi trường đa luồng
        Hashtable<String, String> hashtable = new Hashtable<>();

        // Sử dụng nhiều luồng để truy xuất và cập nhật Hashtable
        Thread thread1 = new Thread(() -> {
            hashtable.put("Germany", "Berlin");
            System.out.println("Thread 1 thêm Germany: " + hashtable.get("Germany"));
        });

        Thread thread2 = new Thread(() -> {
            hashtable.put("France", "Paris");
            System.out.println("Thread 2 thêm France: " + hashtable.get("France"));
        });

        Thread thread3 = new Thread(() -> {
            hashtable.forEach((key, value) -> {
                System.out.println(key + ": " + value);
            });
        });

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

