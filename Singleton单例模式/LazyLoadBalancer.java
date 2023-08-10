import java.util.*;

public class LazyLoadBalancer {
    // 存储唯一实例
    private static LazyLoadBalancer lb = null;

    // 私有构造函数
    private LazyLoadBalancer() {
    }

    // 服务器列表
    private ArrayList<String> serverList = new ArrayList<>();

    // 返回唯一实例
    public static LazyLoadBalancer getLoadBalancer() {
        if (lb == null) {
            synchronized (LazyLoadBalancer.class) {
                if (lb == null) {
                    lb = new LazyLoadBalancer();
                }
            }
        }
        return lb;
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