package com.walab.Projecters.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.walab.Projecters.Bean.Post;
import com.walab.Projecters.Bean.User;

@Repository
public class UserDAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public void insertUser(User vo) {
		sqlSession.insert("User.insertUser", vo);
	}
	
	public User getUser(User vo) {
		return sqlSession.selectOne("User.getUser", vo);
	}

	public List<Post> getApplies(int id) {
		return sqlSession.selectList("User.getApplies", id);
	}
}
