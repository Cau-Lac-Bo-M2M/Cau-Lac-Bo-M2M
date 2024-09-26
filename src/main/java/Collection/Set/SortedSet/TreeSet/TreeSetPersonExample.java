package Collection.Set.SortedSet.TreeSet;

import Collection.Set.Person;

import java.util.TreeSet;

public class TreeSetPersonExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>((p1, p2) -> {
            int nameComp = p1.name.compareTo(p2.name);
            if (nameComp != 0) return nameComp;
            return Integer.compare(p1.age, p2.age);
        });

        // Thêm phần tử
        treeSet.add(new Person("Alice", 30));
        treeSet.add(new Person("Bob", 25));

        // In phần tử
        System.out.println("TreeSet of Persons: " + treeSet);

        // Kiểm tra sự tồn tại
        System.out.println("Contains Alice, 30: " + treeSet.contains(new Person("Alice", 30)));

        // Xóa phần tử
        treeSet.remove(new Person("Bob", 25));
        System.out.println("After removing Bob: " + treeSet);

        // Kích thước của TreeSet
        System.out.println("Size: " + treeSet.size());

        // Các phương thức khác
        System.out.println("First: " + treeSet.first());
        System.out.println("Last: " + treeSet.last());
    }
}

