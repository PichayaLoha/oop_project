package Models;

import java.io.Serializable;

public class Userdata implements Serializable{
    
    private String firstName, lastName, tel, room_num, room_floor, room_start_rent, room_end_rent, user_nickname, user_age, user_nationality, user_occupation, user_idcard, user_birthday, user_gender, user_email, user_lineid, user_address;


    public Userdata(String room_num){

        
        this.room_num = room_num;
       
      
    }
    
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
     public Userdata(String firstName, String lastName, String tel, String room_num, String room_floor, String room_start_rent, String room_end_rent, String user_nickname, String user_age, String user_nationality, String user_occupation, String user_idcard, String user_birthday, String user_gender, String user_email, String user_lineid, String user_address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tel = tel;
        this.room_num = room_num;
        this.room_floor = room_floor;
        this.room_start_rent = room_start_rent;
        this.room_end_rent = room_end_rent;
        this.user_nickname = user_nickname;
        this.user_age = user_age;
        this.user_nationality = user_nationality;
        this.user_occupation = user_occupation;
        this.user_idcard = user_idcard;
        this.user_birthday = user_birthday;
        this.user_gender = user_gender;
        this.user_email = user_email;
        this.user_lineid = user_lineid;
        this.user_address = user_address;
     
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

    public String getRoom_end_rent() {
        return room_end_rent;
    }

    public void setRoom_end_rent(String room_end_rent) {
        this.room_end_rent = room_end_rent;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public String getUser_age() {
        return user_age;
    }

    public void setUser_age(String user_age) {
        this.user_age = user_age;
    }

    public String getUser_nationality() {
        return user_nationality;
    }

    public void setUser_nationality(String user_nationality) {
        this.user_nationality = user_nationality;
    }

    public String getUser_occupation() {
        return user_occupation;
    }

    public void setUser_occupation(String user_occupation) {
        this.user_occupation = user_occupation;
    }

    public String getUser_idcard() {
        return user_idcard;
    }

    public void setUser_idcard(String user_idcard) {
        this.user_idcard = user_idcard;
    }

    public String getUser_birthday() {
        return user_birthday;
    }

    public void setUser_birthday(String user_birthday) {
        this.user_birthday = user_birthday;
    }

    public String getUser_gender() {
        return user_gender;
    }

    public void setUser_gender(String user_gender) {
        this.user_gender = user_gender;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
    }

    public String getUser_lineid() {
        return user_lineid;
    }

    public void setUser_lineid(String user_lineid) {
        this.user_lineid = user_lineid;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
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

    
    