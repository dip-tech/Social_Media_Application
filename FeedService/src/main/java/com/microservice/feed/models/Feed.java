package com.microservice.feed.models;

import jakarta.persistence.*;

@Entity
@Table(name="tbl_feed_details")
public class Feed {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long ID;
    @Column(name="user_id",nullable = false)
    private Long USER_ID;
    @Column(name="feed_title")
    private String FEED_TITLE;
    @Column(name="feed_description")
    private String FEED_DESCRIPTION;
    @Column(name="feed_image_path")
    private String FEED_IMAGE_PATH;
    @Column(name="feed_poster_name")
    private String FEED_POSTER_NAME;

    public Feed() {
    }

    public Feed(Long ID, Long USER_ID, String FEED_TITLE, String FEED_DESCRIPTION, String FEED_IMAGE_PATH, String FEED_POSTER_NAME) {
        this.ID = ID;
        this.USER_ID = USER_ID;
        this.FEED_TITLE = FEED_TITLE;
        this.FEED_DESCRIPTION = FEED_DESCRIPTION;
        this.FEED_IMAGE_PATH = FEED_IMAGE_PATH;
        this.FEED_POSTER_NAME = FEED_POSTER_NAME;
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

    public String getFEED_TITLE() {
        return FEED_TITLE;
    }

    public void setFEED_TITLE(String FEED_TITLE) {
        this.FEED_TITLE = FEED_TITLE;
    }

    public String getFEED_DESCRIPTION() {
        return FEED_DESCRIPTION;
    }

    public void setFEED_DESCRIPTION(String FEED_DESCRIPTION) {
        this.FEED_DESCRIPTION = FEED_DESCRIPTION;
    }

    public String getFEED_IMAGE_PATH() {
        return FEED_IMAGE_PATH;
    }

    public void setFEED_IMAGE_PATH(String FEED_IMAGE_PATH) {
        this.FEED_IMAGE_PATH = FEED_IMAGE_PATH;
    }

    public String getFEED_POSTER_NAME() {
        return FEED_POSTER_NAME;
    }

    public void setFEED_POSTER_NAME(String FEED_POSTER_NAME) {
        this.FEED_POSTER_NAME = FEED_POSTER_NAME;
    }

    @Override
    public String toString() {
        return "Feed{" +
                "ID=" + ID +
                ", USER_ID=" + USER_ID +
                ", FEED_TITLE='" + FEED_TITLE + '\'' +
                ", FEED_DESCRIPTION='" + FEED_DESCRIPTION + '\'' +
                ", FEED_IMAGE_PATH='" + FEED_IMAGE_PATH + '\'' +
                ", FEED_POSTER_NAME='" + FEED_POSTER_NAME + '\'' +
                '}';
    }
}
