package com.microservice.user.models;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_user_details")
public class UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long ID;
    @Column(name="user_login_id",nullable = false,unique = true)
    private Long USER_LOGIN_ID;
    @Column(name="first_name")
    private String FIRST_NAME;
    @Column(name="last_name")
    private String LAST_NAME;
    @Column(name="profile_photo")
    private String PROFILE_PHOTO;
    @Column(name="gender")
    private String GENDER;
    @Column(name="street_address")
    private String STREET_ADDRESS;
    @Column(name="city")
    private String CITY;
    @Column(name="state")
    private String STATE;
    @Column(name="postal_code")
    private String POSTAL_CODE;
    @Column(name="country")
    private String COUNTRY;
    @Column(name="about")
    private String ABOUT;

    public UserDetails() {
    }

    public UserDetails(Long ID, Long USER_LOGIN_ID, String FIRST_NAME, String LAST_NAME, String PROFILE_PHOTO, String GENDER, String STREET_ADDRESS, String CITY, String STATE, String POSTAL_CODE, String COUNTRY, String ABOUT) {
        this.ID = ID;
        this.USER_LOGIN_ID = USER_LOGIN_ID;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.PROFILE_PHOTO = PROFILE_PHOTO;
        this.GENDER = GENDER;
        this.STREET_ADDRESS = STREET_ADDRESS;
        this.CITY = CITY;
        this.STATE = STATE;
        this.POSTAL_CODE = POSTAL_CODE;
        this.COUNTRY = COUNTRY;
        this.ABOUT = ABOUT;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getUSER_LOGIN_ID() {
        return USER_LOGIN_ID;
    }

    public void setUSER_LOGIN_ID(Long USER_LOGIN_ID) {
        this.USER_LOGIN_ID = USER_LOGIN_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public String getPROFILE_PHOTO() {
        return PROFILE_PHOTO;
    }

    public void setPROFILE_PHOTO(String PROFILE_PHOTO) {
        this.PROFILE_PHOTO = PROFILE_PHOTO;
    }

    public String getGENDER() {
        return GENDER;
    }

    public void setGENDER(String GENDER) {
        this.GENDER = GENDER;
    }

    public String getSTREET_ADDRESS() {
        return STREET_ADDRESS;
    }

    public void setSTREET_ADDRESS(String STREET_ADDRESS) {
        this.STREET_ADDRESS = STREET_ADDRESS;
    }

    public String getCITY() {
        return CITY;
    }

    public void setCITY(String CITY) {
        this.CITY = CITY;
    }

    public String getSTATE() {
        return STATE;
    }

    public void setSTATE(String STATE) {
        this.STATE = STATE;
    }

    public String getPOSTAL_CODE() {
        return POSTAL_CODE;
    }

    public void setPOSTAL_CODE(String POSTAL_CODE) {
        this.POSTAL_CODE = POSTAL_CODE;
    }

    public String getCOUNTRY() {
        return COUNTRY;
    }

    public void setCOUNTRY(String COUNTRY) {
        this.COUNTRY = COUNTRY;
    }

    public String getABOUT() {
        return ABOUT;
    }

    public void setABOUT(String ABOUT) {
        this.ABOUT = ABOUT;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "ID=" + ID +
                ", USER_LOGIN_ID=" + USER_LOGIN_ID +
                ", FIRST_NAME='" + FIRST_NAME + '\'' +
                ", LAST_NAME='" + LAST_NAME + '\'' +
                ", PROFILE_PHOTO='" + PROFILE_PHOTO + '\'' +
                ", GENDER='" + GENDER + '\'' +
                ", STREET_ADDRESS='" + STREET_ADDRESS + '\'' +
                ", CITY='" + CITY + '\'' +
                ", STATE='" + STATE + '\'' +
                ", POSTAL_CODE='" + POSTAL_CODE + '\'' +
                ", COUNTRY='" + COUNTRY + '\'' +
                ", ABOUT='" + ABOUT + '\'' +
                '}';
    }
}
