package singleton;

public class DbConnectionDblLock {
    private static DbConnectionDblLock instance = null;
    private DbConnectionDblLock(){}

    public static DbConnectionDblLock getInstance(){
        if(instance == null){
            synchronized(DbConnectionDblLock.class){
                if(instance == null){
                    instance = new DbConnectionDblLock();
                }
            }
        }
        return instance;
    }
}
