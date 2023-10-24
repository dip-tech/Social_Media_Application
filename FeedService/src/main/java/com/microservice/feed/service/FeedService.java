package com.microservice.feed.service;

import com.microservice.feed.models.Feed;

import java.util.List;

public interface FeedService {

    public String addPost(Feed $NEW_FEED) throws Exception;
    public List<Feed> getAllPost() throws Exception;
    public String updatePost(Feed $UPDATED_FEED) throws Exception;
    public String deletePost(String $POST_ID) throws Exception;
}
