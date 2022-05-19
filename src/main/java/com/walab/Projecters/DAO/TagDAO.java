package com.walab.Projecters.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.walab.Projecters.Bean.Tag;

@Repository
public class TagDAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public int insertTag(Tag tag) {
		int result = sqlSession.insert("Tag.insertTag", tag);
		return result;
	}
	public Tag getTag(int id) {
		Tag tag = sqlSession.selectOne("Tag.getTag", id);
		return tag;
	}
}
