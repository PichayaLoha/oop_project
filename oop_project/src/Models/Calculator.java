
package Models;

public abstract class Calculator implements Calculate {
    public int costperunits;
    public int meter;
    public int totalcost;
    
    public Calculator(int costperunits, int meter, int totalcost) {
        this.costperunits = costperunits;
        this.meter = meter;
        this.totalcost = totalcost;
    }
    
}
