package Collection.Map.map.definition;

import java.util.HashMap;
import java.util.Map;

public class DefinitionExample {
    public static void main(String[] args) {
        // Tạo một đối tượng HashMap
        Map<Integer, String> errorCodes = new HashMap<>();

        // Thêm các cặp key-value vào Map
        errorCodes.put(404, "Not Found");
        errorCodes.put(500, "Internal Server Error");
        errorCodes.put(400, "Bad Request");
        errorCodes.put(401, "Unauthorized");
        errorCodes.put(403, "Forbidden");
        errorCodes.put(408, "Request Timeout");
        errorCodes.put(null, "Request Timeout");
//        errorCodes.put(404, null);
        for (Map.Entry<Integer, String> entry : errorCodes.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // Truy xuất giá trị theo key
        String description = errorCodes.get(404);
        System.out.println("Mã lỗi: " + description);
    }
}
