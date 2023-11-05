package com.microservice.feed.repo;

import com.microservice.feed.models.Feed;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface FeedRepo extends JpaRepository<Feed,Long> {
    @Modifying
    @Transactional
    @Query(value = "UPDATE tbl_feed_details SET is_active=false WHERE id=?",nativeQuery = true)
    void inActive(long $ID);
}
