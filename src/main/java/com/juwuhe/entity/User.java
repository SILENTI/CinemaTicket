package com.juwuhe.entity;

import java.io.Serializable;

public class User implements Serializable {


    private static final long serialVersionUID = -6197044522677502681L;
    private int u_id;
    private String u_username ;
    private String u_password ;



    public User() {
    }

    public User(int u_id, String u_username, String u_password) {
        this.u_id = u_id;
        this.u_username = u_username;
        this.u_password = u_password;
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_username() {
        return u_username;
    }

    public void setU_username(String u_username) {
        this.u_username = u_username;
    }

    public String getU_password() {
        return u_password;
    }

    public void setU_password(String u_password) {
        this.u_password = u_password;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "u_id=" + u_id +
                ", u_username='" + u_username + '\'' +
                ", u_password='" + u_password + '\'' +
                '}';
    }
}
