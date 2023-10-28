package singleton;

public class DbConnectionLazy{
    private static DbConnection instance = null;
    private DbConnection(){}

    public static DbConnection getInstance(){
        if(instance == null){
            instance = new DbConnection();
        }
        return instance;
    }
}