package Collection.List.ListInterface.LinkedList;

import java.util.LinkedList;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + " years old)";
    }
}

public class LinkedListObjectExample {
    public static void main(String[] args) {
        LinkedList<Person> people = new LinkedList<>();

        // Thêm các đối tượng Person
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));

        // Thêm đối tượng vào đầu danh sách
        people.addFirst(new Person("Charlie", 28));

        // Thêm đối tượng vào cuối danh sách
        people.addLast(new Person("David", 35));

        // Truy xuất đối tượng tại chỉ số 2
        System.out.println("Person at index 2: " + people.get(2));

        // Thay đổi đối tượng tại chỉ số 1
        people.set(1, new Person("Eve", 40));

        // Xóa đối tượng tại chỉ số 0
        people.remove(0);

        // Xóa đối tượng đầu tiên
        people.removeFirst();

        // Xóa đối tượng cuối cùng
        people.removeLast();

        // Kích thước danh sách
        System.out.println("Size of list: " + people.size());

        // Kiểm tra đối tượng
        System.out.println("Contains Bob: " + people.contains(new Person("Bob", 25)));

        // Xóa tất cả đối tượng
        people.clear();
        System.out.println("Size after clear: " + people.size());
    }
}

