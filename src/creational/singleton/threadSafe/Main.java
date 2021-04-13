package creational.singleton.threadSafe;


public class Main {

    public static void main(String[] args) {
        Client client1 = new Client();
        Client client2 = new Client();

        Thread thread1 = new Thread(client1);
        Thread thread2 = new Thread(client2);

        thread1.start();
        thread2.start();
    }
}
