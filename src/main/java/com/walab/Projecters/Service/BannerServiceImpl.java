package com.walab.Projecters.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.walab.Projecters.DAO.BannerDAO;

@Service
public class BannerServiceImpl implements BannerService {

	@Autowired
	BannerDAO bannerDAO;
}
