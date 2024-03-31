package Models;

public class DataBill {
    private int w_meter, e_meter, common;
    private int pay_id, room_id, pay_room_cost, pay_water_cost, pay_elec_cost, pay_total_cost;
    private String pay_status;
    
//    public DataBill() {
//        this(0, 0, 0, 0, "");
//    }
//    
//    public DataBill(int pay_water_cost, int pay_elec_cost, int pay_room_cost, int pay_total_cost, String pay_status) {
//        this.pay_water_cost = pay_water_cost;
//        this.pay_elec_cost = pay_elec_cost;
//        this.pay_room_cost = pay_room_cost;
//        this.pay_total_cost = pay_total_cost;
//        this.pay_status = pay_status;
//    }
//    public DataBill(int pay_id) {
//        this.pay_id = pay_id;
//    }
    
    public void setpay_id(int pay_id) {
        this.pay_id = pay_id;
    }
    
    public int getpay_id() {
        return pay_id;
    }
    
    public void setw_meter(int w_meter) {
        this.w_meter = w_meter;
    }
    
    public void sete_meter(int e_meter) {
        this.e_meter = e_meter;
    }
    
    public void setcommon(int common) {
        this.common = common;
    }
    
    public int getw_meter() {
        return w_meter;
    }
    
    public int gete_meter() {
        return e_meter;
    }
    
    public int getcommon() {
        return common;
    }
    
    public void setroom_id(int room_id) {
        this.room_id = room_id;
    }
    
    public void setpay_room_cost(int pay_room_cost) {
        this.pay_room_cost = pay_room_cost;
    }
    
    public void setpay_water_cost(int pay_water_cost) {
        this.pay_water_cost = pay_water_cost;
    }
    
    public void setpay_elec_cost(int pay_elec_cost) {
        this.pay_elec_cost = pay_elec_cost;
    }
    
    public void setpay_total_cost(int pay_total_cost) {
        this.pay_total_cost = pay_total_cost;
    }
    
    public void setpay_status(String pay_status) {
        this.pay_status = pay_status;
    }
    
    public int getroom_id() {
        return room_id;
    }
    
    public int getpay_room_cost() {
        return pay_room_cost;
    }
    
    public int getpay_water_cost() {
        return pay_water_cost;
    }
    
    public int getpay_elec_cost() {
        return pay_elec_cost;
    }

    public int getpay_total_cost() {
        return pay_total_cost;
    }
    
    public String getpay_status() {
        return pay_status;
    }
}