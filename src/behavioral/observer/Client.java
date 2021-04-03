package behavioral.observer;

import behavioral.observer.publisher.Publisher;
import behavioral.observer.subscriber.ConcreteSubscriberA;

public class Client {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();

        ConcreteSubscriberA concreteSubscriberA = new ConcreteSubscriberA();
        ConcreteSubscriberA concreteSubscriberB = new ConcreteSubscriberA();
        ConcreteSubscriberA concreteSubscriberC = new ConcreteSubscriberA();

        publisher.subscribe(concreteSubscriberA);
        publisher.subscribe(concreteSubscriberB);
        publisher.subscribe(concreteSubscriberC);

        publisher.notifySubscribers();

        publisher.unsubscribe(concreteSubscriberA);

        publisher.notifySubscribers();
    }
}
