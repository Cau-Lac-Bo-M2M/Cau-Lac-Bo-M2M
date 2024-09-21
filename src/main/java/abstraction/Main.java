package abstraction;

public class Main {
    public static void main(String[] args) {
        Keyboard myKeyboard = new MechanicalKeyboard("QWERTY");

        myKeyboard.connect();
        System.out.println("Loại thiết bị: " + myKeyboard.getDeviceType());


        // Xử lý sự kiện của phím
        myKeyboard.onKeyPress(65);
        myKeyboard.onKeyRelease(65);

        myKeyboard.disconnect();
    }
}

