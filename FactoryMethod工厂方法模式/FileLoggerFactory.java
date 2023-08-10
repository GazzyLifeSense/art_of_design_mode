// 文件日志记录器工厂类：具体工厂
public class FileLoggerFactory extends LoggerFactory {
    public Logger createLogger() {
        Logger fileLogger = new FileLogger();
        // 创建文件...
        // 初始化记录器
        return fileLogger;
    }

    @Override
    public Logger createLogger(String args) {
        Logger fileLogger = new FileLogger();
        // 使用args作为文件名创建文件...
        // 初始化记录器
        return fileLogger;
    }

    @Override
    public Logger createLogger(Object obj) {
        Logger fileLogger = new FileLogger();
        // 使用obj作为文件信息对象创建文件...
        // 初始化记录器
        return fileLogger;
    }
}
