public class Main {
    public static void main(String[] args) {
        testBasicFactory();
        testChartFactory();
        testSimplifyFactory();
    }

    public static void testBasicFactory() {
        Product product1 = Factory.getProduct("A");
        product1.methodSame();
        product1.methodDiff();

        Product product2 = Factory.getProduct("B");
        product2.methodSame();
        product2.methodDiff();
    }

    public static void testChartFactory() {
        try {
            Chart chart = ChartFactory.getChart("histogram");
            chart.display();

            chart = ChartFactory.getChart("pie");
            chart.display();

            chart = ChartFactory.getChart("line");
            chart.display();

            chart = ChartFactory.getChart("scatter");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static void testSimplifyFactory() {
        Product product = Product.getProduct("a");
        product.methodSame();
        product.methodDiff();
    }
}
