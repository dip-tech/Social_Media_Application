package com.microservice.feed.controller;

import com.microservice.feed.models.Feed;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feed/v1")
public class FeedController {
    @PostMapping("/add")
    public String addPost(){
        return null;
    }

    @GetMapping("/get_all")
    public List<Feed> viewPost(){
        return null;
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
