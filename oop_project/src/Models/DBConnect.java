package Models;

import java.sql.*;

public class DBConnect {
    
    public static Connection connection(){
        Connection connect = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect = DriverManager.getConnection("jdbc:mysql://localhost/oopject_1", "root", "");
        }catch(Exception e){
            e.printStackTrace();
        }
        return connect;
    }
}
