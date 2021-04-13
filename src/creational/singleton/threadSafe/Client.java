package creational.singleton.threadSafe;

public class Client implements Runnable {
    @Override
    public void run() {
        System.out.println("Wait 3 secs for connection");

        try {
            DatabaseThreadSafeSingleton databaseThreadSafeSingleton =
                    DatabaseThreadSafeSingleton.getDatabaseThreadSafeSingleton();
            Thread.sleep(3000);
            System.out.println(this + " is using the database instance: " + databaseThreadSafeSingleton);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
