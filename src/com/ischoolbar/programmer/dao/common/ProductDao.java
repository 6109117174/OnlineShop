package com.ischoolbar.programmer.dao.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.common.Product;

/**
 * ��Ʒdao��
 * @author Administrator
 */
@Repository
public interface ProductDao {
	/**
	 * �����Ʒ
	 * productCategory
	 * @param
	 * @return
	 */
	public int add(Product product);
	
	/**
	 * �༭��Ʒ
     * productCategory
	 * @param
	 * @return
	 */
	public int edit(Product product);
	
	/**
	 * ɾ����Ʒ
	 * @param id
	 * @return
	 */
	public int delete(Long id);
	
	/**
	 * �����������ʲ�ѯ��Ʒ
     * queMap
	 * @param
	 * @return
	 */
	public List<Product> findList(Map<String, Object> queryMap);
	
	/**
	 * ����username��ѯ��Ʒ
     * queMap
	 * @param
	 * @return
	 */ 
	public List<Product> findListByShopname(Map<String, Object> queryMap);
	
	/**
	 * ��ȡ�����������ܼ�¼��
	 * @param queryMap
	 * @return
	 */
	public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * ����id��ѯ��Ʒ
	 * @param id
	 * @return
	 */
	public Product findById(Long id);
	
	/**
	 * ����ͳ����Ϣ
	 * @param product
	 * @return
	 */
	public int updateNum(Product product);
	
}
