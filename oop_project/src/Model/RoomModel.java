
package Model;
//import java.View.MainRooms;
import java.sql.*;
import java.util.*;
import  static Model.DbConnector.connection;

public class RoomModel {
   public ArrayList<DataInfo> getRoom(){
       ArrayList<DataInfo> datalist = new ArrayList<DataInfo>();
      DataInfo data;
      try{
          String sql = "SELECT * FROM `users`";
          PreparedStatement ps = connection().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            data = new  DataInfo(rs.getString("user_firstname"), rs.getString("user_lastname"), rs.getString("user_phone"));
                datalist.add(data);
            }
       public void showData(MainRooms room){
           
       }
        }
      
      catch(Exception e){
            e.printStackTrace();
        }
       return datalist;
       
   }
     
}
   
