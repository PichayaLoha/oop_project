
package Controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.sql.*;
import Models.AdminModel;
import View.Dashboard;
import View.Login;
import View.Sidebar;

public class AdminController implements ActionListener {
    private AdminModel model;
    private Login loginView;
    private Sidebar sidebarView;
    public AdminController(){
        model = new AdminModel();
        loginView = new Login();
         
         
         
         
         loginView.getLogin().addActionListener(this);  
         
                }
      @Override
  public void actionPerformed(ActionEvent e) {
      PreparedStatement pre = null;
        try{
         
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/oopject_1", "root", "");

        String username =   loginView.getUserName();
        String password1 =  loginView.getPassword();

        Statement stm = con.createStatement(); //สร้าง Statement object 

      String sql = "SELECT * FROM admins WHERE admin_username = ? AND admin_password = ?";
pre = con.prepareStatement(sql);
pre.setString(1, username);
pre.setString(2, password1);
ResultSet rs = pre.executeQuery();
//ประมวลผลค าสั่ง SQL ผ่าน Statement
      
        if(rs.next()){ //ตรวจสอบว่ามี user นี้มั้ย

         updateModel();
//            Dashboard hpage = new Dashboard();
             
           loginView.getFr().dispose();
           
        }else{
          JOptionPane.showMessageDialog(loginView.getFr(), "username or password wrong");
           loginView.getUserName();
            loginView.getPassword();
        }
        
        con.close(); 
    }catch(Exception er){
        System.out.println(er.getMessage());
    }
}
 public void updateModel(){
    String username = loginView.getUserName();
   
    
  Dashboard hpage = new Dashboard(username);
 }
   
   public static void main(String[] arguments) { new AdminController(); }
}