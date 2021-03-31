package behavioral.strategy.strategies;

public class WalkingStrategy implements RouteStrategy{
    @Override
    public void buildRoute(int a, int b) {
        // Here go the logic for creating a route between a and b
        System.out.println("Implementing walking route");
    }
}
