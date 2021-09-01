package structural.decorator;

public class SMSDecorator implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("This message was send via SMS");
        System.out.println(message);
    }
}
