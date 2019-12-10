package com.ischoolbar.programmer.dao.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.common.Order;
import com.ischoolbar.programmer.entity.common.OrderItem;
import com.ischoolbar.programmer.entity.common.Product;

/**
 * ����dao��
 * @author Administrator
 *
 */
@Repository
public interface OrderDao {
	/**
	 * ��Ӷ���
	 * @param order
	 * @return
	 */
	public int add(Order order);
	
	/**
	 * ��Ӷ�������
	 * @param orderItem
	 * @return
	 */
	public int addItem(OrderItem orderItem);
	
	/**
	 * �༭����
	 * @param order
	 * @return
	 */
	public int edit(Order order);
	
	/**
	 * ɾ������
	 * @param id
	 * @return
	 */
	public int delete(Long id);
	
	/**
	 * �����������ʲ�ѯ����-- without shopname
	 * @param queMap
	 * @return
	 */
	public List<Order> findList(Map<String, Object> queryMap);
	
	/**
	 * !!!!�����������ʲ�ѯ����-- with shopname
	 * @param queMap
	 * @return
	 */
	public List<Order> findListWithShopname(Map<String, Object> queryMap);
	
	/**
	 * ��ȡ�����������ܼ�¼��
	 * @param queryMap
	 * @return
	 */
	public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * ����id��ѯ����
	 * @param id
	 * @return
	 */
	public Order findById(Long id);
	
	/**
	 * ���ݶ����Ų�ѯ�����Ķ�������
	 * @param orderId
	 * @return
	 */
	public List<OrderItem> findOrderItemList(Long orderId);
	
	/**
	 * ��ȡͳ����Ϣ
	 * @param queryMap
	 * @return
	 */
	public List<Map<String,String>> getStats(Map<String, Object> queryMap);
	
	/**
	 * !!!!!����order_item��ÿ�������������̼�shopname BY product.id=order_item.productId
	 * @param product
	 * @return
	 */
	public void updateShopname();
	
}
