package com.walab.Projecters.DAO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.walab.Projecters.Bean.Form;

@Repository
public class FormDAO {
	@Autowired
	SqlSessionTemplate sqlSession;

	public int insertForm(Form form) {
		return sqlSession.insert("Form.insertForm", form);
	}
}
