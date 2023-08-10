public class LazySingleton {
    private static LazySingleton ls = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (ls == null) {
            // 锁定代码块，假如A，B两线程同时调用，线程A进入执行
            synchronized (LazySingleton.class) {
                // 双重检查，当线程A处理完后，线程B不知道实例是否已创建
                if (ls == null) {
                    ls = new LazySingleton();
                }
            }

        }
        return ls;
    }
}
