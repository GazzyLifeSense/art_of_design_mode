// 日志记录器工厂接口： 抽象工厂
public abstract class LoggerFactory {
    public abstract Logger createLogger();

    public abstract Logger createLogger(String args);

    public abstract Logger createLogger(Object obj);

    // （可选）在工厂类中直接调用日志记录器类的业务方法 writeLog()
    public void writeLog() {
        Logger logger = createLogger();
        logger.writeLog();
    }
}
