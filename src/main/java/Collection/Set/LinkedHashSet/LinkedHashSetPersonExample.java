package Collection.Set.LinkedHashSet;

import Collection.Set.Person;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class LinkedHashSetPersonExample {
    public static void main(String[] args) {
        // Khởi tạo LinkedHashSet với đối tượng Person
        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();

        // Thêm phần tử
        linkedHashSet.add(new Person("Alice", 30));
        linkedHashSet.add(new Person("Bob", 25));
        linkedHashSet.add(new Person("Charlie", 35));
        linkedHashSet.add(new Person("Alice", 30)); // Thêm phần tử trùng lặp

        // In các phần tử
        System.out.println("LinkedHashSet of Persons: " + linkedHashSet);

        // Kiểm tra sự tồn tại của phần tử
        System.out.println("Contains Alice, 30: " + linkedHashSet.contains(new Person("Alice", 30)));

        // Duyệt qua các phần tử
        System.out.println("\nDuyệt qua các phần tử trong LinkedHashSet:");
        for (Person person : linkedHashSet) {
            System.out.println(person);
        }

        // Chuyển đổi LinkedHashSet thành List để truy cập theo chỉ mục
        List<Person> personList = new ArrayList<>(linkedHashSet);
        System.out.println("\nPhần tử thứ 2 trong danh sách (List): " + personList.get(1));

        // Xóa phần tử
        linkedHashSet.remove(new Person("Bob", 25));
        System.out.println("\nAfter removing Bob: " + linkedHashSet);

        // Kích thước của LinkedHashSet
        System.out.println("Size: " + linkedHashSet.size());

        // Tạo một tập hợp mới để kiểm tra phép hợp và giao
        Set<Person> anotherSet = new LinkedHashSet<>();
        anotherSet.add(new Person("Daniel", 28));
        anotherSet.add(new Person("Charlie", 35));

        // Phép hợp (Union)
        Set<Person> unionSet = new LinkedHashSet<>(linkedHashSet);
        unionSet.addAll(anotherSet);
        System.out.println("\nUnion of sets: " + unionSet);

        // Phép giao (Intersection)
        Set<Person> intersectionSet = new LinkedHashSet<>(linkedHashSet);
        intersectionSet.retainAll(anotherSet);
        System.out.println("Intersection of sets: " + intersectionSet);
    }
}
