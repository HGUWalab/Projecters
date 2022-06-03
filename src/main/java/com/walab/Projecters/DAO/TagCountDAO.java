package com.walab.Projecters.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.walab.Projecters.Bean.Tag;

@Repository
public class TagCountDAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public int insertTagcount(String tagname) {
		int result = sqlSession.insert("TagCount.insertTagcount", tagname);
		return result;
	}
	public int getTagcount(String tagname) {
			return sqlSession.selectOne("TagCount.getTagcount", tagname);
	}
	public int updateTagcount(String tagname) {
		int result = sqlSession.update("TagCount.updateTagcount", tagname);
		return result;
	}
	public int checkTag(String tagName) {
		int result = sqlSession.selectOne("TagCount.checkTag", tagName);
		return result;
	}
}
