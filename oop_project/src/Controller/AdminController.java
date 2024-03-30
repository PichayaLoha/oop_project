
package Controller;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;
import java.sql.*;
import Model.AdminModel;
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
         sidebarView = new Sidebar();
         
         model.addContactView(loginView); 
         model.addContactView(sidebarView);
         
         loginView.getLogin().addActionListener(this);  
         
                }
      @Override
  public void actionPerformed(ActionEvent e) {
      PreparedStatement pre = null;
        try{
         
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/oop", "root", "");

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
   
    model.updateModel(username);
  Dashboard hpage = new Dashboard();
 }
   
   public static void main(String[] arguments) { new AdminController(); }
}
