package Collection.Queue_Deque_PriorityQueue_ArrayDeque;

import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.offer(30);
        pq.offer(20);
        pq.offer(10);

        System.out.println("Phần tử ưu tiên nhất: " + pq.peek()); // 10
        pq.poll(); // Lấy và xóa 10
        System.out.println("Phần tử ưu tiên nhất tiếp theo: " + pq.peek()); // 20
    }
}

