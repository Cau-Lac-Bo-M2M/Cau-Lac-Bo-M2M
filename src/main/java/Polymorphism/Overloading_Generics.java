package Polymorphism;

public class Overloading_Generics {
    public static class Overloading{
        public void print(int a) {
            System.out.println("Integer: " + a);
        }

        public void print(String a) {
            System.out.println("String: " + a);
        }

        public void print(double a) {
            System.out.println("String: " + a);
        }
    };

    public static class Generics<T>{
        private T value;

        public void setValue(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void print(){
            System.out.println(this.value);
        }
    }

    public static void main(String[] args) {
        //ví dụ về overloading
        Overloading o = new Overloading();
        o.print("abc"); // dữ liệu đưa vào sẽ được mình đin nghĩa trước

        Generics<String> g = new Generics<>();
        g.setValue("Đây là chuỗi");
        g.print();
    }
}
