package com.microservice.job.models;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_job_details")
public class JobDetails {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    @Column(name="user_id",nullable = false)
    private Long USER_ID;
    @Column(name="position_name")
    private String POSITION_NAME;
    @Column(name="company_name")
    private String COMPANY_NAME;
    @Column(name="start_date")
    private String START_DATE;
    @Column(name="end_date")
    private String END_DATE;
    @Column(name="skills")
    private String SKILLS;
    @Column(name="is_active",columnDefinition ="boolean default true")
    private Boolean IS_ACTIVE;

    public JobDetails() {
    }

    public JobDetails(Long ID, Long USER_ID, String POSITION_NAME, String COMPANY_NAME, String START_DATE, String END_DATE, String SKILLS, Boolean IS_ACTIVE) {
        this.ID = ID;
        this.USER_ID = USER_ID;
        this.POSITION_NAME = POSITION_NAME;
        this.COMPANY_NAME = COMPANY_NAME;
        this.START_DATE = START_DATE;
        this.END_DATE = END_DATE;
        this.SKILLS = SKILLS;
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

    public String getPOSITION_NAME() {
        return POSITION_NAME;
    }

    public void setPOSITION_NAME(String POSITION_NAME) {
        this.POSITION_NAME = POSITION_NAME;
    }

    public String getCOMPANY_NAME() {
        return COMPANY_NAME;
    }

    public void setCOMPANY_NAME(String COMPANY_NAME) {
        this.COMPANY_NAME = COMPANY_NAME;
    }

    public String getSTART_DATE() {
        return START_DATE;
    }

    public void setSTART_DATE(String START_DATE) {
        this.START_DATE = START_DATE;
    }

    public String getEND_DATE() {
        return END_DATE;
    }

    public void setEND_DATE(String END_DATE) {
        this.END_DATE = END_DATE;
    }

    public String getSKILLS() {
        return SKILLS;
    }

    public void setSKILLS(String SKILLS) {
        this.SKILLS = SKILLS;
    }

    public Boolean getIS_ACTIVE() {
        return IS_ACTIVE;
    }

    public void setIS_ACTIVE(Boolean IS_ACTIVE) {
        this.IS_ACTIVE = IS_ACTIVE;
    }

    @Override
    public String toString() {
        return "JobDetails{" +
                "ID=" + ID +
                ", USER_ID=" + USER_ID +
                ", POSITION_NAME='" + POSITION_NAME + '\'' +
                ", COMPANY_NAME='" + COMPANY_NAME + '\'' +
                ", START_DATE='" + START_DATE + '\'' +
                ", END_DATE='" + END_DATE + '\'' +
                ", SKILLS='" + SKILLS + '\'' +
                ", IS_ACTIVE=" + IS_ACTIVE +
                '}';
    }
}
