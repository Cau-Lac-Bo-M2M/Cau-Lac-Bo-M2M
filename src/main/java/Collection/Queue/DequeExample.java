package Collection.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();
        deque.addFirst("A");
        deque.addLast("B");
        deque.addLast("C");

        System.out.println("Phần tử đầu tiên: " + deque.peekFirst()); // A
        System.out.println("Phần tử cuối cùng: " + deque.peekLast()); // C
        System.out.println("Loại bỏ phần tử đầu tiên: " + deque.removeFirst()); // A
        System.out.println("Loại bỏ phần tử cuối cùng: " + deque.removeLast()); // C

        for (String s : deque) {
            System.out.println(s);
        }
    }
}

