
package Models;

public abstract class Calculator implements Calculate {
    protected double costperunits;
    protected double meter;
    protected double totalcost;
    
    public Calculator(double costperunits, double meter, double totalcost) {
        this.costperunits = costperunits;
        this.meter = meter;
        this.totalcost = totalcost;
    }
    
}
