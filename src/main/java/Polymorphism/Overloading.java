package Polymorphism;

public class Overloading {
    public static class Calculator {
        public void sum(int a, int b ){
            System.out.println("Kết quả là : "+ (a + b));
        }

        public void sum(int a, int b , int c) {
            System.out.println("Kết quả là : " + (a + b + c));
        }

        public void sum(double a, double b , double c) {
            System.out.println("Kết quả là : " + (a + b + c));
        }
    }

    public static void main(String[] args) {
        Calculator mayTinh = new Calculator();

        mayTinh.sum(1, 2);
    }
}
