package com.microservice.user.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_education_details")
public class EducationDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long ID;
    @Column(name = "user_id", nullable = false)
    private Long USER_ID;
    @Column(name = "education_name")
    private String EDUCATION_NAME;
    @Column(name = "starting_year")
    private String STARTING_YEAR;
    @Column(name = "ending_year")
    private String ENDING_YEAR;
    @Column(name = "degree_certificate")
    private String DEGREE_CERTIFICATE;
    @Column(name="is_active")
    private Boolean IS_ACTIVE;

    public EducationDetails() {
    }

    public EducationDetails(Long ID, Long USER_ID, String EDUCATION_NAME, String STARTING_YEAR, String ENDING_YEAR, String DEGREE_CERTIFICATE, Boolean IS_ACTIVE) {
        this.ID = ID;
        this.USER_ID = USER_ID;
        this.EDUCATION_NAME = EDUCATION_NAME;
        this.STARTING_YEAR = STARTING_YEAR;
        this.ENDING_YEAR = ENDING_YEAR;
        this.DEGREE_CERTIFICATE = DEGREE_CERTIFICATE;
        this.IS_ACTIVE = IS_ACTIVE;
    }


    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public Long getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(Long USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getEDUCATION_NAME() {
        return EDUCATION_NAME;
    }

    public void setEDUCATION_NAME(String EDUCATION_NAME) {
        this.EDUCATION_NAME = EDUCATION_NAME;
    }

    public String getSTARTING_YEAR() {
        return STARTING_YEAR;
    }

    public void setSTARTING_YEAR(String STARTING_YEAR) {
        this.STARTING_YEAR = STARTING_YEAR;
    }

    public String getENDING_YEAR() {
        return ENDING_YEAR;
    }

    public void setENDING_YEAR(String ENDING_YEAR) {
        this.ENDING_YEAR = ENDING_YEAR;
    }

    public String getDEGREE_CERTIFICATE() {
        return DEGREE_CERTIFICATE;
    }

    public void setDEGREE_CERTIFICATE(String DEGREE_CERTIFICATE) {
        this.DEGREE_CERTIFICATE = DEGREE_CERTIFICATE;
    }

    public Boolean getIS_ACTIVE() {
        return IS_ACTIVE;
    }

    public void setIS_ACTIVE(Boolean IS_ACTIVE) {
        this.IS_ACTIVE = IS_ACTIVE;
    }

    @Override
    public String toString() {
        return "EducationDetails{" +
                "ID=" + ID +
                ", USER_ID=" + USER_ID +
                ", EDUCATION_NAME='" + EDUCATION_NAME + '\'' +
                ", STARTING_YEAR='" + STARTING_YEAR + '\'' +
                ", ENDING_YEAR='" + ENDING_YEAR + '\'' +
                ", DEGREE_CERTIFICATE='" + DEGREE_CERTIFICATE + '\'' +
                ", IS_ACTIVE=" + IS_ACTIVE +
                '}';
    }
}
