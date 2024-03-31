
package Models;

public class Cal_Watercost extends Calculator {
    public static double Water_CostPerUnits = 25;
    
    public Cal_Watercost(double meter) {
        super(Water_CostPerUnits, meter, 0);
        this.totalcost = CalculateCost();
    }

    @Override
    public double CalculateCost() {
        return Water_CostPerUnits * meter;
    }

    
}
