package Collection.Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {
    public static void main(String[] args) {
        Deque<String> adq = new ArrayDeque<>();

        adq.addFirst("A");
        adq.addLast("B");
        adq.addLast("C");

        System.out.println("Phần tử đầu tiên: " + adq.peekFirst()); // A
        System.out.println("Phần tử cuối cùng: " + adq.peekLast()); // C
        System.out.println("Loại bỏ phần tử đầu tiên: " + adq.removeFirst()); // A
        System.out.println("Loại bỏ phần tử cuối cùng: " + adq.removeLast()); // C
    }
}
