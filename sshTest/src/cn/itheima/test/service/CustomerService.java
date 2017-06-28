package cn.itheima.test.service;

import java.util.List;

import cn.itheima.test.entity.Customer;

public interface CustomerService {

	List<Customer> findAllCustomer();

	void addOneCustomer(Customer customer);

	void updateOneCustomer(Customer customer);

	void deleteOneCustomer(Customer customer);

	List<Customer> findByCondition(Customer customer);

	List<Customer> findByCid(Customer customer);

}
