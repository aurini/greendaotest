package com.example.aurini.greendaotest.db;

import org.greenrobot.greendao.annotation.*;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END

/**
 * Entity mapped to table "DIARY".
 */
@Entity
public class Diary {

    @Id
    private Long id;
    private Long id_server;
    private String user_id;
    private String note;
    private Boolean rg0;
    private Boolean rg1;
    private Boolean rg2;
    private Boolean rg3;
    private Boolean rg4;
    private Boolean rg5;
    private Boolean rg6;
    private Boolean rg7;
    private Boolean rg8;
    private Boolean rg9;
    private String  photoPath;
    private String photoLink;
    private java.util.Date date;
    private Boolean isSync;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    @Generated
    public Diary() {
    }

    public Diary(Long id) {
        this.id = id;
    }

    @Generated
    public Diary(Long id, Long id_server, String user_id, String note, Boolean rg0, Boolean rg1, Boolean rg2, Boolean rg3, Boolean rg4, Boolean rg5, Boolean rg6, Boolean rg7, Boolean rg8, Boolean rg9, String  photoPath, String photoLink, java.util.Date date, Boolean isSync) {
        this.id = id;
        this.id_server = id_server;
        this.user_id = user_id;
        this.note = note;
        this.rg0 = rg0;
        this.rg1 = rg1;
        this.rg2 = rg2;
        this.rg3 = rg3;
        this.rg4 = rg4;
        this.rg5 = rg5;
        this.rg6 = rg6;
        this.rg7 = rg7;
        this.rg8 = rg8;
        this.rg9 = rg9;
        this. photoPath =  photoPath;
        this.photoLink = photoLink;
        this.date = date;
        this.isSync = isSync;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_server() {
        return id_server;
    }

    public void setId_server(Long id_server) {
        this.id_server = id_server;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Boolean getRg0() {
        return rg0;
    }

    public void setRg0(Boolean rg0) {
        this.rg0 = rg0;
    }

    public Boolean getRg1() {
        return rg1;
    }

    public void setRg1(Boolean rg1) {
        this.rg1 = rg1;
    }

    public Boolean getRg2() {
        return rg2;
    }

    public void setRg2(Boolean rg2) {
        this.rg2 = rg2;
    }

    public Boolean getRg3() {
        return rg3;
    }

    public void setRg3(Boolean rg3) {
        this.rg3 = rg3;
    }

    public Boolean getRg4() {
        return rg4;
    }

    public void setRg4(Boolean rg4) {
        this.rg4 = rg4;
    }

    public Boolean getRg5() {
        return rg5;
    }

    public void setRg5(Boolean rg5) {
        this.rg5 = rg5;
    }

    public Boolean getRg6() {
        return rg6;
    }

    public void setRg6(Boolean rg6) {
        this.rg6 = rg6;
    }

    public Boolean getRg7() {
        return rg7;
    }

    public void setRg7(Boolean rg7) {
        this.rg7 = rg7;
    }

    public Boolean getRg8() {
        return rg8;
    }

    public void setRg8(Boolean rg8) {
        this.rg8 = rg8;
    }

    public Boolean getRg9() {
        return rg9;
    }

    public void setRg9(Boolean rg9) {
        this.rg9 = rg9;
    }

    public String get PhotoPath() {
        return  photoPath;
    }

    public void set PhotoPath(String  photoPath) {
        this. photoPath =  photoPath;
    }

    public String getPhotoLink() {
        return photoLink;
    }

    public void setPhotoLink(String photoLink) {
        this.photoLink = photoLink;
    }

    public java.util.Date getDate() {
        return date;
    }

    public void setDate(java.util.Date date) {
        this.date = date;
    }

    public Boolean getIsSync() {
        return isSync;
    }

    public void setIsSync(Boolean isSync) {
        this.isSync = isSync;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
