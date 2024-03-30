package Model;

public class DataInfo {

//    public int getRoom_num() {
//        return room_num;
//    }
//
//    public void setRoom_num(int room_num) {
//        this.room_num = room_num;
//    }
//
//    public int getRoom_floor() {
//        return room_floor;
//    }
//
//    public void setRoom_floor(int room_floor) {
//        this.room_floor = room_floor;
//    }

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

//    public String getStart_rent() {
//        return start_rent;
//    }
//
//    public void setStart_rent(String start_rent) {
//        this.start_rent = start_rent;
//    }
//    private int room_num, room_floor;
    private String firstName, lastName, tel;
    
    public DataInfo(String firstName, String lastName, String tel){
//        this.room_num =room_num;
//        this.room_floor =room_floor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.tel = tel;
//        this.start_rent = start_rent;
    }

    
    
    
}
