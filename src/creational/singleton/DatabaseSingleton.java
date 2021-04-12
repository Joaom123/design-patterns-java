package creational.singleton;

public class DatabaseSingleton {
    private static DatabaseSingleton databaseInstance;

    //The constructor must be private
    private DatabaseSingleton() {
        // Do Something...
    }

    public static DatabaseSingleton getDatabaseInstance() {
        if (databaseInstance == null)
            //noinspection InstantiationOfUtilityClass
            databaseInstance = new DatabaseSingleton();
        return databaseInstance;
    }
}
