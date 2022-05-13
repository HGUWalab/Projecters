package com.walab.Projecters.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walab.Projecters.Bean.User;
import com.walab.Projecters.DAO.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserDAO userDAO;
	
	@Override
	public void insertUser(User vo) {
		userDAO.insertUser(vo);
	}
	
	@Override
	public User getUser(User vo) {
		return userDAO.getUser(vo);
	}
}
