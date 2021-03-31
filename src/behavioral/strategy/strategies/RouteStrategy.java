package behavioral.strategy.strategies;

// Common interface for all strategies
public interface RouteStrategy {
    // build a route between points a and b
    void buildRoute(int a, int b);
}
