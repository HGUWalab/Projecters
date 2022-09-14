package com.walab.Projecters.Service;

import java.util.List;

import com.walab.Projecters.Bean.Ddib;
import com.walab.Projecters.Bean.MyPageDdib;

public interface DdibService {
	
	List<MyPageDdib> getMyDdibs(int id);
	int insertDdib(Ddib ddib);

}
