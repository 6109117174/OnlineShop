package com.ischoolbar.programmer.service.common.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.dao.common.ShopDao;
import com.ischoolbar.programmer.entity.common.Shop;
import com.ischoolbar.programmer.service.common.ShopService;
@Service
public class ShopServiceImpl implements ShopService{

	@Autowired
	private ShopDao shopDao;

	@Override
	public int add(Shop shop) {
		// TODO Auto-generated method stub
		return shopDao.add(shop);
	}

	@Override
	public Shop findByName(String name) {
		// TODO Auto-generated method stub
		return shopDao.findByName(name);
	}
	@Override
	public void insertShop(Shop shop) {
		shopDao.insertShop(shop);
	}
}
