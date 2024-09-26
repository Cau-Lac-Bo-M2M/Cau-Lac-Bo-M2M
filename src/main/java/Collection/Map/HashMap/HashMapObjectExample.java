package Collection.Map.HashMap;

import Collection.Map.Student;

import java.util.HashMap;
import java.util.Map;

public class HashMapObjectExample {
    public static void main(String[] args) {
        Map<Student, Integer> studentGrades = new HashMap<>();

        // Thêm các phần tử
        studentGrades.put(new Student("Alice", 101), 85);
        studentGrades.put(new Student("Bob", 102), 90);
        studentGrades.put(new Student("Charlie", 103), 78);

        // Lấy giá trị
        System.out.println("Grade for Alice: "
                + studentGrades.get(new Student("Alice", 101))); // Output: 85

        // Kiểm tra sự tồn tại của khóa
        System.out.println("Contains Charlie? "
                + studentGrades.containsKey(new Student("Charlie", 103))); // Output: true
        System.out.println(studentGrades.containsValue(78));
    }
}
