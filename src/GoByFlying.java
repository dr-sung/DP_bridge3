/*
 * participant: ConcreteImplementor
 */

public class GoByFlying implements GoImplementor {

    @Override
    public void goImplementation() {
        System.out.println("We should take an airplane. It is not reasonable to walk there!");
    }
    
}
