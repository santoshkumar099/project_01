package com.cts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.UserStories;

public interface UserStoriesRepository extends JpaRepository<UserStories, Integer> {

}
