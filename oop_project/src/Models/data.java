package Models;


import java.io.Serializable;

public class data implements Serializable{
    private String name;
    private String posi;
    
    public data(){
        this("","");
    }
    public data(String name, String posi){
        this.name = name;
        this.posi = posi;
    }
    public String getName(){
        return name;
    }
    public String getPosi(){
        return posi;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setPosi(String p){
        this.posi = p;
    }
}
