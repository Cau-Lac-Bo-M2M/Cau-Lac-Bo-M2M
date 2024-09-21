package abstraction;

public abstract class Keyboard implements InputDevice {

    protected String layout;

    public Keyboard(String layout) {
        this.layout = layout;
    }

    /**
     * Phương thức trừu tượng xử lý sự kiện nhấn phím.
     *
     * @param keyCode Mã của ASCII của phím được nhấn.
     */
    public abstract void onKeyPress(int keyCode);

    /**
     * Phương thức trừu tượng xử lý sự kiện nhả phím.
     *
     * @param keyCode Mã của ASCII của phím được nhả.
     */
    public abstract void onKeyRelease(int keyCode);

    @Override
    public void connect() {
        System.out.println("Bàn phím với layout  " + layout + " đã kết nối.");
    }

    @Override
    public void disconnect() {
        System.out.println("Bàn phím với layout " + layout + " đã ngắt kết nối.");
    }

    @Override
    public String getDeviceType() {
        return "Bàn phím";
    }
}

