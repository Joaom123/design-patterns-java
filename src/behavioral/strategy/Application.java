package behavioral.strategy;

import behavioral.strategy.context.Navigator;
import behavioral.strategy.strategies.RoadStrategy;
import behavioral.strategy.strategies.WalkingStrategy;

// This is the Client class. Here the desired route strategy will be choose.
public class Application {

    public static void main(String[] args) {
        Navigator navigator = new Navigator();
        RoadStrategy roadStrategy = new RoadStrategy();
        WalkingStrategy walkingStrategy = new WalkingStrategy();

        // Just for demo. The desire strategy could be select by a UI, for example.
        // Using road strategy
        navigator.setRouteStrategy(roadStrategy);
        navigator.execute();

        System.out.println("Changing route strategy");

        // Using walking strategy
        navigator.setRouteStrategy(walkingStrategy);
        navigator.execute();

    }
}
