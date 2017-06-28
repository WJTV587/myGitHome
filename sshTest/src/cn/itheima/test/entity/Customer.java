package cn.itheima.test.entity;

public class Customer {
	/*  `cid` INT(11) NOT NULL AUTO_INCREMENT,
	  `cust_name` VARCHAR(255) DEFAULT NULL,
	  `cust_type` VARCHAR(255) DEFAULT NULL,
	  `cust_phone` VARCHAR(255) DEFAULT NULL,
	  `cust_address` VARCHAR(255) DEFAULT NULL,*/
	private Integer cid;
	private String cust_name;
	private String cust_type;
	private String cust_phone;
	private String cust_address;
	
	private User user;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_type() {
		return cust_type;
	}
	public void setCust_type(String cust_type) {
		this.cust_type = cust_type;
	}
	public String getCust_phone() {
		return cust_phone;
	}
	public void setCust_phone(String cust_phone) {
		this.cust_phone = cust_phone;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	
	
}
