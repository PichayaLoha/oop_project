package Models;

import java.io.Serializable;

public class DataRoom implements Serializable{
    private String room_number, room_status;
    private int room_floor, room_id;
    
    public DataRoom() {
        this(0, "", 0, "");
    }
    
    public DataRoom(int room_id, String room_number, int room_floor, String room_status) {
        this.room_id = room_id;
        this.room_number = room_number;
        this.room_floor = room_floor;
        this.room_status = room_status;
    }
    
    public void setroom_floor(int room_floor) {
        this.room_floor = room_floor;
    }
    
    public int getroom_floor() {
        return room_floor;
    }
    public void setroom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getroom_id() {
        return room_id;
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
