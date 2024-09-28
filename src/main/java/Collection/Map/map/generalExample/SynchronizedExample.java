package Collection.Map.map.generalExample;

import java.util.*;

public class SynchronizedExample {
    public static void main(String[] args) {
        // Tạo một HashMap và sử dụng đồng bộ hóa bên ngoài để đảm bảo an toàn trong môi trường nhiều luồng
        Map<String, String> syncMap = Collections.synchronizedMap(new HashMap<>());
//        Map<String, String> syncMap = Collections.synchronizedMap(new LinkedHashMap<>());
//        Map<String, String> syncMap = Collections.synchronizedMap(new TreeMap<>());

        // Thêm các phần tử vào Map
        syncMap.put("USA", "Washington, D.C.");
        syncMap.put("Japan", "Tokyo");
        syncMap.put("Vietnam", "Hanoi");

        // Truy xuất giá trị theo key
        String capital = syncMap.get("Vietnam");
        System.out.println("Thủ đô của Việt Nam là: " + capital);
    }
}
