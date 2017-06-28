package cn.itheima.test.serviceImpl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itheima.test.dao.CustomerDao;
import cn.itheima.test.entity.Customer;
import cn.itheima.test.service.CustomerService;
@Transactional
public class CustomerServiceImpl implements CustomerService{
	// ‰»Îdao
	private CustomerDao customerDao;
	public void setCustomerDao(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}
	public List<Customer> findAllCustomer() {
		List<Customer> list =customerDao.findAllCustomer();
				return list;
	}
	public void addOneCustomer(Customer customer) {
		customerDao.addOneCustomer(customer);
		
	}
	public void updateOneCustomer(Customer customer) {
		customerDao.updateOneCustomer(customer);
		
	}
	public void deleteOneCustomer(Customer customer) {
		customerDao.deleteOneCustomer(customer);
		
	}
	public List<Customer> findByCondition(Customer customer) {
		List<Customer> listCondition = customerDao.findByCondition(customer);
		return listCondition;
	}
	public List<Customer> findByCid(Customer customer) {
		List<Customer> list=customerDao.findByCid(customer);
		return list;
	}
	
}
