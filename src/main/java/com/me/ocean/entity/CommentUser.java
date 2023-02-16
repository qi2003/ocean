package com.me.ocean.entity;


import java.util.Date;

/**
 * @author my
 */
public class CommentUser {
    private int c_id;
    private int cd_id;
    private String c_content;
    private String c_author;
    private Date c_createDate;

    public CommentUser() {
    }

    public CommentUser(int c_id, int cd_id, String c_content, String c_author, Date c_createDate) {
        this.c_id = c_id;
        this.cd_id = cd_id;
        this.c_content = c_content;
        this.c_author = c_author;
        this.c_createDate = c_createDate;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "c_id=" + c_id +
                ", cd_id=" + cd_id +
                ", c_content='" + c_content + '\'' +
                ", c_author='" + c_author + '\'' +
                ", c_createDate=" + c_createDate +
                '}';
    }

    public int getC_id() {
        return c_id;
    }

    public void setC_id(int c_id) {
        this.c_id = c_id;
    }

    public int getCd_id() {
        return cd_id;
    }

    public void setCd_id(int cd_id) {
        this.cd_id = cd_id;
    }

    public String getC_content() {
        return c_content;
    }

    public void setC_content(String c_content) {
        this.c_content = c_content;
    }

    public String getC_author() {
        return c_author;
    }

    public void setC_author(String c_author) {
        this.c_author = c_author;
    }

    public Date getC_createDate() {
        return c_createDate;
    }

    public void setC_createDate(Date c_createDate) {
        this.c_createDate = c_createDate;
    }
}
