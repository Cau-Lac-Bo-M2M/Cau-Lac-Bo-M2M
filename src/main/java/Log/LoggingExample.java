package Log;

import java.util.logging.Logger;

public class LoggingExample {
    private static final Logger logger = Logger.getLogger(LoggingExample.class.getName());

    public static void main(String[] args) {
        logger.info("Thông tin thông thường");
        logger.warning("Cảnh báo");
        logger.severe("Lỗi nghiêm trọng");

        try {
            int result = 10 / 0;  // Gây ra ngoại lệ
        } catch (ArithmeticException e) {
            logger.severe("Lỗi: " + e.getMessage());
        }
    }
}
