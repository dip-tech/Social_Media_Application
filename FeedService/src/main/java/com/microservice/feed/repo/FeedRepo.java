package com.microservice.feed.repo;

import com.microservice.feed.models.Feed;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedRepo extends JpaRepository<Feed,Long> {
}
