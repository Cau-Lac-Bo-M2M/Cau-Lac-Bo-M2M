package abstraction;

public interface InputDevice {

    /**
     * Kết nối thiết bị vào hệ thống.
     */
    void connect();

    /**
     * Ngắt kết nối thiết bị khỏi hệ thống
     */
    void disconnect();

    /**
     * Trả ra loại thiết bị dưới dạng chuỗi.
     *
     * @return Loại thiết bị  ("Bàn phím", "Chuột", v.v).
     */
    String getDeviceType();
}

