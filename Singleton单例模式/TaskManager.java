public class TaskManager{
    private static TaskManager tm = null;

    private TaskManager(){}
    
    public static TaskManager getInstance(){
        if(tm == null){
            tm = new TaskManager();
        }
        return tm;
    }
}