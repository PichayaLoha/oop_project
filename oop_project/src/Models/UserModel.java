package Models;

import View.MainRooms;
import View.CardRoomEmpty;
import View.CardUnused;
import View.ModelStatus;
import java.sql.*;
import java.util.*;

public class UserModel {

    private CardUnused card;
    private CardRoomEmpty card1;
    private MainRooms num1;
    
    public UserModel() {
        card = new CardUnused();
        card1 = new CardRoomEmpty();
    }

    public ArrayList<Userdata> getRoom() {
        ArrayList<Userdata> datalist = new ArrayList<Userdata>();
        Userdata data;
        Connector con = new Connector();
        try {
            String sql = "SELECT * "
                    + "FROM users "
                    + "INNER JOIN rooms ON users.user_id = rooms.user_id";

            String sql1 = "SELECT * "
                    + "FROM rooms "
                    + "WHERE room_status = 'active'";

            ResultSet rs = con.getConnect(sql);
            ResultSet rs1 = con.getConnect(sql1);
            System.out.println(rs1);
            while (rs.next()) {
                data = new Userdata(rs.getString("user_firstname"), rs.getString("user_lastname"), rs.getString("user_phone"), rs.getString("room_number"),
                         rs.getString("room_floor"), rs.getString("room_start_rent"));
                datalist.add(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(datalist);
        return datalist;

    }

    public ArrayList<Userdata> getRoom1() {
        ArrayList<Userdata> datalist = new ArrayList<Userdata>();
        Userdata data;
        Connector con = new Connector();
        try {

            String sql1 = "SELECT * "
                    + "FROM rooms "
                    + "WHERE room_status = 'active'";

            ResultSet rs1 = con.getConnect(sql1);
            System.out.println(rs1);
            while (rs1.next()) {
                data = new Userdata(rs1.getString("room_number"), rs1.getString("room_floor"));
                datalist.add(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(datalist);
        return datalist;

    }

    public void loadUserDataToCards(MainRooms mainRooms) {
        ArrayList<Userdata> dataList = getRoom();
        ArrayList<Userdata> dataList1 = getRoom1();
        num1 = new MainRooms();

        for (int i = 0; i < dataList.size(); i++) {
            System.out.println(dataList.size());
            Userdata userData = dataList.get(i);
            CardUnused card = new CardUnused();

            card.getLb_roomnum().setText(userData.getRoom_floor() + "-" + userData.getRoom_num());
            card.getTf_phonenum().setText(userData.getTel());
            card.getTf_date().setText(userData.getRoom_start_rent());
            card.getTf_name().setText(userData.getFirstName() + " " + userData.getLastName());

            mainRooms.getPnRoom().add(card);
        }

        for (int j = 0; j < dataList1.size(); j++) {
            System.out.println(dataList1.size());
            Userdata userData = dataList1.get(j);
            CardRoomEmpty card1 = new CardRoomEmpty();

            card1.getLb_roomnum().setText(userData.getRoom_floor() + "-" + userData.getRoom_num());

            mainRooms.getPnRoom().add(card1);
        }
        ;
        num1.getCardStatus2().setData(new ModelStatus("ห้องมีผู้เช่า", dataList.size()));

    }

    public static void main(String[] arguments) {
        UserModel userModel = new UserModel();
        ArrayList<Userdata> userDataList = userModel.getRoom1();

        for (Userdata userData : userDataList) {
            System.out.println(userData.getRoom_num() + "  " + userData.getRoom_floor());
        }
    }

}
