
package Models;

import java.io.Serializable;

public class accessData  implements Serializable{
    private boolean access_room_info_user, access_room_info_roomrent, access_room_info_contact,
            access_roomsetting_info_room,access_roomsetting_info_room_cost,access_service_info_service,
            access_bill_bill,access_bill_mitor,access_bill_editstatus ;
    
    
    public accessData(){}
     public accessData(Boolean access_room_info_user, Boolean access_room_info_roomrent, Boolean access_room_info_contact,
                      Boolean access_roomsetting_info_room, Boolean access_roomsetting_info_room_cost,
                      Boolean access_service_info_service, Boolean access_bill_bill,
                      Boolean access_bill_mitor, Boolean access_bill_editstatus) {
        this.access_room_info_user = access_room_info_user;
       
        this.access_room_info_roomrent = access_room_info_roomrent;
          this.access_room_info_contact = access_room_info_contact;
        this.access_roomsetting_info_room = access_roomsetting_info_room;
        this.access_roomsetting_info_room_cost = access_roomsetting_info_room_cost;
        this.access_service_info_service = access_service_info_service;
        this.access_bill_bill = access_bill_bill;
        this.access_bill_mitor = access_bill_mitor;
        this.access_bill_editstatus = access_bill_editstatus;
    }

    public boolean isAccess_room_info_contact() {
        return access_room_info_contact;
    }

    public void setAccess_room_info_contact(boolean access_room_info_contact) {
        this.access_room_info_contact = access_room_info_contact;
    }
    


    public boolean isAccess_room_info_user() {
        return access_room_info_user;
    }

    public void setAccess_room_info_user(boolean access_room_info_user) {
        this.access_room_info_user = access_room_info_user;
    }

    public boolean isAccess_room_info_roomrent() {
        return access_room_info_roomrent;
    }

    public void setAccess_room_info_roomrent(boolean access_room_info_roomrent) {
        this.access_room_info_roomrent = access_room_info_roomrent;
    }

    public boolean isAccess_roomsetting_info_room() {
        return access_roomsetting_info_room;
    }

    public void setAccess_roomsetting_info_room(boolean access_roomsetting_info_room) {
        this.access_roomsetting_info_room = access_roomsetting_info_room;
    }

    public boolean isAccess_roomsetting_info_room_cost() {
        return access_roomsetting_info_room_cost;
    }

    public void setAccess_roomsetting_info_room_cost(boolean access_roomsetting_info_room_cost) {
        this.access_roomsetting_info_room_cost = access_roomsetting_info_room_cost;
    }

    public boolean isAccess_service_info_service() {
        return access_service_info_service;
    }

    public void setAccess_service_info_service(boolean access_service_info_service) {
        this.access_service_info_service = access_service_info_service;
    }

    public boolean isAccess_bill_bill() {
        return access_bill_bill;
    }

    public void setAccess_bill_bill(boolean access_bill_bill) {
        this.access_bill_bill = access_bill_bill;
    }

    public boolean isAccess_bill_mitor() {
        return access_bill_mitor;
    }

    public void setAccess_bill_mitor(boolean access_bill_mitor) {
        this.access_bill_mitor = access_bill_mitor;
    }

    public boolean isAccess_bill_editstatus() {
        return access_bill_editstatus;
    }

    public void setAccess_bill_editstatus(boolean access_bill_editstatus) {
        this.access_bill_editstatus = access_bill_editstatus;
    }
                    
            
}
