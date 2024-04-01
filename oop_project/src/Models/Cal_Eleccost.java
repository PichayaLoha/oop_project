
package Models;

public class Cal_Eleccost extends Calculator{
    public static final int Elec_CostPerUnits = 30;
    public Cal_Eleccost(int meter) {
        super(Elec_CostPerUnits, meter, 0);
        this.totalcost = CalculateCost();
    }
    @Override
    public int CalculateCost() {
        return Elec_CostPerUnits * meter;
    }
    
}
