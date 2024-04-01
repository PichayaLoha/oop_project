package Models;

import java.io.Serializable;

public class empData implements Serializable{
    private String employee_firstname,
             employee_lastname,
            employee_role,
            employee_idcard,
            employee_gender,
            employee_religion,
            employee_nationality,
            employee_education,
            employee_bank,
            employee_address,
            employee_phone,
            employee_disease;
    
    private Integer employee_salary;
    
    public empData(){}
    public empData(String employee_firstname, String employee_lastname, String employee_role){
        this.employee_firstname = employee_firstname;
        this.employee_lastname = employee_lastname;
        this.employee_role = employee_role;
    }
    
    public empData(String employee_firstname, String employee_lastname, String employee_role, String employee_idcard, String employee_gender, String employee_religion, String employee_nationality, String employee_education, String employee_bank, String employee_address, String employee_phone, Integer employee_salary, String employee_disease) {
    this.employee_firstname = employee_firstname;
    this.employee_lastname = employee_lastname;
    this.employee_role = employee_role;
    this.employee_idcard = employee_idcard;
    this.employee_gender = employee_gender;
    this.employee_religion = employee_religion;
    this.employee_nationality = employee_nationality;
    this.employee_education = employee_education;
    this.employee_bank = employee_bank;
    this.employee_address = employee_address;
    this.employee_phone = employee_phone;
    this.employee_salary = employee_salary;
     this.employee_disease = employee_disease;
}

    public String getEmployee_firstname() {
        return employee_firstname;
    }

    public void setEmployee_firstname(String employee_firstname) {
        this.employee_firstname = employee_firstname;
    }

    public String getEmployee_lastname() {
        return employee_lastname;
    }

    public void setEmployee_lastname(String employee_lastname) {
        this.employee_lastname = employee_lastname;
    }

    public String getEmployee_role() {
        return employee_role;
    }

    public void setEmployee_role(String employee_role) {
        this.employee_role = employee_role;
    }

    public String getEmployee_idcard() {
        return employee_idcard;
    }

    public void setEmployee_idcard(String employee_idcard) {
        this.employee_idcard = employee_idcard;
    }

    public String getEmployee_gender() {
        return employee_gender;
    }

    public void setEmployee_gender(String employee_gender) {
        this.employee_gender = employee_gender;
    }

    public String getEmployee_religion() {
        return employee_religion;
    }

    public void setEmployee_religion(String employee_religion) {
        this.employee_religion = employee_religion;
    }

    public String getEmployee_nationality() {
        return employee_nationality;
    }

    public void setEmployee_nationality(String employee_nationality) {
        this.employee_nationality = employee_nationality;
    }

    public String getEmployee_education() {
        return employee_education;
    }

    public void setEmployee_education(String employee_education) {
        this.employee_education = employee_education;
    }

    public String getEmployee_bank() {
        return employee_bank;
    }

    public void setEmployee_bank(String employee_bank) {
        this.employee_bank = employee_bank;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    public String getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(String employee_phone) {
        this.employee_phone = employee_phone;
    }

    public String getEmployee_disease() {
        return employee_disease;
    }

    public void setEmployee_disease(String employee_disease) {
        this.employee_disease = employee_disease;
    }

    public Integer getEmployee_salary() {
        return employee_salary;
    }

    public void setEmployee_salary(Integer employee_salary) {
        this.employee_salary = employee_salary;
    }

   


    
}