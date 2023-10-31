package creational_patterns.singleton;

public class DbConnectionSync {
    private static DbConnectionSync instance = null;
    private DbConnectionSync(){}

    public static synchronized DbConnectionSync getInstance(){
        if(instance == null){
            instance = new DbConnectionSync();
        }
        return instance;
    }
}
