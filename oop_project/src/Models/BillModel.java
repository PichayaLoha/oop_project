package Models;

import java.sql.*;
import java.util.ArrayList;

public class BillModel {
    private DataBill dataBill;
    private DataRoom dataRoom;
    private ArrayList<DataInfo> dataList;
    private DataInfo data;
    
    public void setBillModel_M(int monthIndex) {
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
                String check = resultSet.getString("pay_status");
                if (check.equals("paid")) {
                    check = "Completed";
                }else if (check.equals("notpaid")) {
                    check = null;
                }
                dataBill.setpay_status(resultSet.getString("pay_status"));
//                System.out.println(dataBill.getroom_id());
                
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
}

