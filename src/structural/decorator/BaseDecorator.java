package structural.decorator;

public class BaseDecorator implements Notifier{
    private Notifier notifierWrappee;

    public BaseDecorator(Notifier notifierWrappee) {
        this.notifierWrappee = notifierWrappee;
    }


    @Override
    public void send(String message) {
        notifierWrappee.send(message);
    }
}
