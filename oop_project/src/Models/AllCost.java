package Models;

public class AllCost implements Calculate {
    private double waterAmount, electricAmount, totalAmount, totalCost;
    private double waterMeter, elecMeter, rent, common_fee; 
    
    public AllCost(double waterAmount, double electricAmount, double totalAmount, double totalCost, double waterMeter, double elecMeter, double rent, double common_fee) {
        this.waterAmount = waterAmount;
        this.electricAmount = electricAmount;
        this.totalAmount = totalAmount;
        this.totalCost = totalCost;
        this.waterMeter = waterMeter;
        this.elecMeter = elecMeter;
        this.rent = rent;
        this.common_fee = common_fee;
    }

    @Override
    public void CalculateCost() {
        
    }
}
