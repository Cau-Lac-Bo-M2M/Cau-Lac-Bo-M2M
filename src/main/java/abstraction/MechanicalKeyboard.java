package abstraction;

public class MechanicalKeyboard extends Keyboard {

    public MechanicalKeyboard(String layout) {
        super(layout);
    }

    @Override
    public void onKeyPress(int keyCode) {
        System.out.println("Phím cơ với mã " + keyCode + " được nhấn.");
    }

    @Override
    public void onKeyRelease(int keyCode) {
        System.out.println("Phím cơ với mã " + keyCode + " được nhả.");
    }

}

