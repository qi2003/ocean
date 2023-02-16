package com.me.ocean.entity;

import java.util.Date;

/**
 * @author my
 */
public class DetailsUser {
    private int d_id;
    private int t_id;
    private String d_title;
    private String d_content;
    private String d_author;
    private Date d_releaseDate;

    public DetailsUser() {
    }

    public DetailsUser(int d_id, int t_id, String d_title, String d_content, String d_author, Date d_releaseDate) {
        this.d_id = d_id;
        this.t_id = t_id;
        this.d_title = d_title;
        this.d_content = d_content;
        this.d_author = d_author;
        this.d_releaseDate = d_releaseDate;
    }

    @Override
    public String toString() {
        return "DetailsUser{" +
                "d_id=" + d_id +
                ", t_id=" + t_id +
                ", d_title='" + d_title + '\'' +
                ", d_content='" + d_content + '\'' +
                ", d_author='" + d_author + '\'' +
                ", d_releaseDate=" + d_releaseDate +
                '}';
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }

    public int getT_id() {
        return t_id;
    }

    public void setT_id(int t_id) {
        this.t_id = t_id;
    }

    public String getD_title() {
        return d_title;
    }

    public void setD_title(String d_title) {
        this.d_title = d_title;
    }

    public String getD_content() {
        return d_content;
    }

    public void setD_content(String d_content) {
        this.d_content = d_content;
    }

    public String getD_author() {
        return d_author;
    }

    public void setD_author(String d_author) {
        this.d_author = d_author;
    }

    public Date getD_releaseDate() {
        return d_releaseDate;
    }

    public void setD_releaseDate(Date d_releaseDate) {
        this.d_releaseDate = d_releaseDate;
    }
}
