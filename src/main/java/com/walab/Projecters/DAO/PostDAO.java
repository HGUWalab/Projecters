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
		return result;
	}
	public Post getPost(int id) {
		Post post = sqlSession.selectOne("Post.getPost", id);
		return post;
	}
	public List<Post> getAllPost() {
		List<Post> postList = sqlSession.selectList("Post.getAllPost");
		return postList;
	}
}
