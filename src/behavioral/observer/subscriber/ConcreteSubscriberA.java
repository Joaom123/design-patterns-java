package behavioral.observer.subscriber;

public class ConcreteSubscriberA implements Subscriber {
    @Override
    public void update() {
        System.out.println("update" + this.toString());
    }
}
