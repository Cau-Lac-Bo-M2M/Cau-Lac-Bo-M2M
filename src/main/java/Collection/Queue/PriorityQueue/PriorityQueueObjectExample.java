package Collection.Queue.PriorityQueue;

import java.util.PriorityQueue;

class Person implements Comparable<Person> {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.age, other.age);
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class PriorityQueueObjectExample {
    public static void main(String[] args) {
        PriorityQueue<Person> pq = new PriorityQueue<>();
        pq.add(new Person("Alice", 30));
        pq.add(new Person("Bob", 25));
        pq.add(new Person("Charlie", 35));

        System.out.println("Peek: " + pq.peek()); // Bob (25)
        System.out.println("Poll: " + pq.poll()); // Bob (25)
        System.out.println("Peek after poll: " + pq.peek()); // Alice (30)

        pq.remove(new Person("Charlie", 35));
        System.out.println("Size after removing Charlie: " + pq.size()); // 1
    }
}

