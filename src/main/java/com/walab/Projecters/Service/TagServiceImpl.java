package com.walab.Projecters.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walab.Projecters.Bean.Tag;
import com.walab.Projecters.DAO.TagDAO;

@Service
public class TagServiceImpl implements TagService {

	@Autowired
	TagDAO tagDAO;
	
	@Override
	public int insertTag(Tag tag) {
		return tagDAO.insertTag(tag);
	}
	@Override
	public Tag getTag(int id) {
		return tagDAO.getTag(id);
	}	
	@Override 
	public List<Tag> getTagList() {
		return tagDAO.getTagList();
	}
	
}
