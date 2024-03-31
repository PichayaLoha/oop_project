
package Models;

public class Cal_Eleccost extends Calculator{
    public static double Elec_CostPerUnits = 30;
    public Cal_Eleccost(double costperunits, double meter, double totalcost) {
        super(Elec_CostPerUnits, meter, 0);
        this.totalcost = CalculateCost();
    }
    @Override
    public double CalculateCost() {
        return Elec_CostPerUnits * meter;
    }
    
}
