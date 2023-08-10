public class Main {
    public static void main(String[] args) {
        testLoggerFactory();
    }

    public static void testLoggerFactory() {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory();
        logger = factory.createLogger();
        logger.writeLog();

        factory = new DatabaseLoggerFactory();
        // 工厂类直接调用业务方法
        factory.writeLog();

        factory = (LoggerFactory) XMLUtil.getBean();
        logger = factory.createLogger();
        logger.writeLog();
    }
}
