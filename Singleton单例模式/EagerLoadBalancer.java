import java.util.*;

public class EagerLoadBalancer {
    // 存储唯一实例
    private static EagerLoadBalancer lb = new EagerLoadBalancer();

    // 私有构造函数
    private EagerLoadBalancer() {
    }

    // 服务器列表
    private ArrayList<String> serverList = new ArrayList<>();

    // 返回唯一实例
    public static EagerLoadBalancer getLoadBalancer() {
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
