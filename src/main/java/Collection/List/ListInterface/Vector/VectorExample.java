package Collection.List.ListInterface.Vector;

import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> numbers = new Vector<>();

        // Thêm phần tử vào cuối danh sách
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Thêm phần tử tại chỉ số 1
        numbers.add(1, 15);

        // Truy xuất phần tử tại chỉ số 2
        System.out.println("Element at index 2: " + numbers.get(2));

        // Thay đổi phần tử tại chỉ số 1
        numbers.set(1, 25);

        // Xóa phần tử tại chỉ số 3
        numbers.remove(3);

        // Kích thước danh sách
        System.out.println("Size of list: " + numbers.size());

        // Kiểm tra phần tử
        System.out.println("Contains 25: " + numbers.contains(25));

        // Xóa tất cả phần tử
        numbers.clear();
        System.out.println("Size after clear: " + numbers.size());
    }
}
