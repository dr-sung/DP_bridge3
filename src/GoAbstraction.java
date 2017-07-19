/*
 * participant: Abstraction
 */

public abstract class GoAbstraction {
    
    protected GoImplementor go;
    
    public GoAbstraction(GoImplementor go) {
        this.go = go;
    }
    
    public abstract void goSomewhere();
}
