package com.ischoolbar.programmer.entity.common;

import org.springframework.stereotype.Component;

/**
 * ��������ʵ��
 * @author Administrator
 *
 */
@Component
public class OrderItem {
	
	private Long id;//��Ʒ����id
	
	private Long orderId;//��������id
	
	private Long productId;//������Ʒid
	
	private String name;//��Ʒ����
	
	private String imageUrl;//��Ʒ��ͼ
	
	private Double price;//��Ʒ�۸�
	
	private int productNum;//��Ʒ����
	
	private Double money;//��Ʒ���
	
	private String shopname;//��������
	
	private String status;//��������״̬

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
