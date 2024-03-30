
package Model;

import java.util.*;

public class AdminModel {
    private String username;
    private ArrayList adminViews = new ArrayList();
    public AdminModel(){
         this(null);
     }
     public AdminModel(AdminRefInterface view){
         username = "";
         if(view!=null){
             adminViews.add(view);
         }
     }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
        ((AdminRefInterface) notifyViews.next()).setAdmin(getUsername());
    }
}

}
     

