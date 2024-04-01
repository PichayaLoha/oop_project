package Models;

import java.io.Serializable;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import View.account;
import View.Employee;
import View.popUp;
import View.Rights;
import Models.empData;
import Models.accessData;
import java.awt.BorderLayout;
import java.awt.Color;

public class empModel implements Serializable {

    private account acc;
    private empData empdata;
    private popUp pop;
    private Rights right;
    private accessData accdata;

    public empModel() {
        acc = new account();
        empdata = new empData();
        accdata = new accessData();

    }

    public ArrayList<accessData> getAccessAll(String employee_idcard) {

        ArrayList<accessData> datalistAll = new ArrayList<accessData>();
        accessData dataAll;
        Connector con = new Connector();
      
        String emp_idcard  = employee_idcard;
        
         System.out.println("hi");
        
        try {

           String sql = "SELECT * FROM access_control WHERE employee_id = "
                    + "(SELECT employee_id FROM employees WHERE employee_idcard = '" + employee_idcard + "')";
           
          

    
   
        
            ResultSet rs = con.getConnect(sql);

        
            while (rs.next()) {

                dataAll = new accessData(
                        rs.getBoolean("access_room_info_user"),
                         rs.getBoolean("access_room_info_roomrent"),
                         rs.getBoolean("access_room_info_contact"),
                        rs.getBoolean("access_roomsetting_info_room"),
                        rs.getBoolean("access_roomsetting_info_room_cost"),
                        rs.getBoolean("access_service_info_service"),
                        rs.getBoolean("access_bill_bill"),
                        rs.getBoolean("access_bill_mitor"),
                        rs.getBoolean("access_bill_editstatus")
                        
                );
                   System.out.println(rs.getBoolean("access_room_info_user") + "status");
                datalistAll.add(dataAll);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(datalist);
        return datalistAll;

    }

    public ArrayList<empData> getEmp() {
        ArrayList<empData> datalist = new ArrayList<empData>();

        empData data;

        Connector con = new Connector();
        try {

            String sql = "SELECT * "
                    + "FROM employees ";

            ResultSet rs = con.getConnect(sql);

            while (rs.next()) {
                data = new empData(
                        rs.getString("employee_firstname"),
                        rs.getString("employee_lastname"),
                        rs.getString("employee_role")
                );

                datalist.add(data);

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return datalist;

    }

    public ArrayList<empData> getEmpAll(String name1) {

        ArrayList<empData> datalistAll = new ArrayList<empData>();
        empData dataAll;
        Connector con = new Connector();
        String[] parts = name1.split(" ");
        String firstname = parts[0];
        String lastname = parts[1];
//        System.out.println(firstname);
//        System.out.println(lastname);

        try {

            String sql = "SELECT * FROM employees WHERE employee_firstname = '" + firstname + "' AND employee_lastname = '" + lastname + "'";

            ResultSet rs = con.getConnect(sql);

            while (rs.next()) {

                dataAll = new empData(
                        rs.getString("employee_firstname"),
                        rs.getString("employee_lastname"),
                        rs.getString("employee_role"),
                        rs.getString("employee_idcard"),
                        rs.getString("employee_gender"),
                        rs.getString("employee_religion"),
                        rs.getString("employee_nationality"),
                        rs.getString("employee_education"),
                        rs.getString("employee_bank"),
                        rs.getString("employee_address"),
                        rs.getString("employee_phone"),
                        rs.getInt("employee_salary"),
                        rs.getString("employee_disease")
                );

                datalistAll.add(dataAll);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
//        System.out.println(datalist);
        return datalistAll;

    }

    public void loadEmployee(Employee emp) { //กันไม่ให้เกิดการเรัยกซ้ำซ้อน
        ArrayList<empData> dataList = getEmp();
        for (int i = 0; i < dataList.size(); i++) {
            empdata = dataList.get(i);
            acc = new account();
            acc.getName().setText(empdata.getEmployee_firstname() + " " + empdata.getEmployee_lastname());
            acc.getPosi().setText(empdata.getEmployee_role());
            emp.getPn2Container().add(acc.getPanel());
        }
    }

    public void loadEmployeeAll(String name1) {
        ArrayList<empData> dataList = getEmpAll(name1);
     

        for (int i = 0; i < dataList.size(); i++) {
            empdata = dataList.get(i);
            pop = new popUp();
            pop.getPosi().setText(empdata.getEmployee_role());
            pop.getU1().setText(empdata.getEmployee_firstname() + " " + empdata.getEmployee_lastname() );
            pop.getU3().setText(empdata.getEmployee_gender());
            pop.getU6().setText(empdata.getEmployee_nationality());
            pop.getU7().setText(empdata.getEmployee_religion());
            pop.getF1().setText(empdata.getEmployee_firstname());
            pop.getF2().setText(empdata.getEmployee_lastname());
            pop.getF3().setText(empdata.getEmployee_gender());
            pop.getF4().setText(empdata.getEmployee_role());

            pop.getF5().setText(empdata.getEmployee_idcard());
            pop.getF6().setText(Integer.toString(empdata.getEmployee_salary()));
            pop.getF7().setText(empdata.getEmployee_nationality());
            pop.getF8().setText(empdata.getEmployee_religion());
            pop.getF9().setText(empdata.getEmployee_education());

            pop.getF12().setText(empdata.getEmployee_bank());
            pop.getF13().setText(empdata.getEmployee_phone());
            pop.getTa1().setText(empdata.getEmployee_address());
            pop.getTa2().setText(empdata.getEmployee_disease());


        }
        
    }
    
     public Rights loadAccessAll(String employee_idcard) {
        ArrayList<accessData> dataList2 = getAccessAll(employee_idcard);
        System.out.println(dataList2.get(0));
        for (int i = 0; i < dataList2.size(); i++) {
                accdata = dataList2.get(i);
                 right = new Rights();
               System.out.println(accdata.isAccess_room_info_user() + "tatus");
                 
               
                 right.getRb1().setSelected(accdata.isAccess_room_info_user());
                 right.getRb3().setSelected(accdata.isAccess_room_info_roomrent());
                 right.getRb2().setSelected(accdata.isAccess_room_info_contact());
                 right.getRb4().setSelected(accdata.isAccess_roomsetting_info_room());
                right.getRb5().setSelected(accdata.isAccess_roomsetting_info_room_cost());
                 right.getRb6().setSelected(accdata.isAccess_service_info_service());
                 right.getRb7().setSelected(accdata.isAccess_bill_bill());
                  right.getRb8().setSelected(accdata. isAccess_bill_mitor());
                  right.getRb9().setSelected(accdata. isAccess_bill_editstatus());
        
                 

        }
         System.out.println("hi1");
         return right;
    }

    
    
    public void insertUpdateEmp(String employee_firstname, String employee_lastname, String employee_role, String employee_idcard, String employee_gender, String employee_religion, String employee_nationality, String employee_education, String employee_bank, String employee_address, String employee_phone, Integer employee_salary, String employee_disease) {
        Connector con = new Connector();

        System.out.println(employee_idcard);
        try {
            String sql = "SELECT employee_id FROM employees WHERE employee_idcard = ?";
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, employee_idcard);
            ResultSet rs1 = preparedStatement.executeQuery();

            if (rs1.next()) {
                int emp_id = rs1.getInt("employee_id");
                System.out.println(emp_id);
                if (emp_id == 0) {

                } else {
                    System.out.println(employee_idcard + " up");
                    updateEmp(emp_id, employee_firstname, employee_lastname, employee_role, employee_idcard, employee_gender, employee_religion, employee_nationality, employee_education, employee_bank, employee_address, employee_phone, employee_salary, employee_disease);
                }
            } else {
                System.out.println(employee_idcard + " In");
                InsertEmp(employee_firstname, employee_lastname, employee_role, employee_idcard, employee_gender, employee_religion, employee_nationality, employee_education, employee_bank, employee_address, employee_phone, employee_salary, employee_disease);

            }
        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    private void updateEmp(Integer employee_id, String employee_firstname, String employee_lastname, String employee_role, String employee_idcard, String employee_gender, String employee_religion, String employee_nationality, String employee_education, String employee_bank, String employee_address, String employee_phone, Integer employee_salary, String employee_disease) {
        Connector con = new Connector();

        try {
            String sql = "UPDATE employees SET employee_firstname = ?, employee_lastname = ?, employee_role = ?, employee_idcard = ?, employee_gender = ?, employee_religion = ?, employee_nationality = ?, employee_education = ?, employee_bank = ?, employee_address = ?, employee_phone = ?, employee_salary = ?, employee_disease = ? WHERE employee_id = ?";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, employee_firstname);
            pre.setString(2, employee_lastname);
            pre.setString(3, employee_role);
            pre.setString(4, employee_idcard);
            pre.setString(5, employee_gender);
            pre.setString(6, employee_religion);
            pre.setString(7, employee_nationality);
            pre.setString(8, employee_education);
            pre.setString(9, employee_bank);
            pre.setString(10, employee_address);
            pre.setString(11, employee_phone);
            pre.setInt(12, employee_salary);
            pre.setString(13, employee_disease);
            pre.setInt(14, employee_id);

            int rowsAffected = pre.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Updated success");
                JOptionPane.showMessageDialog(null, "Updated success", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("Failed update");
                JOptionPane.showMessageDialog(null, "Please fill in complete information.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void InsertEmp(String employee_firstname, String employee_lastname, String employee_role, String employee_idcard, String employee_gender, String employee_religion, String employee_nationality, String employee_education, String employee_bank, String employee_address, String employee_phone, Integer employee_salary, String employee_disease) {
        Connector con = new Connector();

        try {
            String sql = "INSERT INTO employees (employee_firstname, employee_lastname, employee_role, employee_idcard, employee_gender, employee_religion, employee_nationality, employee_education, employee_bank, employee_address, employee_phone, employee_salary, employee_disease) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pre = con.prepareStatement(sql);
            pre.setString(1, employee_firstname);
            pre.setString(2, employee_lastname);
            pre.setString(3, employee_role);
            pre.setString(4, employee_idcard);
            pre.setString(5, employee_gender);
            pre.setString(6, employee_religion);
            pre.setString(7, employee_nationality);
            pre.setString(8, employee_education);
            pre.setString(9, employee_bank);
            pre.setString(10, employee_address);
            pre.setString(11, employee_phone);
            pre.setInt(12, employee_salary);
            pre.setString(13, employee_disease);
            int rowsAffected = pre.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Inserted success");
                JOptionPane.showMessageDialog(null, "Inserted Success", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Please fill in complete information.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            pre.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] arguments) {
//         empModel model = new empModel();
//        model.loadEmployee(model);
    }
}
