package Models;

import java.io.Serializable;

public class Userdata implements Serializable{
    
    private String firstName, lastName, tel, room_num, room_floor, room_start_rent;
    
    public Userdata(String room_num,String room_floor){

        
        this.room_num = room_num;
         this.room_floor =  room_floor;
      
    }
    
    public Userdata(String firstName, String lastName, String tel, String room_num,String room_floor, String room_start_rent){

        this.firstName = firstName;
        this.lastName = lastName;
        this.tel = tel;
        this.room_num = room_num;
         this.room_floor =  room_floor;
         this.room_start_rent = room_start_rent;
    }

    public String getRoom_start_rent() {
        return room_start_rent;
    }

    public void setRoom_start_rent(String room_start_rent) {
        this.room_start_rent = room_start_rent;
    }

    public String getRoom_floor() {
        return room_floor;
    }

    public void setRoom_floor(String room_floor) {
        this.room_floor = room_floor;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getRoom_num() {
        return room_num;
    }

    public void setRoom_num(String room_num) {
        this.room_num = room_num;
    }


    

    }

    
    