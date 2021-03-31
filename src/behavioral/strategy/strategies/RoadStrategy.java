package behavioral.strategy.strategies;

// The concrete road strategy class.
public class RoadStrategy implements RouteStrategy{
    @Override
    public void buildRoute(int a, int b) {
        // Here go the logic for creating a route between a and b
        System.out.println("Implementing road route");
    }
}
