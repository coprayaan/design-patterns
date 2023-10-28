package singleton;

public class DbConnectionEarly {
    private static DbConnectionEarly instance = new DbConnectionEarly();
    private DbConnectionEarly(){}
    public static DbConnectionEarly getInstance(){
        return instance;
    }
}
