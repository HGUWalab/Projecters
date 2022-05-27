package com.walab.Projecters.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walab.Projecters.Bean.Tag;
import com.walab.Projecters.DAO.TagCountDAO;

@Service
public class TagCountServiceImpl implements TagCountService {

	@Autowired
	TagCountDAO tagCountDAO;

	@Override
	public int insertTagcount(String tagname) {
		// TODO Auto-generated method stub
		return tagCountDAO.insertTagcount(tagname);
	}

	@Override
	public int getTagcount(String tagname) {
		// TODO Auto-generated method stub
		return tagCountDAO.getTagcount(tagname);
	}
	
	@Override
	public int updateTagcount(String tagname) {
		return tagCountDAO.updateTagcount(tagname);
	}
	@Override
	public int checkTag(String tagName) {
		return tagCountDAO.checkTag(tagName);
	}
	
}
