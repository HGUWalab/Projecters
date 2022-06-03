package com.walab.Projecters.Service;

import java.util.List;

import com.walab.Projecters.Bean.Post;
import com.walab.Projecters.Bean.User;

public interface UserService {
	public void insertUser(User vo);
	public User getUser(User vo);
	public List<Post> getApplies(int id);
}
