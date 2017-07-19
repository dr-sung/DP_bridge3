/*
 * participant: RefinedAbstraction
 */

public class GoRefinedAbstraction extends GoAbstraction {

    public GoRefinedAbstraction(GoImplementor go) {
        super(go);
    }

    @Override
    public void goSomewhere() {
        System.out.println("I want to go from Edmond to New York!");
        go.goImplementation();
    }
    
}
