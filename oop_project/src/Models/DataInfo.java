
package Models;

public class DataInfo {
    private int pay_id;
    private int w_meter, e_meter, common_fee;
    private int pay_room_cost, pay_water_cost, pay_elec_cost, pay_total_cost;
    private String pay_status, room_number, room_status, btn;
    
    public DataInfo(int pay_id, String room_number, String room_status, int w_meter, int pay_water_cost, int e_meter, int pay_elec_cost, int pay_room_cost, int common_fee, int pay_total_cost, String pay_status) {
        this.pay_id = pay_id;
        this.room_number = room_number;
        this.room_status = room_status;
        this.w_meter = w_meter;
        this.pay_water_cost = pay_water_cost;
        this.e_meter = e_meter;
        this.pay_elec_cost = pay_elec_cost;
        this.pay_room_cost = pay_room_cost;
        this.common_fee = common_fee;
        this.pay_total_cost = pay_total_cost;
        this.pay_status = pay_status; 
    }
    
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
    
    public void setcommon_fee(int common_fee) {
        this.common_fee = common_fee;
    }
    
    public void setbtn(String btn) {
        this.btn = btn;
    }
    
    public String getbtn() {
        return btn;
    }
    
    public double getw_meter() {
        return w_meter;
    }
    
    public double gete_meter() {
        return e_meter;
    }
    
    public double getcommon_fee() {
        return common_fee;
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
    
    public double getpay_room_cost() {
        return pay_room_cost;
    }
    
    public double getpay_water_cost() {
        return pay_water_cost;
    }
    
    public double getpay_elec_cost() {
        return pay_elec_cost;
    }

    public double getpay_total_cost() {
        return pay_total_cost;
    }
    
    public String getpay_status() {
        return pay_status;
    }
    
    public void setroom_number(String room_number) {
        this.room_number = room_number;
    }
    
    public void setroom_status(String room_status) {
        this.room_status = room_status;
    }
    
    public String getroom_number() {
        return room_number;
    }
    
    public String getroom_status() {
        return room_status;
    }
}
