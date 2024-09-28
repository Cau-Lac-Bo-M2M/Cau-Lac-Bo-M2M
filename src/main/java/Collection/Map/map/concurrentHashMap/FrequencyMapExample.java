package Collection.Map.map.concurrentHashMap;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class FrequencyMapExample {
    public static void main(String[] args) {
        // Tạo ConcurrentHashMap với LongAdder để đếm tần suất
        ConcurrentHashMap<String, LongAdder> frequencyMap = new ConcurrentHashMap<>();

        // Cập nhật tần suất xuất hiện của từ
        updateFrequency(frequencyMap, "apple");
        updateFrequency(frequencyMap, "banana");
        updateFrequency(frequencyMap, "apple");

        // Hiển thị tần suất của mỗi từ
        frequencyMap.forEach((word, count) -> {
            System.out.println(word + ": " + count);
        });
    }

    private static void updateFrequency(ConcurrentHashMap<String, LongAdder> map, String key) {
        // Sử dụng LongAdder để tăng số đếm mà không cần khóa rõ ràng
        map.computeIfAbsent(key, k -> new LongAdder()).increment();
    }
}

