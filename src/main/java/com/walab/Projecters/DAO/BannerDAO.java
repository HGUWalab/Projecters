package com.walab.Projecters.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BannerDAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public int updateRecruitingTeam() {
		int result = sqlSession.update("Banner.updateRecruitingTeam");
		return result;
	}
	
	public int getRecruitingTeam() {
		int num = sqlSession.selectOne("Banner.getRecruitingTeam");
		return num;
	}
	
	public int getFormCount() {
		int num = sqlSession.selectOne("Banner.getFormCount");
		return num;
	}
	
	
}
