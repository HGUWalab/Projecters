package com.walab.Projecters.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walab.Projecters.DAO.DdibDAO;

@Service
public class DdibServiceImpl implements DdibService {

	@Autowired
	DdibDAO ddibDAO;
}
