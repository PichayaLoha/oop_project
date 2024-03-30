package Models;

import java.io.Serializable;

public class DataBill implements Serializable {
    private int room_id, pay_room_cost, pay_water_cost, pay_elec_cost, pay_total_cost;
    private String pay_status;
//    private int w_meter, e_meter, rent, common_fee;
//    private int room_id, pay_room_cost, pay_water_cost, pay_elec_cost, pay_total_cost;
//    private String pay_status, room_number, room_status, btn;
    
    public DataBill() {
        this(0, 0, 0, 0, "");
    }
    
    public DataBill(int pay_water_cost, int pay_elec_cost, int pay_room_cost, int pay_total_cost, String pay_status) {
        this.pay_water_cost = pay_water_cost;
        this.pay_elec_cost = pay_elec_cost;
        this.pay_room_cost = pay_room_cost;
        this.pay_total_cost = pay_total_cost;
        this.pay_status = pay_status;
    }
    
//    public DataBill(String room_number, String room_status, int w_meter, int pay_water_cost, int e_meter, int pay_elec_cost, int pay_room_cost, int common_fee, int rent, int pay_total_cost, String pay_status, String btn) {
//        this.room_number = room_number;
//        this.room_status = room_status;
//        this.w_meter = w_meter;
//        this.pay_water_cost = pay_water_cost;
//        this.e_meter = e_meter;
//        this.pay_elec_cost = pay_elec_cost;
//        this.pay_room_cost = pay_room_cost;
//        this.common_fee = common_fee;
//        this.rent = rent;
//        this.pay_total_cost = pay_total_cost;
//        this.pay_status = pay_status;
//        this.btn = btn;
//    }


    
//    public DataBill(int room_id) {
//        this.room_id = room_id;
//    }
    
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