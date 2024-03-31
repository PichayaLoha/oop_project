package View;

import java.io.Serializable;

public class data implements Serializable{
    private String name;
    private String posi;
    private String imageProfile;
    
    public data(){
        this("","","");
    }
    public data(String name, String role, String imageProfile) {
        this.name = name;
        this.posi = posi;
        this.imageProfile = imageProfile;
    }
    public String getName(){
        return name;
    }
    public String getPosi(){
        return posi;
    }
    public String getImageProfile() {
        return imageProfile;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setPosi(String p){
        this.posi = p;
    }
    public void setImageProfile(String i){
        this.imageProfile = i;
    }
}