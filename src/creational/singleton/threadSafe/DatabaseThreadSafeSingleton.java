package creational.singleton.threadSafe;

public class DatabaseThreadSafeSingleton {
    private static volatile DatabaseThreadSafeSingleton databaseThreadSafeSingleton;

    private DatabaseThreadSafeSingleton() {
        // Do something here...
    }

    // The approach taken here is called double-checked locking (DCL). It
    // exists to prevent race condition between multiple threads that may
    // attempt to get singleton instance at the same time, creating separate
    // instances as a result.
    //
    // It may seem that having the `result` variable here is completely
    // pointless. There is, however, a very important caveat when
    // implementing double-checked locking in Java, which is solved by
    // introducing this local variable.
    public static DatabaseThreadSafeSingleton getDatabaseThreadSafeSingleton() {
        DatabaseThreadSafeSingleton threadSafeSingleton = databaseThreadSafeSingleton;

        if (threadSafeSingleton != null)
            return threadSafeSingleton;

        synchronized (DatabaseThreadSafeSingleton.class) {
            if (databaseThreadSafeSingleton == null)
                //noinspection InstantiationOfUtilityClass
                databaseThreadSafeSingleton = new DatabaseThreadSafeSingleton();
            return databaseThreadSafeSingleton;
        }

    }
}
