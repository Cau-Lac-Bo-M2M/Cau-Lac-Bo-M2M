package Collection.List.JavaCollectionsSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student {
    private String name;
    private int score;

    // Constructor
    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    // Getter và Setter
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', score=" + score + "}";
    }
}

public class NonComparable {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Duy", 90));
        students.add(new Student("Nam", 85));
        students.add(new Student("An", 95));

        // Sắp xếp sinh viên theo điểm số bằng Comparator
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getScore(), s2.getScore());
            }
        });

        // In danh sách sinh viên đã sắp xếp
        System.out.println(students); // [Student{name='Nam', score=85}, Student{name='Duy', score=90}, Student{name='An', score=95}]
    }
}

