package Collection.Set.LinkedHashSet;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        // Thêm phần tử
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(3);

        // In phần tử
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // Kiểm tra sự tồn tại
        System.out.println("Contains 2: " + linkedHashSet.contains(2));

        // Xóa phần tử
        linkedHashSet.remove(2);
        System.out.println("After removing 2: " + linkedHashSet);

        // Kích thước của LinkedHashSet
        System.out.println("Size: " + linkedHashSet.size());
    }
}

