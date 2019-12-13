package com.ischoolbar.programmer.entity.common;

import org.springframework.stereotype.Component;

/**
 * 订单子项实体
 * @author Administrator
 *
 */
@Component
public class OrderItem {
	
	private Long id;//商品分类id
	
	private Long orderId;//所属订单id
	
	private Long productId;//所属商品id
	
	private String name;//商品名称
	
	private String imageUrl;//商品主图
	
	private Double price;//商品价格
	
	private int productNum;//商品数量
	
	private Double money;//商品金额
	
	private String shopname;//所属商铺
	
	private String status;//订单子项状态

	public int getProductNum() {
		return productNum;
	}

	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMoney() {
		return money;
	}

	public void setMoney(Double money) {
		this.money = money;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	

	
	
	
	
}
