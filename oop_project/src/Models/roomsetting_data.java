package Models;


public class roomsetting_data {
    private int room_det_price,water_per_unit, elec_per_unit, room_floor ;
    private String room_det_description;
    private Boolean  wifi, air, furniture, refridge, water_heater;
    public  roomsetting_data(int room_floor, int room_det_price, int water_per_unit, int elec_per_unit,
                           String room_det_description, Boolean wifi, Boolean air,
                          Boolean furniture, Boolean refridge, Boolean water_heater) {
        this.room_det_price = room_det_price;
        this.water_per_unit = water_per_unit;
        this.elec_per_unit = elec_per_unit;
        this.room_det_description = room_det_description;
        this.wifi = wifi;
        this.air = air;
        this.furniture = furniture;
        this.refridge = refridge;
        this.water_heater = water_heater;
    }
    
    public int getRoom_det_price() {
        return room_det_price;
    }

    public void setRoom_det_price(int room_det_price) {
        this.room_det_price = room_det_price;
    }

    public int getWater_per_unit() {
        return water_per_unit;
    }

    public Integer getRoom_floor() {
        return room_floor;
    }

    public void setRoom_floor(Integer room_floor) {
        this.room_floor = room_floor;
    }

    public void setWater_per_unit(int water_per_unit) {
        this.water_per_unit = water_per_unit;
    }

    public int getElec_per_unit() {
        return elec_per_unit;
    }

    public void setElec_per_unit(int elec_per_unit) {
        this.elec_per_unit = elec_per_unit;
    }

    public String getRoom_det_description() {
        return room_det_description;
    }

    public void setRoom_det_description(String room_det_description) {
        this.room_det_description = room_det_description;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Boolean getAir() {
        return air;
    }

    public void setAir(Boolean air) {
        this.air = air;
    }

    public Boolean getFurniture() {
        return furniture;
    }

    public void setFurniture(Boolean furniture) {
        this.furniture = furniture;
    }

    public Boolean getRefridge() {
        return refridge;
    }

    public void setRefridge(Boolean refridge) {
        this.refridge = refridge;
    }

    public Boolean getWater_heater() {
        return water_heater;
    }

    public void setWater_heater(Boolean water_heater) {
        this.water_heater = water_heater;
    }

    
    
}
