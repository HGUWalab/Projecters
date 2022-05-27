package com.walab.Projecters.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walab.Projecters.Bean.Form;
import com.walab.Projecters.DAO.FormDAO;

@Service
public class FormServiceImpl implements FormService {

	@Autowired
	FormDAO dao;
	
	@Override
	public int insertForm(Form form) {
		return dao.insertForm(form);
	}
}
