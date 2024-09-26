package Collection.Queue.ArrayDeque;

import java.util.ArrayDeque;

class Task {
    String description;

    Task(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}

public class ArrayDequeObjectExample {
    public static void main(String[] args) {
        ArrayDeque<Task> adq = new ArrayDeque<>();
        adq.addLast(new Task("Task 1"));
        adq.addLast(new Task("Task 2"));
        adq.addFirst(new Task("Task 0"));

        System.out.println("Peek First: " + adq.peekFirst()); // Task 0
        System.out.println("Poll First: " + adq.pollFirst()); // Task 0
        System.out.println("Peek First after poll: " + adq.peekFirst()); // Task 1

        adq.removeFirstOccurrence(new Task("Task 2"));
        System.out.println("Size after removing Task 2: " + adq.size()); // 1
    }
}

