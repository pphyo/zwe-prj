package com.jdc.app.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.jdc.app.entity.User;

public class UserRepo {
	
	private static UserRepo INSTANCE;
	private List<User> repo;
	
	private UserRepo() {
		repo = new ArrayList<>();
	}
	
	public static UserRepo getInstance() {
		if(null == INSTANCE)
			INSTANCE = new UserRepo();
		
		return INSTANCE;
	}
	
	public void add(User user) {
		if(!Objects.isNull(user))
			repo.add(user);
	}
	
	public List<User> getRepo() {
		return new ArrayList<>(repo);
	}
	
	public boolean checkUser(User user) {
		for(User ur : repo) {
			if(ur.equals(user))
				return true;
		}
		return false;
	}

}
