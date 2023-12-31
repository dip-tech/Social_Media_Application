package com.microservice.feed.controller;

import com.microservice.feed.data_access_object.FeedDetails;
import com.microservice.feed.models.Feed;
import com.microservice.feed.serviceImp.FeedServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
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
    public List<FeedDetails> viewPost(){
        try{
            List<FeedDetails> $ALL_FEEDS=$FEED_SERVICE.getAllPost();
            return $ALL_FEEDS;
        }catch(Exception x){
            x.printStackTrace();
            return null;
        }
    }

    @PutMapping("/update")
    public String updatePost(@RequestBody Feed $UPDATED_FEED){
        try{
            $FEED_SERVICE.updatePost($UPDATED_FEED);
            return "POST UPDATED";
        }catch(Exception x) {
            return x.getMessage();
        }
    }

    @DeleteMapping("/delete/{id}")
    public String deletePost(@PathVariable("id") Long $ID){
        try{
            return $FEED_SERVICE.deletePost($ID);
        }catch(Exception x){
            return x.getMessage();
        }
    }
}
