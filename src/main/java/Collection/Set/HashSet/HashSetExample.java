package Collection.Set.HashSet;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();

        // Thêm phần tử
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(3);

        // In phần tử
        System.out.println("HashSet: " + hashSet);

        // Kiểm tra sự tồn tại
        System.out.println("Contains 2: " + hashSet.contains(2));

        // Xóa phần tử
        hashSet.remove(2);
        System.out.println("After removing 2: " + hashSet);

        // Kích thước của HashSet
        System.out.println("Size: " + hashSet.size());
    }
}

