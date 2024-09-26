package Collection.Queue.ArrayDeque;

import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        // Ví dụ với Integer (kiểu dữ liệu cơ bản)
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.addLast(10);
        adq.addLast(20);
        adq.addFirst(5);

        System.out.println("Peek First: " + adq.peekFirst()); // 5
        System.out.println("Poll First: " + adq.pollFirst()); // 5
        System.out.println("Peek First after poll: " + adq.peekFirst()); // 10

        adq.removeFirstOccurrence(20);
        System.out.println("Size after removing 20: " + adq.size()); // 1
    }
}

