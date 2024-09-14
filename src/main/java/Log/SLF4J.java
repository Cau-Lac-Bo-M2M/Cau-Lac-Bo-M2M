package Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SLF4J {
    private static final Logger logger = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        logger.debug("Đây là log DEBUG");
        logger.info("Đây là log INFO");
        logger.warn("Đây là log WARN");
        logger.error("Đây là log ERROR");

        try {
            int result = 10 / 0;
        } catch (Exception e) {
            logger.error("Có lỗi xảy ra: ", e);
        }
    }
}
