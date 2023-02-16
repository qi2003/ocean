package com.me.ocean.entity;

/**
 * @author my
 */
public class User {
    private int u_id;
    private String u_name;
    private String paword;
    private String email;
    private int u_type;

    public User() {
    }

    public User(int u_id, String u_name, String paword, String email, int u_type) {
        this.u_id = u_id;
        this.u_name = u_name;
        this.paword = paword;
        this.email = email;
        this.u_type = u_type;
    }

    @Override
    public String toString() {
        return "User{" +
                "u_id=" + u_id +
                ", u_name='" + u_name + '\'' +
                ", paword='" + paword + '\'' +
                ", email='" + email + '\'' +
                ", u_type=" + u_type +
                '}';
    }

    public int getU_id() {
        return u_id;
    }

    public void setU_id(int u_id) {
        this.u_id = u_id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getPaword() {
        return paword;
    }

    public void setPaword(String paword) {
        this.paword = paword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getU_type() {
        return u_type;
    }

    public void setU_type(int u_type) {
        this.u_type = u_type;
    }
}
