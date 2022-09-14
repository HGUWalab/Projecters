package com.walab.Projecters.DAO;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.walab.Projecters.Bean.Form;
import com.walab.Projecters.Bean.MyPageForm;
import com.walab.Projecters.Bean.Post;

@Repository
public class FormDAO {
	@Autowired
	SqlSessionTemplate sqlSession;

	public int insertForm(Form form) {
		sqlSession.update("Form.updateFormCount", form.getPost_id());
		return sqlSession.insert("Form.insertForm", form);
	}
	
	public List<Form> getMyForms(int id){
		List<Form> formList = sqlSession.selectList("Form.getMyPosts", id);
		return formList;
	}
	
	public List<MyPageForm> getMyPageForms(int id){
		List<MyPageForm> formList = sqlSession.selectList("Form.getMyForms", id);
		return formList;
	}
}
