package com.walab.Projecters.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.walab.Projecters.Bean.Post;

@Repository
public class PostDAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public int insertPost(Post post) {
		int result = sqlSession.insert("Post.insertPost", post);
		int postID = sqlSession.selectOne("Post.getPostId");
		return postID;
	}
	public Post getPost(int id) {
		Post post = sqlSession.selectOne("Post.getPost", id);
		return post;
	}
	public List<Post> getAllPost() {
		List<Post> postList = sqlSession.selectList("Post.getAllPost");
		return postList;
	}
	public int getPostCount() {
		int count = sqlSession.selectOne("Post.getPostCount");
		return count;
	}
	public int getWriterId(int post_id) {
		return sqlSession.selectOne("Post.getWriterId", post_id);
	}
	public List<Post> getMyPosts(int id){
		List<Post> postList = sqlSession.selectList("Post.getMyPosts", id);
		return postList;
	}
	public List<Post> searchPosts(String searchText){
		searchText = '%'+searchText+'%';
		List<Post> postList = sqlSession.selectList("Post.searchPosts", searchText);
		System.out.println("searchPosts = " + postList);
		return postList;
	}
}
