package com.arcade.walkingmemaid.repositories;

import com.arcade.walkingmemaid.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository 
        extends JpaRepository<Video, Integer> {
}
