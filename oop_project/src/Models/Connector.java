package Models;

import java.sql.*;

public class Connector {
    private Connection conn;
    private Statement stm;
    private ResultSet rs;

    private String url = "jdbc:mysql://localhost:3306/oopject_1";
    private String username = "root";
    private String password = "";
    
    public Connector() {
        // Initialize the connection in the constructor
        try {
            conn = DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ResultSet getConnect(String sql) {
        try {
            stm = conn.createStatement();
            rs = stm.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
    
    public void getUpdate(String sql) {
        try {
            stm = conn.createStatement();
            stm.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void disconnect() {
        try {
            stm.close();
            conn.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return conn;
    }
}