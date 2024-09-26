package Collection.Queue.PriorityQueue;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        // Ví dụ với Integer (kiểu dữ liệu cơ bản)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(5);
        pq.add(1);
        pq.add(3);

        System.out.println("Peek: " + pq.peek()); // 1
        System.out.println("Poll: " + pq.poll()); // 1
        System.out.println("Peek after poll: " + pq.peek()); // 3

        pq.remove(5);
        System.out.println("Size after removing 5: " + pq.size()); // 1
    }
}

