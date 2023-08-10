// 饿汉式可确保单例对象的唯一性
public class EagerSingleton {
    private static final EagerSingleton es = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return es;
    }
}
