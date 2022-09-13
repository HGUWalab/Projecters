package com.walab.Projecters.Service;

import java.util.List;

import com.walab.Projecters.Bean.Post;

public interface PostService {
	public int insertPost(Post post);
	
	public int deletePost(int id);
	
	public int updatePost(Post post);
	
	public Post getPost(int id);
		
	public List<Post> getAllPost();
	
	public int getPostCount();

	public int getWriterId(int post_id);
	
	public List<Post> getMyPosts(int id);
}
