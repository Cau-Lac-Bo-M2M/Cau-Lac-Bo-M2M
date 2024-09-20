package Polymorphism;

public class Overriding {
    abstract static class DongVat{
        public abstract void Keu();

        public void Noi(){
            System.out.println("nói cái gì !");
        }
    };

    public static class ConMeo extends DongVat{
        @Override
        public void Keu() {
            System.out.println("Mèo Mèo");
        }
    }

    public static class ConCho extends DongVat{
        @Override
        public void Keu() {
            System.out.println("Gâu Gâu");
        }
    }

    public static void main(String[] args) {
        ConMeo conMeo = new ConMeo();
        conMeo.Keu();
        conMeo.Noi();

        ConCho conCho = new ConCho();
        conCho.Keu();
        conCho.Noi();
    }
}
