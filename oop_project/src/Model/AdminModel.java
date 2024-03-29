
package Model;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class AdminModel {
    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    private ArrayList adminViews = new ArrayList();
     public AdminModel(){
        
     }
     public AdminModel(AdminRefInterface view){
         username = "";
         if(view!=null){
             adminViews.add(view);
         }
     }
     public void addContactView(AdminRefInterface view){
         if (!adminViews.contains(view)) 
         adminViews.add(view);
     }
     public void removeContactView(AdminRefInterface view) {  
         adminViews.remove(view);
     }
     public void updateModel(String newUsername){
         setUsername(newUsername);
         updateView();
     }
     public void updateView(){
         Iterator notifyViews = adminViews.iterator();
         while (notifyViews.hasNext()){
             ((AdminRefInterface) notifyViews.next()).setAdmin(username);
         }
     }
}
