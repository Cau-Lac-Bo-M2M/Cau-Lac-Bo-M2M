package Collection.Set.HashSet;

import Collection.Set.Person;

import java.util.HashSet;

public class HashSetPersonExample {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();

        // Thêm phần tử
        hashSet.add(new Person("Alice", 30));
        hashSet.add(new Person("Bob", 25));

        // In phần tử
        System.out.println("HashSet of Persons: " + hashSet);

        // Kiểm tra sự tồn tại
        System.out.println("Contains Alice, 30: " + hashSet.contains(new Person("Alice", 30)));

        // Xóa phần tử
        hashSet.remove(new Person("Bob", 25));
        System.out.println("After removing Bob: " + hashSet);

        // Kích thước của HashSet
        System.out.println("Size: " + hashSet.size());
    }
}

