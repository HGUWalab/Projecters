package com.walab.Projecters.Service;

import java.util.List;

import com.walab.Projecters.Bean.Tag;

public interface TagCountService {
	public int insertTagcount(String tagname);
	public int getTagcount(String tagname);
	public int updateTagcount(String tagname);
	public int checkTag(String tagName);
	public List<String> getTopTen();
}