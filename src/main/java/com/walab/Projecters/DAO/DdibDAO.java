package com.walab.Projecters.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.walab.Projecters.Bean.Ddib;
import com.walab.Projecters.Bean.MyPageDdib;

@Repository
public class DdibDAO {
	@Autowired
	SqlSessionTemplate sqlSession;
	
	public List<MyPageDdib> getMyPageDdibs(int id){
		List<MyPageDdib> ddibLists = sqlSession.selectList("Ddib.getMyDdibs", id);
		return ddibLists;
	}
	
	public int insertDdib(Ddib ddib) {
		return sqlSession.insert("Ddib.insertDdib", ddib);
	}
}
