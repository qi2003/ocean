package com.me.ocean.entity;

/**
 * @author my
 */
public class CategoryUser {
    private int t_id;
    private String type;

    public CategoryUser() {
    }

    public CategoryUser(int t_id, String type) {
        this.t_id = t_id;
        this.type = type;
    }

    @Override
    public String toString() {
        return "CategoryUser{" +
                "t_id=" + t_id +
                ", type='" + type + '\'' +
                '}';
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
