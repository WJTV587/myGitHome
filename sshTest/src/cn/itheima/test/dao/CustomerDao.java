package cn.itheima.test.dao;

import java.util.List;

import cn.itheima.test.entity.Customer;

public interface CustomerDao {

	List<Customer> findAllCustomer();

	void addOneCustomer(Customer customer);

	void updateOneCustomer(Customer customer);

	void deleteOneCustomer(Customer customer);

	List<Customer> findByCondition(Customer customer);

	List<Customer> findByCid(Customer customer);

}
