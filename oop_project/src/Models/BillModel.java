package Models;

import java.sql.*;
import java.util.ArrayList;

public class BillModel {
    private DataBill dataBill;
    private DataRoom dataRoom;
    private ArrayList<DataInfo> dataList;
    
    public BillModel(int monthIndex) {
//        System.out.println(monthIndex);
        dataList = new ArrayList<>();
        Connector dbconn = new Connector();
        String query = "SELECT * FROM pays WHERE MONTH(pay_date) = " + monthIndex;
        ResultSet resultSet = dbconn.getConnect(query);
        try {
            while (resultSet.next()) {
                dataBill = new DataBill();
                dataBill.setroom_id(resultSet.getInt("room_id"));
                dataBill.setpay_room_cost(resultSet.getInt("pay_room_cost"));
                dataBill.setpay_water_cost(resultSet.getInt("pay_water_cost"));
                dataBill.setpay_elec_cost(resultSet.getInt("pay_elec_cost"));
                dataBill.setpay_total_cost(resultSet.getInt("pay_total_cost"));
                String check = resultSet.getString("pay_status");
                if (check.equals("paid")) {
                    check = "Completed";
                }else if (check.equals("notpaid")) {
                    check = null;
                }
                dataBill.setpay_status(resultSet.getString("pay_status"));
                System.out.println(dataBill.getroom_id());
                
                FindID(dataBill.getroom_id());

                DataInfo data;
                data = new DataInfo(dataRoom.getroom_number(), dataRoom.getroom_status(), 0, dataBill.getpay_water_cost(),0, dataBill.getpay_elec_cost(), dataBill.getpay_room_cost(), 300, dataBill.getpay_total_cost(), dataBill.getpay_status(), check);
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
                dataRoom.setroom_status(resultSet.getString("room_status"));
                
            }
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
  
    public ArrayList<DataInfo> getDataList() {
        return dataList;
    }
    
}

//package Controllers;
//
//import Models.BillModel;
//import Models.Connector;
//import java.sql.*;
//import java.util.ArrayList;
//
//public class DataBill {
//    private int room_id, pay_room_cost, pay_water_cost, pay_elec_cost, pay_total_cost;
//    private String pay_status, room_number, room_status;
//    private ArrayList<String[]> dataList;
//    
//    public DataBill(int monthIndex) {
//        dataList = new ArrayList<>();
//        Connector dbconn = new Connector();
//        String query = "SELECT * FROM pays WHERE MONTH(pay_date) = " + monthIndex;
//        ResultSet resultSet = dbconn.getConnect(query);
//
//        try {
//            while (resultSet.next()) {
//                room_id = resultSet.getInt("room_id");
//                pay_room_cost = resultSet.getInt("pay_room_cost");
//                pay_water_cost = resultSet.getInt("pay_water_cost");
//                pay_elec_cost = resultSet.getInt("pay_elec_cost");
//                pay_total_cost = resultSet.getInt("pay_total_cost");
//                pay_status = resultSet.getString("pay_status");
//                
//                FindID(room_id);
//                
//                data = new BillModel();
//                
////                String[] data = new String[11];
////                data[0] = room_number;
////                data[1] = room_status;
////                data[2] = "0";
////                data[3] = Integer.toString(pay_water_cost);
////                data[4] = "0";
////                data[5] = Integer.toString(pay_elec_cost);
////                data[6] = Integer.toString(pay_room_cost);
////                data[7] = "200"; // Set to "200"
////                data[8] = "1200"; // Set to "1200"
////                data[9] = Integer.toString(pay_total_cost);
////                data[10] = "";
//
//                dataList.add(data);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                if (resultSet != null) {
//                    resultSet.close();
//                }
//                dbconn.disconnect();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    
//    public void FindID(int room_id) {
//        Connector dbconn = new Connector();
//        String query = "SELECT * FROM rooms WHERE room_id = " + room_id;
//        ResultSet resultSet = dbconn.getConnect(query);
//        try {
//            while (resultSet.next()) {
//                room_number = resultSet.getString("room_number");
//                room_status = resultSet.getString("room_status");
//                
//            }
//        }catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//  
//    public ArrayList<String[]> getDataList() {
//        return dataList;
//    }
//    
//}