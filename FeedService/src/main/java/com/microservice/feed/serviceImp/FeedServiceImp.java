package com.microservice.feed.serviceImp;

import com.microservice.feed.models.Feed;
import com.microservice.feed.repo.FeedRepo;
import com.microservice.feed.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class FeedServiceImp implements FeedService {
    @Autowired
    FeedRepo $FEED_REPO;
    @Override
    public String addPost(Feed $NEW_FEED) throws Exception {
        $FEED_REPO.save($NEW_FEED);
        return "NEW FEED ADDED";
    }

    @Override
    public List<Feed> getAllPost() throws Exception {
        List<Feed> $ALL_FEEDS=$FEED_REPO.findAll();
        return Collections.unmodifiableList($ALL_FEEDS);
    }

    @Override
    public String updatePost(Feed $UPDATED_FEED) throws Exception {
        return null;
    }

    @Override
    public String deletePost(String $POST_ID) throws Exception {
        return null;
    }
}
