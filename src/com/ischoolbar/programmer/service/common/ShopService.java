package com.ischoolbar.programmer.service.common;

import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.common.Shop;

@Service
public interface ShopService {
	
	public int add(Shop shop);
	
	public Shop findByName(String name);
	
	public void insertShop(Shop shop);
}
