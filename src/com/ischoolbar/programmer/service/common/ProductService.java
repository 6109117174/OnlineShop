package com.ischoolbar.programmer.service.common;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.ischoolbar.programmer.entity.common.Product;
/**
 * 商品接口
 *
 * @author Administrator
 */
@Service
public interface ProductService {
	
	/**
	 * 添加商品
	 * productCategory
	 * @param
	 * @return
	 */
	public int add(Product product);
	
	/**
	 * 编辑商品
	 * productCategory
	 * @param
	 * @return
	 */
	public int edit(Product product);
	
	/**
	 * 删除商品
	 * @param id
	 * @return
	 */
	public int delete(Long id);
	
	/**
	 * 多条件搜索词查询商品
	 * queMap
	 * @param
	 * @return
	 */
	public List<Product> findList(Map<String, Object> queryMap);
	
	/** 根据username查询商品
	 * queMap
	 * @param
	 * @return
	 */ 
	public List<Product> findListByShopname(Map<String, Object> queryMap);
	
	/**
	 * 获取符合条件的总记录数
	 * @param queryMap
	 * @return
	 */
	public Integer getTotal(Map<String, Object> queryMap);
	
	/**
	 * 根据id查询商品
	 * @param id
	 * @return
	 */
	public Product findById(Long id);
	
	/**
	 * 更新统计信息
	 * @param product
	 * @return
	 */
	public int updateNum(Product product);
}
