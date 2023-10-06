package com.microservice.job.models;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_post_job_details")
public class PostJob {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long ID;
    @Column(name="user_id",nullable = false)
    private Long USER_ID;
    @Column(name="post_name")
    private String POST_NAME;
    @Column(name="company_name")
    private String COMPANY_NAME;
    @Column(name="apply_link")
    private String APPLY_LINK;
    @Column(name="banner_url")
    private String BANNER_URL;
    @Column(name="job_description")
    private String JOB_DESCRIPTION;
    @Column(name="required_skills")
    private String REQUIRED_SKILLS;
    @Column(name="is_active")
    private Boolean IS_ACTIVE;

    public PostJob() {
    }

    public PostJob(Long ID, Long USER_ID, String POST_NAME, String COMPANY_NAME, String APPLY_LINK, String BANNER_URL, String JOB_DESCRIPTION, String REQUIRED_SKILLS, Boolean IS_ACTIVE) {
        this.ID = ID;
        this.USER_ID = USER_ID;
        this.POST_NAME = POST_NAME;
        this.COMPANY_NAME = COMPANY_NAME;
        this.APPLY_LINK = APPLY_LINK;
        this.BANNER_URL = BANNER_URL;
        this.JOB_DESCRIPTION = JOB_DESCRIPTION;
        this.REQUIRED_SKILLS = REQUIRED_SKILLS;
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

    public String getPOST_NAME() {
        return POST_NAME;
    }

    public void setPOST_NAME(String POST_NAME) {
        this.POST_NAME = POST_NAME;
    }

    public String getCOMPANY_NAME() {
        return COMPANY_NAME;
    }

    public void setCOMPANY_NAME(String COMPANY_NAME) {
        this.COMPANY_NAME = COMPANY_NAME;
    }

    public String getAPPLY_LINK() {
        return APPLY_LINK;
    }

    public void setAPPLY_LINK(String APPLY_LINK) {
        this.APPLY_LINK = APPLY_LINK;
    }

    public String getBANNER_URL() {
        return BANNER_URL;
    }

    public void setBANNER_URL(String BANNER_URL) {
        this.BANNER_URL = BANNER_URL;
    }

    public String getJOB_DESCRIPTION() {
        return JOB_DESCRIPTION;
    }

    public void setJOB_DESCRIPTION(String JOB_DESCRIPTION) {
        this.JOB_DESCRIPTION = JOB_DESCRIPTION;
    }

    public String getREQUIRED_SKILLS() {
        return REQUIRED_SKILLS;
    }

    public void setREQUIRED_SKILLS(String REQUIRED_SKILLS) {
        this.REQUIRED_SKILLS = REQUIRED_SKILLS;
    }

    public Boolean getIS_ACTIVE() {
        return IS_ACTIVE;
    }

    public void setIS_ACTIVE(Boolean IS_ACTIVE) {
        this.IS_ACTIVE = IS_ACTIVE;
    }

    @Override
    public String toString() {
        return "PostJob{" +
                "ID=" + ID +
                ", USER_ID=" + USER_ID +
                ", POST_NAME='" + POST_NAME + '\'' +
                ", COMPANY_NAME='" + COMPANY_NAME + '\'' +
                ", APPLY_LINK='" + APPLY_LINK + '\'' +
                ", BANNER_URL='" + BANNER_URL + '\'' +
                ", JOB_DESCRIPTION='" + JOB_DESCRIPTION + '\'' +
                ", REQUIRED_SKILLS='" + REQUIRED_SKILLS + '\'' +
                ", IS_ACTIVE=" + IS_ACTIVE +
                '}';
    }
}
