package Collection.Map.map.linkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private final int maxEntries;

    // Khởi tạo bộ nhớ đệm với số lượng phần tử tối đa
    public LRUCache(int maxEntries) {
        super(maxEntries, 0.75f, true); // true để duy trì thứ tự truy cập
        this.maxEntries = maxEntries;
    }

    // Ghi đè phương thức removeEldestEntry để loại bỏ mục cũ nhất khi đạt giới hạn
    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > maxEntries;
    }

    public static void main(String[] args) {
        LRUCache<String, String> lruCache = new LRUCache<>(3);

        // Thêm các phần tử vào bộ nhớ đệm
        lruCache.put("1", "one");
        lruCache.put("2", "two");
        lruCache.put("3", "three");

        System.out.println("Bộ nhớ đệm ban đầu: " + lruCache);

        // Truy cập một phần tử để nó trở thành phần tử được truy cập gần nhất
//        lruCache.get("1");

        // Thêm một phần tử mới, phần tử cũ nhất sẽ bị loại bỏ
        lruCache.put("4", "four");

        System.out.println("Bộ nhớ đệm sau khi thêm phần tử mới: " + lruCache);
    }
}

