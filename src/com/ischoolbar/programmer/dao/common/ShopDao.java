package com.ischoolbar.programmer.dao.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.common.Account;
import com.ischoolbar.programmer.entity.common.Shop;
@Repository
public interface ShopDao {
	
	/**
	 * 申请商铺信息插入
	 * @param id
	 * @return
	 */
	public int add(Shop shop);
	
	/**
	 * 多条件搜索词查询客户
	 * @param queMap
	 * @return
	 */
	//public List<Account> findList(Map<String, Object> queryMap);
	
	/**
	 * 获取符合条件的总记录数
	 * @param queryMap
	 * @return
	 */
	//public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * 根据商铺名查找商铺信息
	 * @param name
	 * @return
	 */
	public Shop findByName(String name);
	
	public void insertShop(Shop shop);
}
