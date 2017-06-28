package cn.itheima.test.entity;

import java.util.HashSet;
import java.util.Set;

public class User {
	 /* `uid` INT(11) NOT NULL AUTO_INCREMENT,
	  `username` VARCHAR(255) DEFAULT NULL,
	  `nickname` VARCHAR(255) DEFAULT NULL,
	  `password` VARCHAR(255) DEFAULT NULL,
	  `phoneCheckCode` VARCHAR(255) DEFAULT NULL,
	  `checkCode` VARCHAR(255) DEFAULT NULL,*/
	private Integer uid ;
	private String username;
	private String nickname;
	
	private String password;
	private String phoneCheckCode;
	private String checkCode;
	
	//表示用很多客户
	private Set<Customer> customer = new HashSet<Customer>();
	
	
	public Set<Customer> getCustomer() {
		return customer;
	}
	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneCheckCode() {
		return phoneCheckCode;
	}
	public void setPhoneCheckCode(String phoneCheckCode) {
		this.phoneCheckCode = phoneCheckCode;
	}
	public String getCheckCode() {
		return checkCode;
	}
	public void setCheckCode(String checkCode) {
		this.checkCode = checkCode;
	}
	
	
}
