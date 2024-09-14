package Array;

import java.util.ArrayList;

public class demoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        System.out.println("ArrayList sau khi thêm phần tử: " + list);

        list.remove("Banana");
        System.out.println("ArrayList sau khi xóa phần tử: " + list);

        String fruit = list.get(1); // không thể dùng list[n]
        System.out.println("Phần tử ở vị trí thứ 2: " + fruit);
        System.out.println("-----------------------------------");

        //autoboxing = tự động chuyển primitive type thành đối tượng tương ứng
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10); // int -> Integer

        numbers.add(20);
        numbers.add(30);

        System.out.println("Các phần tử trong ArrayList: " + numbers);

        int num = numbers.get(1); // Integer -> int
        System.out.println("Phần tử ở vị trí thứ 2: " + num);
    }
}
