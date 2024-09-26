package Collection.List.ListInterface.LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        // Thêm phần tử vào cuối danh sách
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Thêm phần tử vào đầu danh sách
        numbers.addFirst(5);

        // Thêm phần tử vào cuối danh sách
        numbers.addLast(35);

        // Truy xuất phần tử tại chỉ số 2
        System.out.println("Element at index 2: " + numbers.get(2));

        // Thay đổi phần tử tại chỉ số 1
        numbers.set(1, 25);

        // Xóa phần tử tại chỉ số 3
        numbers.remove(3);

        // Xóa phần tử đầu tiên
        numbers.removeFirst();

        // Xóa phần tử cuối cùng
        numbers.removeLast();

        // Kích thước danh sách
        System.out.println("Size of list: " + numbers.size());

        // Kiểm tra phần tử
        System.out.println("Contains 25: " + numbers.contains(25));

        // Xóa tất cả phần tử
        numbers.clear();
        System.out.println("Size after clear: " + numbers.size());
    }
}

