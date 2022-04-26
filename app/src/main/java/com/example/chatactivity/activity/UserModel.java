package com.example.chatactivity.activity;

public class UserModel {
    String name;
    String mobile_no;
    String email;
    String password;

    public UserModel(){

    }


    public UserModel(String Name,String Mobile_no,String Email,String Password){
        name =Name;
        mobile_no =Mobile_no;
        email =Email;
        password =Password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
