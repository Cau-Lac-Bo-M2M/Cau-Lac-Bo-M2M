package Debug;

public class DebugDemo2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int sum = add(a, b);
        System.out.println("Tổng là: " + sum);
    }

    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }
}

