package com.microservice.auth.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="tbl_user_login")
public class UserLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ID;
    @Column(name="email_id",nullable = false,unique = true)
    private String EMAIL_ID;
    @Column(name="mobile_no",nullable = false,unique = true)
    private String MOBILE_NO;
    @Column(name="password",nullable = false)
    private String PASSWORD;
    @Column(name="created_at")
    private Date CREATED_AT;
    @Column(name="updated_at")
    private Date UPDATED_AT;
    @Column(name="last_login")
    private Date LAST_LOGIN;

    @Column(name="user_type")
    private String USER_TYPE;

    @Column(name="is_active")
    private boolean IS_ACTIVE;

    public UserLogin() {
    }

    public UserLogin(Long ID, String EMAIL_ID, String MOBILE_NO, String PASSWORD, Date CREATED_AT, Date UPDATED_AT, Date LAST_LOGIN, String USER_TYPE, boolean IS_ACTIVE) {
        this.ID = ID;
        this.EMAIL_ID = EMAIL_ID;
        this.MOBILE_NO = MOBILE_NO;
        this.PASSWORD = PASSWORD;
        this.CREATED_AT = CREATED_AT;
        this.UPDATED_AT = UPDATED_AT;
        this.LAST_LOGIN = LAST_LOGIN;
        this.USER_TYPE = USER_TYPE;
        this.IS_ACTIVE = IS_ACTIVE;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getEMAIL_ID() {
        return EMAIL_ID;
    }

    public void setEMAIL_ID(String EMAIL_ID) {
        this.EMAIL_ID = EMAIL_ID;
    }

    public String getMOBILE_NO() {
        return MOBILE_NO;
    }

    public void setMOBILE_NO(String MOBILE_NO) {
        this.MOBILE_NO = MOBILE_NO;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public Date getCREATED_AT() {
        return CREATED_AT;
    }

    public void setCREATED_AT(Date CREATED_AT) {
        this.CREATED_AT = CREATED_AT;
    }

    public Date getUPDATED_AT() {
        return UPDATED_AT;
    }

    public void setUPDATED_AT(Date UPDATED_AT) {
        this.UPDATED_AT = UPDATED_AT;
    }

    public Date getLAST_LOGIN() {
        return LAST_LOGIN;
    }

    public void setLAST_LOGIN(Date LAST_LOGIN) {
        this.LAST_LOGIN = LAST_LOGIN;
    }

    public String getUSER_TYPE() {
        return USER_TYPE;
    }

    public void setUSER_TYPE(String USER_TYPE) {
        this.USER_TYPE = USER_TYPE;
    }

    public boolean getIS_ACTIVE() {
        return IS_ACTIVE;
    }

    public void setIS_ACTIVE(boolean IS_ACTIVE) {
        this.IS_ACTIVE = IS_ACTIVE;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "ID=" + ID +
                ", EMAIL_ID='" + EMAIL_ID + '\'' +
                ", MOBILE_NO='" + MOBILE_NO + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", CREATED_AT=" + CREATED_AT +
                ", UPDATED_AT=" + UPDATED_AT +
                ", LAST_LOGIN=" + LAST_LOGIN +
                ", USER_TYPE='" + USER_TYPE + '\'' +
                ", IS_ACTIVE=" + IS_ACTIVE +
                '}';
    }
}
