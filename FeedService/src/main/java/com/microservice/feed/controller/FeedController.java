package com.microservice.feed.controller;

import com.microservice.feed.models.Feed;
import com.microservice.feed.serviceImp.FeedServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feed/v1")
public class FeedController {
    @Autowired
    FeedServiceImp $FEED_SERVICE;
    @PostMapping("/add")
    public String addPost(@RequestBody Feed $NEW_FEED){
        try{
            $FEED_SERVICE.addPost($NEW_FEED);
            return "FEED POSTED";
        }catch(Exception x){
            return x.getMessage().toString();
        }
    }

    @GetMapping("/get_all")
    public List<Feed> viewPost(){
        try{
            List<Feed> $ALL_FEEDS=$FEED_SERVICE.getAllPost();
            return $ALL_FEEDS;
        }catch(Exception x){
            return null;
        }
    }

    @PostMapping("/update")
    public String updatePost(){
        return  null;
    }

    @DeleteMapping("/delete/{id}")
    public String deletePost(){
        return null;
    }
}
