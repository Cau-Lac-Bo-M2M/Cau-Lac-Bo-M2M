package Collection.Map.map.definition;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DefinitionExample {
    public static void main(String[] args) {
        // Tạo một đối tượng HashMap
//        Map<Integer, String> errorCodes = new HashMap<>();
        Hashtable<Integer, String> errorCodes = new Hashtable<>();

        // Thêm các cặp key-value vào Map
        errorCodes.put(400, "Bad Request");
        errorCodes.put(401, "Unauthorized");
        errorCodes.put(403, "Forbidden");
        errorCodes.put(404, "Not Found");
        errorCodes.put(408, "Request Timeout");
        errorCodes.replace(408, "Request Timeout", "bruh");
        errorCodes.replace(500, "Internal Server Error");
//        errorCodes.put(null, "Request Timeout");
//        errorCodes.putIfAbsent(404, null);
        // Duyệt qua các phần tử trong Map for-each
        for (Map.Entry<Integer, String> entry : errorCodes.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        // Truy xuất giá trị theo key
        // Xóa một phần tử khỏi Map
        System.out.println("Remove key 404: " + errorCodes.remove(404));
        String description = errorCodes.get(404);
        System.out.println("Mã lỗi: " + description);

        // Kiểm tra xem Map có rỗng không
        System.out.println("Size: " + errorCodes.size());
        System.out.println("Is empty: " + errorCodes.isEmpty());

        // Kiểm tra xem Map có chứa key hoặc value không
        System.out.println("Contains key 404: " + errorCodes.containsKey(404));
        System.out.println("Contains value Not Found: " + errorCodes.containsValue("Not Found"));
    }
}
