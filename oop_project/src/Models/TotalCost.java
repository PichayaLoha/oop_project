
package Models;

public class TotalCost implements Calculate{
    private Cal_Watercost CalwaterCost;
    private Cal_Eleccost CalelecCost;
    private int common;
    private int rent;
    public TotalCost(int w_meter, int e_meter, int common, int rent) {
        this.common = common;
        this.rent = rent;
        CalwaterCost = new Cal_Watercost(w_meter);
        CalelecCost = new Cal_Eleccost(e_meter);
    }

    @Override
    public int CalculateCost() {
        int waterCost =  CalwaterCost.CalculateCost();
        int elecCost = CalelecCost.CalculateCost();
        return waterCost + elecCost + common + rent;
    }

    
}
