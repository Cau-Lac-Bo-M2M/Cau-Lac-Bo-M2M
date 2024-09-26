package Collection.Map.SortedMap.TreeMap;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Thêm các phần tử
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        treeMap.put("Four", 4);

        // Lấy giá trị theo khóa
        System.out.println("Value for 'Two': " + treeMap.get("Two")); // Output: 2

        // Xóa phần tử
        treeMap.remove("One");

        // Kiểm tra sự tồn tại của khóa
        System.out.println("Contains 'Three'? " + treeMap.containsKey("Three")); // Output: true

        // Lấy các phần tử sắp xếp theo khóa
        System.out.println("First Key: " + treeMap.firstKey()); // Output: Two
        System.out.println("Last Key: " + treeMap.lastKey()); // Output: Four

        // Lấy các phần tử nhỏ hơn khóa chỉ định
        System.out.println("Head Map: " + treeMap.headMap("Three")); // Output: {Four=4}

        // Lấy các phần tử lớn hơn khóa chỉ định
        System.out.println("Tail Map: " + treeMap.tailMap("Three")); // Output: {Three=3, Two=2}

        // Kiểm tra các khóa trong TreeMap để xác minh dữ liệu
        System.out.println("TreeMap contents: " + treeMap); // Output: {Two=2, Three=3, Four=4}
    }
}


