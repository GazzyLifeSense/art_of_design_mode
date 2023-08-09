import java.util.*;

public class Main{
    public static void main(String[] args) {
        TaskManager tm1 = TaskManager.getInstance();
        TaskManager tm2 = TaskManager.getInstance();
        System.out.println(isSame(tm1, tm2));

        LoadBalancer lb1 = LoadBalancer.getLoadBalancer();
        LoadBalancer lb2 = LoadBalancer.getLoadBalancer();
        LoadBalancer lb3 = LoadBalancer.getLoadBalancer();
        LoadBalancer lb4 = LoadBalancer.getLoadBalancer();
        lb1.addServer("server1");
        lb2.addServer("server2");
        lb3.addServer("server3");
        lb4.addServer("server4");
        System.out.println(isSame(lb1, lb2) && isSame(lb2, lb3) && isSame(lb3, lb4) && isSame(lb4, lb1));
        
        for(int i = 0; i < 10; i++){
            System.out.println(lb1.getServer());
        }
    }

    static boolean isSame(Object obj1, Object obj2){
        return obj1 == obj2 ? true : false;
    }
}
