/*
 * Bridge design pattern
 *   (c) Hong K. Sung
 */

public class Main {
    
    public static void main(String[] args) {
        
        GoImplementor bus = new GoByBus();
        GoImplementor fly = new GoByFlying();
        GoImplementor walk = new GoByWalk();
        
        GoAbstraction go1 = new GoRefinedAbstraction(bus);
        go1.goSomewhere();;
        
        GoAbstraction go2 = new GoRefinedAbstraction(fly);
        go2.goSomewhere();
        
        GoAbstraction go3 = new GoRefinedAbstraction(walk);
        go3.goSomewhere();
        
        // The results of Bridge design pattern
        // You can change GoRefinedAbstraction
        //          without affecting GoByBus, GoByWalk, etc
        // You can also change GoByBus (or GoByFlying, etc)
        //          without affecting GoRefinedAbstraction
        
    }
    
}
