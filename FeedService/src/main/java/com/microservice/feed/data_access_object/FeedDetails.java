package com.microservice.feed.data_access_object;

import com.microservice.feed.models.Feed;

public class FeedDetails {
    private Feed FEED;
    private UserDetails USERDETAILS;



    public FeedDetails(Feed FEED, UserDetails USERDETAILS) {
        this.FEED = FEED;
        this.USERDETAILS = USERDETAILS;
    }

    public Feed getFEED() {
        return FEED;
    }

    public void setFEED(Feed FEED) {
        this.FEED = FEED;
    }

    public UserDetails getUSERDETAILS() {
        return USERDETAILS;
    }

    public void setUSERDETAILS(UserDetails USERDETAILS) {
        this.USERDETAILS = USERDETAILS;
    }

    @Override
    public String toString() {
        return "FeedDetails{" +
                "FEED=" + FEED +
                ", USERDETAILS=" + USERDETAILS +
                '}';
    }
}
