package com.walab.Projecters.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walab.Projecters.Bean.Ddib;
import com.walab.Projecters.Bean.MyPageDdib;
import com.walab.Projecters.DAO.DdibDAO;

@Service
public class DdibServiceImpl implements DdibService {

	@Autowired
	DdibDAO dao;
	
	@Override
	public List<MyPageDdib> getMyDdibs(int id){
		return dao.getMyPageDdibs(id);
	}
	
	@Override
	public int insertDdib(Ddib ddib) {
		return dao.insertDdib(ddib);
	}
}
