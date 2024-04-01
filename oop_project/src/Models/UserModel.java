package Models;

import View.MainRooms;
import View.detail;
import View.CardRoomEmpty;
import View.CardUnused;
import View.ModelStatus;
import java.io.Serializable;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class UserModel implements Serializable{

    private ResultSet rs1 = null;
    private CardUnused card;
    private CardRoomEmpty card1;
    private detail userDel;
//   private MainRooms num1;

    public UserModel() {
        card = new CardUnused();
        card1 = new CardRoomEmpty();
        userDel = new detail();
//        num1 = new MainRooms();
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
//            System.out.println(rs1);
            while (rs.next()) {
                data = new Userdata(rs.getString("user_firstname"), rs.getString("user_lastname"), rs.getString("user_phone"), rs.getString("room_number"),
                        rs.getString("room_floor"), rs.getString("room_start_rent"));
                datalist.add(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(datalist);
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
//            System.out.println(rs1);
            while (rs1.next()) {
                data = new Userdata(rs1.getString("room_number"), rs1.getString("room_floor"));
                datalist.add(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(datalist);
        return datalist;

    }

    public void loadUserDataToCards(MainRooms mainRooms) {
        ArrayList<Userdata> dataList = getRoom();
        ArrayList<Userdata> dataList1 = getRoom1();

        for (int i = 0; i < dataList.size(); i++) {

            Userdata userData = dataList.get(i);
            CardUnused card = new CardUnused();
            card.getLb_roomnum().setText(userData.getRoom_floor() + "-" + userData.getRoom_num());
            card.getTf_phonenum().setText(userData.getTel());
            card.getTf_date().setText(userData.getRoom_start_rent());
            card.getTf_name().setText(userData.getFirstName() + " " + userData.getLastName());
            
            
            mainRooms.getPnRoom().add(card);

        }

        for (int j = 0; j < dataList1.size(); j++) {

            Userdata userData = dataList1.get(j);
            CardRoomEmpty card1 = new CardRoomEmpty();

            card1.getLb_roomnum().setText(userData.getRoom_floor() + "-" + userData.getRoom_num());

            mainRooms.getPnRoom().add(card1);
        }
    
        mainRooms.getCardStatus2().setData(new ModelStatus("ห้องมีผู้เช่า", dataList.size()));
        mainRooms.getCardStatus3().setData(new ModelStatus("ห้องว่าง", dataList1.size()));
    }

    public void loadUserDetail(String room) {
        ArrayList<Userdata> dataList2 = getUserDetail(room);
        for (int i = 0; i < dataList2.size(); i++) {
            Userdata userData = dataList2.get(i);
            detail userDel = new detail();

            userDel.getjTextField1().setText(userData.getFirstName());
            userDel.getjTextField2().setText(userData.getLastName());
            userDel.getjTextField3().setText(userData.getUser_nickname());
            userDel.getjTextField4().setText(userData.getUser_gender());
            userDel.getjTextField5().setText(userData.getUser_birthday());
            userDel.getjTextField6().setText(userData.getUser_age());
            userDel.getjTextField7().setText(userData.getUser_nationality());
            userDel.getjTextField8().setText(userData.getUser_occupation());
            userDel.getjTextField9().setText(userData.getUser_idcard());
            userDel.getjTextField10().setText(userData.getRoom_floor());
            userDel.getjTextField11().setText(userData.getTel());
            userDel.getjTextArea1().setText(userData.getUser_address());
            userDel.getjTextField12().setText(userData.getRoom_num());
            userDel.getjTextField13().setText(userData.getRoom_end_rent());
            userDel.getjTextField14().setText(userData.getRoom_start_rent());
            userDel.getjLabel1().setText("ห้อง  " + userData.getRoom_num());

            userDel.getjTextField1().setEditable(false);
            userDel.getjTextField2().setEditable(false);
            userDel.getjTextField3().setEditable(false);
            userDel.getjTextField4().setEditable(false);
            userDel.getjTextField5().setEditable(false);
            userDel.getjTextField6().setEditable(false);
            userDel.getjTextField7().setEditable(false);
            userDel.getjTextField8().setEditable(false);
            userDel.getjTextField9().setEditable(false);
            userDel.getjTextField10().setEditable(false);
            userDel.getjTextField11().setEditable(false);
            userDel.getjTextField12().setEditable(false);
            userDel.getjTextField13().setEditable(false);
            userDel.getjTextField14().setEditable(false);

            userDel.getjTextArea1().setEditable(false);
            userDel.getjButton5().setVisible(true);

            userDel.setVisible(true);
            System.out.println(userData.getFirstName());
        }
    }

    public void loadUserDetail1(String room) {
        ArrayList<Userdata> dataList2 = getUserDetail1(room);
        for (int i = 0; i < dataList2.size(); i++) {
            Userdata userData = dataList2.get(i);
            userDel = new detail();

                
            userDel.getjLabel1().setText("ห้อง   " + userData.getRoom_num());
            userDel.getjTextField10().setText(userData.getRoom_floor());
              userDel.getjTextField12().setText(userData.getRoom_num());

            userDel.setVisible(true);
            System.out.println("ชั้น  " + userData.getRoom_floor());
        }
    }

    public void insertUserData(String firstName, String lastName, String tel, String room_num,
            String room_floor, String room_start_rent, String room_end_rent, String user_nickname,
            String user_age, String user_nationality, String user_occupation, String user_idcard,
            String user_birthday, String user_gender, String user_address, String room_number) {
        Connector con = new Connector();
        room_number = room_number.substring(room_number.indexOf(" ") + 1).trim();
        System.out.println(room_number);

        try {
            String sql = "SELECT user_id FROM rooms WHERE room_number = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, room_number);
            ResultSet rs1 = preparedStatement.executeQuery();

            if (rs1.next()) {
                int userId = rs1.getInt("user_id");
                System.out.println(userId);
                if (userId == 0) {
                    System.out.println(room_number + " In");
                    insertNewUserData(firstName, lastName, tel, room_num, room_floor, room_start_rent, room_end_rent, user_nickname,
                            user_age, user_nationality, user_occupation, user_idcard, user_birthday, user_gender, user_address, room_number);
                } else {
                    System.out.println(room_number + " up");
                    updateUserData(firstName, lastName, tel, user_nickname, user_age, user_nationality, user_occupation, user_idcard,
                            user_birthday, user_gender, user_address, room_number);
                }
            } else {

                System.out.println("No data found");
            }
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }

    private void insertNewUserData(String firstName, String lastName, String tel, String room_num,
            String room_floor, String room_start_rent, String room_end_rent, String user_nickname,
            String user_age, String user_nationality, String user_occupation, String user_idcard,
            String user_birthday, String user_gender, String user_address, String room_number) {
        Connector con = new Connector();

        try {
            String sqlUsers = "INSERT INTO users (user_firstname, user_lastname, user_phone, user_nickname, user_age, user_nationality, user_occupation, user_idcard, user_birthday, user_gender, user_address) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preUsers = con.prepareStatement(sqlUsers);
            preUsers.setString(1, firstName);
            preUsers.setString(2, lastName);
            preUsers.setString(3, tel);
            preUsers.setString(4, user_nickname);
            preUsers.setString(5, user_age);
            preUsers.setString(6, user_nationality);
            preUsers.setString(7, user_occupation);
            preUsers.setString(8, user_idcard);
            preUsers.setString(9, user_birthday);
            preUsers.setString(10, user_gender);
            preUsers.setString(11, user_address);

            int rowsAffectedUsers = preUsers.executeUpdate();
            
            String sqlSelectUserId = "SELECT user_id FROM users WHERE user_idcard = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sqlSelectUserId);
            preparedStatement.setString(1, user_idcard);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            System.out.println(user_idcard);
        
         
             //ตรวจสอบการทำงานของ sql

            if (rowsAffectedUsers > 0) {

                if (rs.next()) {
                    Integer user_id = rs.getInt("user_id");
                  System.out.println(user_id);
                    updateRoomsTable(room_number, room_start_rent, room_end_rent, user_id);
                    System.out.println("Inserted success");
                     JOptionPane.showMessageDialog(null, "Inserted Success", "Success", JOptionPane.INFORMATION_MESSAGE);
                    userDel.dispose();
                } else {
                    System.out.println("User not found!");
                }
            } else {
                System.out.println("Faile insert");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Please fill in complete information.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void updateUserData(String firstName, String lastName, String tel, String user_nickname,
            String user_age, String user_nationality, String user_occupation, String user_idcard,
            String user_birthday, String user_gender, String user_address, String room_number) {
        Connector con = new Connector();
        System.out.println(room_number);
        try {
            String sql = "UPDATE users "
                    + "SET user_firstname = ?, "
                    + "    user_lastname = ?, "
                    + "    user_phone = ?, "
                    + "    user_nickname = ?, "
                    + "    user_age = ?, "
                    + "    user_nationality = ?, "
                    + "    user_occupation = ?, "
                    + "    user_idcard = ?, "
                    + "    user_birthday = ?, "
                    + "    user_gender = ?, "
                    + "    user_address = ? "
                    + "WHERE user_id = (SELECT user_id FROM rooms WHERE room_number = ?)";

            PreparedStatement preUsers = con.prepareStatement(sql);
            preUsers.setString(1, firstName);
            preUsers.setString(2, lastName);
            preUsers.setString(3, tel);
            preUsers.setString(4, user_nickname);
            preUsers.setString(5, user_age);
            preUsers.setString(6, user_nationality);
            preUsers.setString(7, user_occupation);
            preUsers.setString(8, user_idcard);
            preUsers.setString(9, user_birthday);
            preUsers.setString(10, user_gender);
            preUsers.setString(11, user_address);
            preUsers.setString(12, room_number);

            int rowsAffected = preUsers.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Updated success");
                 JOptionPane.showMessageDialog(null, "๊Updated Success", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Failed update");
               
            }
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Please fill in complete information.", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    private void updateRoomsTable(String room_number, String room_start_rent, String room_end_rent, Integer user_id) {
        Connector con = new Connector();
        room_number = room_number.substring(room_number.indexOf("  ") + 1).trim();
        try {
            System.out.println(room_number);
           String sql = "UPDATE rooms SET  room_start_rent = ?, room_end_rent = ?, room_status = ?, user_id = ? WHERE room_number = ?";

            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, room_start_rent);
            preparedStatement.setString(2, room_end_rent);
            preparedStatement.setString(3, "Inactive");
            preparedStatement.setInt(4, user_id);
            preparedStatement.setString(5, room_number);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Updated success");
            } else {
                System.out.println("Failed update");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Userdata> getUserDetail1(String room1) {
        ArrayList<Userdata> datalist = new ArrayList<Userdata>();
        Userdata data;
        Connector con = new Connector();
        try {

            String sql = "SELECT * "
                    + "FROM rooms "
                    + "WHERE room_number = '" + room1 + "'";

            ResultSet rs = con.getConnect(sql);
            System.out.println(room1);
            while (rs.next()) {
                data = new Userdata(
                        rs.getString("room_number"),
                        rs.getString("room_floor")
                );
                datalist.add(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(datalist);
        return datalist;

    }

    public ArrayList<Userdata> getUserDetail(String room1) {
        ArrayList<Userdata> datalist = new ArrayList<Userdata>();
        Userdata data;
        Connector con = new Connector();
        try {

            String sql = "SELECT * "
                    + "FROM users "
                    + "INNER JOIN rooms ON users.user_id = rooms.user_id "
                    + "WHERE rooms.room_number = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, room1);
            ResultSet rs = pstmt.executeQuery();

            System.out.println(room1);
            while (rs.next()) {
                data = new Userdata(rs.getString("user_firstname"),
                        rs.getString("user_lastname"),
                        rs.getString("user_phone"),
                        rs.getString("room_number"),
                        rs.getString("room_floor"),
                        rs.getString("room_start_rent"),
                        rs.getString("room_end_rent"),
                        rs.getString("user_nickname"),
                        rs.getString("user_age"),
                        rs.getString("user_nationality"),
                        rs.getString("user_occupation"),
                        rs.getString("user_idcard"),
                        rs.getString("user_birthday"),
                        rs.getString("user_gender"),
                        rs.getString("user_email"),
                        rs.getString("user_lineid"),
                        rs.getString("user_address"));
                datalist.add(data);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(datalist);
        return datalist;

    }
public void deleteRoom(String room_number){
    Connector con = new Connector();
    room_number = room_number.substring(room_number.indexOf("  ") + 1).trim();
    try {
        System.out.println(room_number);
        String sql = "UPDATE rooms SET room_start_rent = null, room_end_rent = null, room_status = 'active', user_id = null WHERE room_number = ?";
        String sql1 = "DELETE FROM users WHERE user_id IN (SELECT user_id FROM rooms WHERE room_number = ?)";

        PreparedStatement preUp = con.prepareStatement(sql);
        preUp.setString(1, room_number);

        PreparedStatement preDel = con.prepareStatement(sql1);
        preDel.setString(1, room_number);

        int rowsAffected = preUp.executeUpdate();
        int rowsAffected1 = preDel.executeUpdate();

        if (rowsAffected1 > 0 || rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Deletion successful", "Success", JOptionPane.INFORMATION_MESSAGE);
            System.out.println("Deletion success");
            
            
           userDel.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Deletion failed", "Error", JOptionPane.ERROR_MESSAGE);
            System.out.println("Deletion failed");
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    public static void main(String[] arguments) {

    }

}
