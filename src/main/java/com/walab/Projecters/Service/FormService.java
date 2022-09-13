package com.walab.Projecters.Service;

import java.util.List;

import com.walab.Projecters.Bean.Form;
import com.walab.Projecters.Bean.MyPageForm;

public interface FormService {

	int insertForm(Form form);
	
	List<Form> getMyForms(int id);
	
	List<MyPageForm> getMyPageForms(int id);

}
