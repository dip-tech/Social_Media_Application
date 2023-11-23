package com.microservice.feed.serviceImp;

import com.microservice.feed.data_access_object.FeedDetails;
import com.microservice.feed.data_access_object.UserDetails;
import com.microservice.feed.models.Feed;
import com.microservice.feed.repo.FeedRepo;
import com.microservice.feed.service.FeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Method;
import java.util.*;

@Service
public class FeedServiceImp implements FeedService {
    @Autowired
    FeedRepo $FEED_REPO;

    @Autowired
    RestTemplate restTemplate;
    @Override
    public String addPost(Feed $NEW_FEED) throws Exception {
        $FEED_REPO.save($NEW_FEED);
        return "NEW FEED ADDED";
    }

    @Override
    public List<FeedDetails> getAllPost() throws Exception {
        List<Feed> $ALL_FEEDS=$FEED_REPO.findAll();
        List<FeedDetails> feedDetailsList=new ArrayList<FeedDetails>();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        for(Feed feed:$ALL_FEEDS){
            UserDetails userDetails=restTemplate.exchange("http://localhost:8001/user/v1/get_user_details/"+feed.getUSER_ID(), HttpMethod.GET,entity,UserDetails.class).getBody();
            feedDetailsList.add(new FeedDetails(feed,userDetails));
        }
        return Collections.unmodifiableList(feedDetailsList);
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
