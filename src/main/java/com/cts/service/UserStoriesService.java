package com.cts.service;

import java.util.List;

import com.cts.model.UserStories;

public interface UserStoriesService {

	List<UserStories> getAllUserStories();

	public String modifyUserStories(UserStories userStories);

}
