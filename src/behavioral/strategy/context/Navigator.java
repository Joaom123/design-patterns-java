package behavioral.strategy.context;

import behavioral.strategy.strategies.RouteStrategy;

// This is the context class. This class will be called by the client, in this case Application class.
// The client class is responsible for choosing what strategy will be used.
public class Navigator {
    private RouteStrategy routeStrategy;

    public void setRouteStrategy(RouteStrategy routeStrategy) {
        this.routeStrategy = routeStrategy;
    }

    public void execute(){
        routeStrategy.buildRoute(1, 2);
    }
}
