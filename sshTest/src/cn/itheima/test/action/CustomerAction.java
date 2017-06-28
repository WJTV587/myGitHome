package cn.itheima.test.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itheima.test.entity.Customer;
import cn.itheima.test.entity.User;
import cn.itheima.test.service.CustomerService;
import cn.itheima.test.service.UserService;

public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{
	private Customer customer = new Customer();
	public Customer getModel() {
		return customer;
	}
	//×¢ÈëService
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String toList(){
		List<Customer> customerlist=customerService.findAllCustomer();
		ServletActionContext.getRequest().setAttribute("list", customerlist);
		return "toList";
	}
	public String toAddCustomerListPage(){
		List<User>userlist=userService.findAllUser();
		ServletActionContext.getRequest().setAttribute("userList", userlist);
		return "toAddCustomerListPage";
	}
	public String addOneCustomer(){
		customerService.addOneCustomer(customer);
		return "addOneCustomer";
	}
	public String toEditCustomerPage(){
		List<Customer> customerlist = customerService.findByCid(customer);
	Customer custome =customerlist.get(0);
		List<User>userlist=userService.findAllUser();
		ServletActionContext.getRequest().setAttribute("userList", userlist);
		ServletActionContext.getRequest().setAttribute("customer", custome);
		return "toEditCustomerPage";
	}
	public String updateOneCustomer(){
		customerService.updateOneCustomer(customer);
		return "updateOneCustomer";
	}
	public String deleteOneCustomer(){
		customerService.deleteOneCustomer(customer);
		return "deleteOneCustomer";
	}
	public String findByCondition(){
		List<Customer> listCondition = customerService.findByCondition(customer);
		ServletActionContext.getRequest().setAttribute("list", listCondition);
		return "findByCondition";
	}
	
}
