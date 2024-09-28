package Collection.Queue_Deque_PriorityQueue_ArrayDeque;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("A");
        queue.offer("B");
        queue.offer("C");

        System.out.println("Phần tử đầu tiên: " + queue.peek()); // A
        System.out.println("Loại bỏ phần tử: " + queue.poll()); // A
        System.out.println("Phần tử đầu tiên tiếp theo: " + queue.peek()); // B
    }
}
