package singleton;

public enum DbConnectionEnum {
    INSTANCE;
    public void connect(){
        System.out.println("Connected to database");
    }
}
