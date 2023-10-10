package com.microservice.job.models;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name="tbl_applied_job")
public class AppliedJob {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long ID;
    @Column(name="user_id",nullable = false)
    private Long USER_ID;
    @Column(name="post_job_id",nullable = false)
    private Long POST_JOB_ID;
    @Column(name="application_date")
    private Date APPLICATION_DATE;
    @Column(name="application_status")
    private String APPLICATION_STATUS;

    public AppliedJob() {
    }

    public AppliedJob(Long ID, Long USER_ID, Long POST_JOB_ID, Date APPLICATION_DATE, String APPLICATION_STATUS) {
        this.ID = ID;
        this.USER_ID = USER_ID;
        this.POST_JOB_ID = POST_JOB_ID;
        this.APPLICATION_DATE = APPLICATION_DATE;
        this.APPLICATION_STATUS = APPLICATION_STATUS;
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

    public Long getPOST_JOB_ID() {
        return POST_JOB_ID;
    }

    public void setPOST_JOB_ID(Long POST_JOB_ID) {
        this.POST_JOB_ID = POST_JOB_ID;
    }

    public Date getAPPLICATION_DATE() {
        return APPLICATION_DATE;
    }

    public void setAPPLICATION_DATE(Date APPLICATION_DATE) {
        this.APPLICATION_DATE = APPLICATION_DATE;
    }

    public String getAPPLICATION_STATUS() {
        return APPLICATION_STATUS;
    }

    public void setAPPLICATION_STATUS(String APPLICATION_STATUS) {
        this.APPLICATION_STATUS = APPLICATION_STATUS;
    }

    @Override
    public String toString() {
        return "AppliedJob{" +
                "ID=" + ID +
                ", USER_ID=" + USER_ID +
                ", POST_JOB_ID=" + POST_JOB_ID +
                ", APPLICATION_DATE=" + APPLICATION_DATE +
                ", APPLICATION_STATUS='" + APPLICATION_STATUS + '\'' +
                '}';
    }
}
