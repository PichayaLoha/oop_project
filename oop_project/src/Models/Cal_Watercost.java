
package Models;

public class Cal_Watercost extends Calculator {
    public static int Water_CostPerUnits = 25;
    
    public Cal_Watercost(int meter) {
        super(Water_CostPerUnits, meter, 0);
        this.totalcost = CalculateCost();
    }

    @Override
    public int CalculateCost() {
        return Water_CostPerUnits * meter;
    }

    
}
