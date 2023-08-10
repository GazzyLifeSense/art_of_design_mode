public class ChartFactory {
    public static Chart getChart(String type) throws Exception {
        Chart chart = null;
        if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("初始化折线图设置...");
        } else if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化柱状图设置...");
        } else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化饼状图设置...");
        }
        if (chart == null)
            throw new Exception("不支持" + type + "类型图表");
        return chart;
    }
}
