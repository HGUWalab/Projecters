package com.walab.Projecters.Service;

import com.walab.Projecters.Bean.Tag;

public interface TagCountService {
	public int insertTagcount(String tagname);
	public int getTagcount(String tagname);
	public int updateTagcount(String tagname);
}