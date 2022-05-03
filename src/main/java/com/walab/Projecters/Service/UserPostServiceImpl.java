package com.walab.Projecters.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walab.Projecters.DAO.UserPostDAO;

@Service
public class UserPostServiceImpl implements UserPostService {

	@Autowired
	UserPostDAO userPostDAO;
}
