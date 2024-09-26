package Collection.Map.SortedMap.TreeMap;

import java.util.Map;
import java.util.TreeMap;

class Employee implements Comparable<Employee> {
    String name;
    int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" + "name='" + name + "', id=" + id + '}';
    }


    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }
}

public class TreeMapObjectExample {
    public static void main(String[] args) {
        Map<Employee, String> employeeMap = new TreeMap<>();

        // Thêm các phần tử
        employeeMap.put(new Employee("Alice", 101), "Developer");
        employeeMap.put(new Employee("Bob", 102), "Manager");
        employeeMap.put(new Employee("Charlie", 103), "Analyst");

        // Lấy giá trị
        System.out.println("Position for Alice: " + employeeMap.get(new Employee("Alice", 101))); // Output: Developer

        // Kiểm tra sự tồn tại của khóa
        System.out.println("Contains Bob? " + employeeMap.containsKey(new Employee("Bob", 102))); // Output: true

        // Lấy các phần tử sắp xếp theo khóa
        System.out.println("First Employee: " + employeeMap.entrySet().iterator().next()); // Output: Employee{name='Alice', id=101}=Developer
        System.out.println("Last Employee: " + employeeMap.entrySet().stream().reduce((first, second) -> second).get()); // Output: Employee{name='Charlie', id=103}=Analyst
    }
}

