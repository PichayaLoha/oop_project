package Models;

import Models.Connector;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BillModel {
    private DataBill dataBill;
    private DataRoom dataRoom;
    private ArrayList<DataInfo> dataList;
    private DataInfo data;
    
    public void BillModel_Month(int monthIndex) {
//        System.out.println(monthIndex);
        dataList = new ArrayList<>();
        Connector dbconn = new Connector();
        String query = "SELECT * FROM pays WHERE MONTH(pay_date) = " + monthIndex;
        ResultSet resultSet = dbconn.getConnect(query);
        try {
            while (resultSet.next()) {
                dataBill = new DataBill();
                dataBill.setpay_id(resultSet.getInt("pay_id"));
                dataBill.setroom_id(resultSet.getInt("room_id"));
                dataBill.setw_meter(resultSet.getInt("water_meter"));
                dataBill.sete_meter(resultSet.getInt("elec_meter"));
                dataBill.setpay_room_cost(resultSet.getInt("pay_room_cost"));
                dataBill.setpay_water_cost(resultSet.getInt("pay_water_cost"));
                dataBill.setpay_elec_cost(resultSet.getInt("pay_elec_cost"));
                dataBill.setcommon(resultSet.getInt("pay_common_area"));
                dataBill.setpay_total_cost(resultSet.getInt("pay_total_cost"));
                dataBill.setpay_status(resultSet.getString("pay_status"));
                
                FindID(dataBill.getroom_id());

                data = new DataInfo(dataBill.getpay_id(), dataRoom.getroom_number(), dataRoom.getroom_status(), dataBill.getw_meter(), dataBill.getpay_water_cost(),dataBill.gete_meter(), dataBill.getpay_elec_cost(), dataBill.getpay_room_cost(), dataBill.getcommon(), dataBill.getpay_total_cost(), dataBill.getpay_status());
                dataList.add(data);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                dbconn.disconnect();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    
    public void FindID(int room_id) {
        Connector dbconn = new Connector();
        String query = "SELECT * FROM rooms WHERE room_id = " + room_id;
        ResultSet resultSet = dbconn.getConnect(query);
        try {
            while (resultSet.next()) {
                dataRoom = new DataRoom();
                dataRoom.setroom_number(resultSet.getString("room_number"));
                dataRoom.setroom_floor(resultSet.getInt("room_floor"));
                dataRoom.setroom_status(resultSet.getString("room_status"));
                
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
  
    public ArrayList<DataInfo> getDataList() {
        return dataList;
    }
    
    public DataInfo getData() {
        return data;
    }
    
    public void setBillModel_id(int id) {
        Connector dbconn = new Connector();
        String query = "SELECT * FROM pays WHERE pay_id = " + id;
        ResultSet resultSet = dbconn.getConnect(query);
        try {
            while (resultSet.next()) {
                dataBill = new DataBill();
                dataBill.setpay_id(resultSet.getInt("pay_id"));
                dataBill.setroom_id(resultSet.getInt("room_id"));
                dataBill.setw_meter(resultSet.getInt("water_meter"));
                dataBill.sete_meter(resultSet.getInt("elec_meter"));
                dataBill.setpay_room_cost(resultSet.getInt("pay_room_cost"));
                dataBill.setpay_water_cost(resultSet.getInt("pay_water_cost"));
                dataBill.setpay_elec_cost(resultSet.getInt("pay_elec_cost"));
                dataBill.setcommon(resultSet.getInt("pay_common_area"));
                dataBill.setpay_total_cost(resultSet.getInt("pay_total_cost"));
                dataBill.setpay_status(resultSet.getString("pay_status"));
                
                FindID(dataBill.getroom_id());
                data = new DataInfo(dataBill.getpay_id(), dataRoom.getroom_number(), dataRoom.getroom_status(), dataBill.getw_meter(), dataBill.getpay_water_cost(),dataBill.gete_meter(), dataBill.getpay_elec_cost(), dataBill.getpay_room_cost(), dataBill.getcommon(), dataBill.getpay_total_cost(), dataBill.getpay_status());
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                dbconn.disconnect();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public void updateBillModel(int pay_id, String room_number, String room_status, int w_meter, int pay_water_cost, int e_meter, int pay_elec_cost, int pay_room_cost, int common_fee, int pay_total_cost, String pay_status) {
        try {
            System.out.println("water_meter" + w_meter);
            Connector dbconn = new Connector();
            String query = "UPDATE `pays` SET `water_meter`=?, `elec_meter`=?, `pay_room_cost`=?, `pay_water_cost`=?, `pay_elec_cost`=?, `pay_common_area`=?, `pay_total_cost`=?, `pay_status`=? WHERE `pay_id`=?";
            Connection conn = dbconn.getConnection();
            PreparedStatement pst = conn.prepareStatement(query);
            pst.setInt(1, w_meter);
            pst.setInt(2, e_meter);
            pst.setInt(3, pay_room_cost);
            pst.setInt(4, pay_water_cost);
            pst.setInt(5, pay_elec_cost);
            pst.setInt(6, common_fee);
            pst.setInt(7, pay_total_cost);
            pst.setString(8, pay_status);
            pst.setInt(9, pay_id);
            pst.executeUpdate();
            System.out.println("completed");
            pst.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
}

}

