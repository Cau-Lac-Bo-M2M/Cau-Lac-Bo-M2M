package Collection.Set.LinkedHashSet;

import Collection.Set.Person;

import java.util.LinkedHashSet;

public class LinkedHashSetPersonExample {
    public static void main(String[] args) {
        LinkedHashSet<Person> linkedHashSet = new LinkedHashSet<>();

        // Thêm phần tử
        linkedHashSet.add(new Person("Alice", 30));
        linkedHashSet.add(new Person("Bob", 25));

        // In phần tử
        System.out.println("LinkedHashSet of Persons: " + linkedHashSet);

        // Kiểm tra sự tồn tại
        System.out.println("Contains Alice, 30: " + linkedHashSet.contains(new Person("Alice", 30)));

        // Xóa phần tử
        linkedHashSet.remove(new Person("Bob", 25));
        System.out.println("After removing Bob: " + linkedHashSet);

        // Kích thước của LinkedHashSet
        System.out.println("Size: " + linkedHashSet.size());
    }
}

