package com.ischoolbar.programmer.entity.common;

import java.util.Date;

public class Shop {
	private String shopname;
	private String password;
	private String email;
	private Date applytime;
	private String roleId;
	private String address;
	private String ifable;
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getApplytime() {
		return applytime;
	}
	public void setApplytime(Date applytime) {
		this.applytime = applytime;
	}
	public String getRoleId() {
		return roleId;
	}
	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIfable() {
		return ifable;
	}
	public void setIfable(String ifable) {
		this.ifable = ifable;
	}
	
	
}
