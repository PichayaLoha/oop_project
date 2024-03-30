package Model;

import java.sql.*;

public class DbConnector {
    
    public static Connection connection(){
        Connection connect = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/oop", "root", "");
        }catch(Exception e){
            e.printStackTrace();
        }
        return connect;
    }
}
