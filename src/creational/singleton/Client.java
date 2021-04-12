package creational.singleton;

public class Client {
    public static void main(String[] args) {
        DatabaseSingleton databaseSingleton = DatabaseSingleton.getDatabaseInstance();
        DatabaseSingleton databaseSingleton2 = DatabaseSingleton.getDatabaseInstance();

        System.out.println(databaseSingleton);
        System.out.println(databaseSingleton2);

        if(databaseSingleton == databaseSingleton2) {
            System.out.println("Same database instance");
        }
    }
}
