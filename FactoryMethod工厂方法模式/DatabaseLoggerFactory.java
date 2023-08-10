// 数据库日志记录器工厂类：具体工厂
public class DatabaseLoggerFactory extends LoggerFactory {
    public Logger createLogger() {
        // 连接数据库
        Logger logger = new DatabaseLogger();
        // 初始化记录器
        return logger;
    }
}
