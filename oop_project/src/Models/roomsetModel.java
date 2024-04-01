package Models;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import View.unavaibleroom;
import View.setting;
import Models.roomsetting_data;

public class roomsetModel {

    private unavaibleroom room;
    private setting sett;
    private roomsetting_data data;

    public ArrayList<roomsetting_data> getRoomSetAll(String roomnum) {

        ArrayList<roomsetting_data> datalistAll = new ArrayList<roomsetting_data>();
        roomsetting_data dataAll;
        Connector con = new Connector();

//        String emp_idcard  = employee_idcard;
        System.out.println("hi");

        try {
            String sql = "SELECT rd.*, r.* FROM room_details rd JOIN rooms r ON rd.room_number = r.room_number WHERE r.room_number = '" + roomnum + "'";



            ResultSet rs = con.getConnect(sql);

            while (rs.next()) {

                dataAll = new roomsetting_data(
                        rs.getInt("room_floor"),
                        rs.getInt("room_det_price"),
                        rs.getInt("water_per_unit"),
                        rs.getInt("elec_per_unit"),
                        rs.getString("room_det_description"),
                        rs.getBoolean("wifi"),
                        rs.getBoolean("air"),
                        rs.getBoolean("furniture"),
                        rs.getBoolean("refridge"),
                        rs.getBoolean("water_heater")
                );

//                   System.out.println(rs.getBoolean("access_room_info_user") + "status");
                datalistAll.add(dataAll);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(datalist);
        return datalistAll;

    }

    public void loadRoomAll(String room_num) {
        ArrayList<roomsetting_data> dataList = getRoomSetAll(room_num);
        sett = new setting();
        System.out.println(room_num);
        for (int i = 0; i < dataList.size(); i++) {
            data = dataList.get(i);
//           sett.getjLabel3().setText(Integer.toString(data.getRoom_floor()));
            sett.getjLabel2().setText(room_num);
            sett.getjTextField11().setText(String.valueOf(data.getRoom_det_price()));
            sett.getjTextField12().setText(String.valueOf(data.getWater_per_unit()));
            sett.getjTextField13().setText(String.valueOf(data.getElec_per_unit()));
            sett.getjTextArea1().setText(data.getRoom_det_description());
            sett.getjCheckBox15().setSelected(data.getWifi());
            sett.getjCheckBox2().setSelected(data.getWifi());
            sett.getjCheckBox3().setSelected(data.getFurniture());
            sett.getjCheckBox4().setSelected(data.getRefridge());
            sett.getjCheckBox5().setSelected(data.getWater_heater());

//            System.out.println(data.getRoom_det_price());
        }
        sett.setVisible(true);
    }

    public void updateRoomSetting(String room_num, String roomDetPrice, String waterPerUnit, String elecPerUnit,
            String roomDetDescription, boolean wifi, boolean air,
            boolean furniture, boolean refridge, boolean waterHeater) {
        Connector con = new Connector();
        try {
            String sql = "UPDATE room_details SET room_det_price = ?, water_per_unit = ?, elec_per_unit = ?,"
                    + " room_det_description = ?, wifi = ?, air = ?, furniture = ?,"
                    + " refridge = ?, water_heater = ? WHERE room_number = ?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, roomDetPrice);
            ps.setString(2, waterPerUnit);
            ps.setString(3, elecPerUnit);
            ps.setString(4, roomDetDescription);
            ps.setBoolean(5, wifi);
            ps.setBoolean(6, air);
            ps.setBoolean(7, furniture);
            ps.setBoolean(8, refridge);
            ps.setBoolean(9, waterHeater);
            ps.setString(10, room_num);

            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Updated successful", "Success", JOptionPane.INFORMATION_MESSAGE);
            } 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Updated failed", "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }
}
