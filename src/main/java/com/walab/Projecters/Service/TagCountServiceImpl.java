package com.walab.Projecters.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walab.Projecters.DAO.TagCountDAO;

@Service
public class TagCountServiceImpl implements TagCountService {

	@Autowired
	TagCountDAO tagCountDAO;
}
