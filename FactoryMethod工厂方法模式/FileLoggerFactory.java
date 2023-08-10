// 文件日志记录器工厂类：具体工厂
public class FileLoggerFactory extends LoggerFactory {
    public Logger createLogger() {
        Logger fileLogger = new FileLogger();
        // 创建文件...
        // 初始化记录器
        return fileLogger;
    }
}
