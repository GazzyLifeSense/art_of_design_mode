public class Main {
    public static void main(String[] args) {
        // testTaskManager();
        // testLoDH();

        testLazyLoadBalancer();
        // testEagerLoadBalancer();
        // testLoDHLoadBalancer();
    }

    static boolean isSame(Object obj1, Object obj2) {
        return obj1 == obj2 ? true : false;
    }

    static void testTaskManager() {
        TaskManager tm1 = TaskManager.getInstance();
        TaskManager tm2 = TaskManager.getInstance();
        System.out.println(isSame(tm1, tm2));
    }

    static void testLoDH() {
        loDHSingleton ls1 = loDHSingleton.getInstance();
        loDHSingleton ls2 = loDHSingleton.getInstance();
        System.out.println(isSame(ls1, ls2));
    }

    static void testLazyLoadBalancer() {
        LazyLoadBalancer lb1 = LazyLoadBalancer.getLoadBalancer();
        LazyLoadBalancer lb2 = LazyLoadBalancer.getLoadBalancer();
        LazyLoadBalancer lb3 = LazyLoadBalancer.getLoadBalancer();
        LazyLoadBalancer lb4 = LazyLoadBalancer.getLoadBalancer();
        lb1.addServer("server1");
        lb2.addServer("server2");
        lb3.addServer("server3");
        lb4.addServer("server4");
        lb1.removeServer("server2");
        System.out.println(isSame(lb1, lb2) && isSame(lb2, lb3) && isSame(lb3, lb4) && isSame(lb4, lb1));
        for (int i = 0; i < 10; i++) {
            System.out.println("请求分发至: " + lb1.getServer());
        }
    }

    static void testEagerLoadBalancer() {
        EagerLoadBalancer lb1 = EagerLoadBalancer.getLoadBalancer();
        EagerLoadBalancer lb2 = EagerLoadBalancer.getLoadBalancer();
        EagerLoadBalancer lb3 = EagerLoadBalancer.getLoadBalancer();
        EagerLoadBalancer lb4 = EagerLoadBalancer.getLoadBalancer();
        lb1.addServer("server1");
        lb2.addServer("server2");
        lb3.addServer("server3");
        lb4.addServer("server4");
        lb1.removeServer("server2");
        System.out.println(isSame(lb1, lb2) && isSame(lb2, lb3) && isSame(lb3, lb4) && isSame(lb4, lb1));
        for (int i = 0; i < 10; i++) {
            System.out.println("请求分发至: " + lb1.getServer());
        }
    }

    static void testLoDHLoadBalancer() {
        loDHLoadBalancer lb1 = loDHLoadBalancer.getLoadBalancer();
        loDHLoadBalancer lb2 = loDHLoadBalancer.getLoadBalancer();
        loDHLoadBalancer lb3 = loDHLoadBalancer.getLoadBalancer();
        loDHLoadBalancer lb4 = loDHLoadBalancer.getLoadBalancer();
        lb1.addServer("server1");
        lb2.addServer("server2");
        lb3.addServer("server3");
        lb4.addServer("server4");
        lb1.removeServer("server2");
        System.out.println(isSame(lb1, lb2) && isSame(lb2, lb3) && isSame(lb3, lb4) && isSame(lb4, lb1));
        for (int i = 0; i < 10; i++) {
            System.out.println("请求分发至: " + lb1.getServer());
        }
    }
}
