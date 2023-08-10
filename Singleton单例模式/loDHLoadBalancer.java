import java.util.ArrayList;
import java.util.Random;

public class loDHLoadBalancer {
    // 私有构造函数
    private loDHLoadBalancer() {
    }

    // 服务器列表
    private ArrayList<String> serverList = new ArrayList<>();

    private static class LoadBalancerHolder {
        private static final loDHLoadBalancer lb = new loDHLoadBalancer();
    }

    // 返回唯一实例
    public static loDHLoadBalancer getLoadBalancer() {
        return LoadBalancerHolder.lb;
    }

    // 添加服务器
    public void addServer(String server) {
        serverList.add(server);
    }

    // 移除服务器
    public void removeServer(String server) {
        serverList.remove(server);
    }

    // 随机获取服务器
    public String getServer() {
        Random rand = new Random();
        int index = rand.nextInt(serverList.size());
        return serverList.get(index);
    }
}
