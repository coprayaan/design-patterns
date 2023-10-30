package singleton;

public class DbConnectionLazy{
    private static DbConnectionLazy instance = null;
    private DbConnectionLazy(){}

    public static DbConnectionLazy getInstance(){
        if(instance == null){
            instance = new DbConnectionLazy();
        }
        return instance;
    }
}