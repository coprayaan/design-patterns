package singleton;
/*
 * GitHub Copilot: The `DbConnectionDblLock` class uses double-checked locking to ensure that only one instance of the class is created. This approach is more efficient than using a synchronized method for the entire `getInstance()` method, as it avoids the overhead of acquiring and releasing the lock every time the method is called. 
 * In the double-checked locking approach, the `if(instance == null)` check is performed outside the synchronized block to avoid the overhead of acquiring the lock if the instance has already been created. If the instance is null, then the synchronized block is entered, and another null check is performed inside the block to ensure that the instance has not been created by another thread while waiting to acquire the lock. If the instance is still null, then it is created and returned.
 * Overall, the double-checked locking approach provides better performance than using a synchronized method for the entire `getInstance()` method, but it requires careful implementation to ensure thread safety.
 * Possible ways to improve the code with respect to readability and performance include:
 * - Using an `AtomicReference` to ensure that the instance is created atomically and avoid the need for synchronization altogether.
 * - Using an `enum` to implement the singleton pattern, which provides better readability and thread safety guarantees.
 */
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
