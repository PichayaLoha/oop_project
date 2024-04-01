package Models;

import java.sql.*;

public class Connector {
    public Connection conn;
    public Statement stm;
    public ResultSet rs;
public PreparedStatement pre;
    
    private String url = "jdbc:mysql://localhost:3306/oop";
    private String username = "root";
    private String password = "";
    
  

    
    public ResultSet getConnect(String sql) {
        try {
            conn = DriverManager.getConnection(url, username, password);
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
        }catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public void getUpdate(String sql) {
        try {
            stm = conn.createStatement();
            stm.executeUpdate(sql);
        }catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void disconnect() {
        try {
            stm.close();
            conn.close();
        }catch(SQLException e) {
            e.printStackTrace();
        }
    }
    
//    public void setData(String sql) {
//            
//    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public ResultSet executeQuery(String sql) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stm = conn.createStatement();
             ResultSet rs = stm.executeQuery(sql)) {
            return rs;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public int executeUpdate(String sql) {
        try (Connection conn = DriverManager.getConnection(url, username, password);
             Statement stm = conn.createStatement()) {
            return stm.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }
    
   public PreparedStatement prepareStatement(String sql) {
    try {
        if (conn == null) {
            conn = DriverManager.getConnection(url, username, password);
        }
        pre = conn.prepareStatement(sql);
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return pre;
}

}