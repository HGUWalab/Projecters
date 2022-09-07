package com.walab.Projecters.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walab.Projecters.Bean.Form;
import com.walab.Projecters.Bean.MyPageForm;
import com.walab.Projecters.DAO.FormDAO;

@Service
public class FormServiceImpl implements FormService {

	@Autowired
	FormDAO dao;
	
	@Override
	public int insertForm(Form form) {
		return dao.insertForm(form);
	}
	
	@Override
	public List<Form> getMyForms(int id){
		return dao.getMyForms(id);
	}

	@Override
	public List<MyPageForm> getMyPageForms(int id) {
		// TODO Auto-generated method stub
		return dao.getMyPageForms(id);
	}
}
