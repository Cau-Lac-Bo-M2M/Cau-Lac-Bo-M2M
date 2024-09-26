package Collection.Set.SortedSet.TreeSet;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Thêm phần tử
        treeSet.add(3);
        treeSet.add(1);
        treeSet.add(2);

        // In phần tử
        System.out.println("TreeSet: " + treeSet);

        // Kiểm tra sự tồn tại
        System.out.println("Contains 2: " + treeSet.contains(2));

        // Xóa phần tử
        treeSet.remove(2);
        System.out.println("After removing 2: " + treeSet);

        // Kích thước của TreeSet
        System.out.println("Size: " + treeSet.size());

        // Các phương thức khác
        System.out.println("First: " + treeSet.first());
        System.out.println("Last: " + treeSet.last());
    }
}

