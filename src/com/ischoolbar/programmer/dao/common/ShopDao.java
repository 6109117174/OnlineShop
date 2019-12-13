package com.ischoolbar.programmer.dao.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.common.Account;
import com.ischoolbar.programmer.entity.common.Shop;
@Repository
public interface ShopDao {
	
	/**
	 * ����������Ϣ����
	 * @param id
	 * @return
	 */
	public int add(Shop shop);
	
	/**
	 * �����������ʲ�ѯ�ͻ�
	 * @param queMap
	 * @return
	 */
	//public List<Account> findList(Map<String, Object> queryMap);
	
	/**
	 * ��ȡ�����������ܼ�¼��
	 * @param queryMap
	 * @return
	 */
	//public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * ��������������������Ϣ
	 * @param name
	 * @return
	 */
	public Shop findByName(String name);
	
	public void insertShop(Shop shop);
}
