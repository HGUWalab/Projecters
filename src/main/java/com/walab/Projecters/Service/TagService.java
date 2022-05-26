package com.walab.Projecters.Service;

import java.util.List;

import com.walab.Projecters.Bean.Tag;

public interface TagService {
	
	public int insertTag(Tag tag); 
	public Tag getTag(int id);
	public List<Tag> getTagList();

}
