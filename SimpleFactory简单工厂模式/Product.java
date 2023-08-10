public abstract class Product {
    // 所有产品类的公共业务方法
    public void methodSame() {
        System.out.println("I am a Product!");
    }

    // 声明抽象业务方法
    public abstract void methodDiff();

    // 简化简单工厂：将抽象产品类和工厂类合并，将静态工厂方法移至抽象产品类中
    public static Product getProduct(String arg) {
        Product product = null;
        if (arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
        } else if (arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
        }
        return product;
    }
}
