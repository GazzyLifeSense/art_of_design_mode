public class Main {
    public static void main(String[] args) {
        testLoggerFactory();
    }

    public static void testLoggerFactory() {
        LoggerFactory lf;
        Logger logger;
        lf = new FileLoggerFactory();
        logger = lf.createLogger();
        logger.writeLog();

        lf = new DatabaseLoggerFactory();
        logger = lf.createLogger();
        logger.writeLog();
    }
}
