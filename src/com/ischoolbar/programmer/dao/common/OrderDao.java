package com.ischoolbar.programmer.dao.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.ischoolbar.programmer.entity.common.Order;
import com.ischoolbar.programmer.entity.common.OrderItem;
import com.ischoolbar.programmer.entity.common.Product;

/**
 * 订单dao层
 * @author Administrator
 *
 */
@Repository
public interface OrderDao {
	/**
	 * 添加订单
	 * @param order
	 * @return
	 */
	public int add(Order order);
	
	/**
	 * 添加订单子项
	 * @param orderItem
	 * @return
	 */
	public int addItem(OrderItem orderItem);
	
	/**
	 * 编辑订单
	 * @param order
	 * @return
	 */
	public int edit(Order order);
	
	/**
	 * 删除订单
	 * @param id
	 * @return
	 */
	public int delete(Long id);
	
	/**
	 * 多条件搜索词查询订单-- without shopname
	 * @param queMap
	 * @return
	 */
	public List<Order> findList(Map<String, Object> queryMap);
	
	/**
	 * !!!!多条件搜索词查询订单-- with shopname
	 * @param queMap
	 * @return
	 */
	public List<Order> findListWithShopname(Map<String, Object> queryMap);
	
	/**
	 * 获取符合条件的总记录数
	 * @param queryMap
	 * @return
	 */
	public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * 根据id查询订单
	 * @param id
	 * @return
	 */
	public Order findById(Long id);
	
	/**
	 * 根据订单号查询所属的订单子项
	 * @param orderId
	 * @return
	 */
	public List<OrderItem> findOrderItemList(Long orderId);
	
	/**
	 * 获取统计信息
	 * @param queryMap
	 * @return
	 */
	public List<Map<String,String>> getStats(Map<String, Object> queryMap);
	
	/**
	 * !!!!!更新order_item的每个订单项所属商家shopname BY product.id=order_item.productId
	 * @param product
	 * @return
	 */
	public void updateShopname();
	
}
