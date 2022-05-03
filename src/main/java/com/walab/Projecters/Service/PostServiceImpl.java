package com.walab.Projecters.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walab.Projecters.DAO.PostDAO;

@Service
public class PostServiceImpl implements PostService {

	@Autowired
	PostDAO postDAO;
}
