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
        if($UPDATED_FEED.getID()!=null && $UPDATED_FEED.getUSER_ID()!=null){
            $FEED_REPO.save($UPDATED_FEED);
            return "UPDATE SUCCESSFUL";
        }
        else {
            throw new Exception("FEED ID or USER ID NOT FOUND");
        }
    }

    @Override
    public String deletePost(Long $POST_ID) throws Exception {
        if($POST_ID!=null){
            $FEED_REPO.inActive($POST_ID);
            return "POST DELETED";
        }
        return null;
    }
}
