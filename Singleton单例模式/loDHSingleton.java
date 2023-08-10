public class loDHSingleton {
    private loDHSingleton() {
    }

    private static class SingletonHolder {
        private static final loDHSingleton instance = new loDHSingleton();
    }

    public static loDHSingleton getInstance() {
        return SingletonHolder.instance;
    }
}
