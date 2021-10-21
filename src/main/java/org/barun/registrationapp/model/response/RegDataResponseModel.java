package org.barun.registrationapp.model.response;

public class RegDataResponseModel {

    private int reg_id;
    private String name;
    private int aadhar_no;
    private String address;
    private String email_id;
    private String password;

    // GETTERS & SETTERS
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAadhar_no() {
        return aadhar_no;
    }

    public void setAadhar_no(int aadhar_no) {
        this.aadhar_no = aadhar_no;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getReg_id() {
        return reg_id;
    }

    public void setReg_id(int reg_id) {
        this.reg_id = reg_id;
    }
}
