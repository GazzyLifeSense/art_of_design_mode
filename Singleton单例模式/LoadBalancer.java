import java.util.*;

public class LoadBalancer{
    private static LoadBalancer lb = null;

    private LoadBalancer(){ }

    private ArrayList<String> serverList = new ArrayList();

    public static LoadBalancer getLoadBalancer(){
        if(lb == null){
            lb = new LoadBalancer();
        }
        return lb;
    }

    public void addServer(String server){
        serverList.add(server);
    }

    public String getServer(){
        Random rand = new Random();
        int index = rand.nextInt(serverList.size());
        return serverList.get(index);
    }
    
}