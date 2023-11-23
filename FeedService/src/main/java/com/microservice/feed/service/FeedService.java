package com.microservice.feed.service;

import com.microservice.feed.data_access_object.FeedDetails;
import com.microservice.feed.models.Feed;

import java.util.List;

public interface FeedService {

    public String addPost(Feed $NEW_FEED) throws Exception;
    public List<FeedDetails> getAllPost() throws Exception;
    public String updatePost(Feed $UPDATED_FEED) throws Exception;
    public String deletePost(Long $POST_ID) throws Exception;
}
