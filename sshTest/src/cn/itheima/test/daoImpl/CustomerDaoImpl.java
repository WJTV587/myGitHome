package cn.itheima.test.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.hql.internal.ast.tree.RestrictableStatement;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.itheima.test.dao.CustomerDao;
import cn.itheima.test.entity.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao{

	public List<Customer> findAllCustomer() {
		
		return (List<Customer>) this.getHibernateTemplate().find("from Customer");
	}

	public void addOneCustomer(Customer customer) {
		this.getHibernateTemplate().save(customer);
		
	}

	public void updateOneCustomer(Customer customer) {
		this.getHibernateTemplate().update(customer);
	}

	public void deleteOneCustomer(Customer customer) {
		this.getHibernateTemplate().delete(customer);
		
	}

	public List<Customer> findByCondition(Customer customer) {
		String hql = "from Customer where 1=1";
		List<Object> list =new ArrayList<Object>();
		if(customer.getCust_name()!=null&&!"".equals(customer.getCust_name())){
			hql+="and cust_name like ?";
			list.add("%"+customer.getCust_name()+"%");
		}
		if(customer.getCust_type()!=null&&!"".equals(customer.getCust_type())){
			hql+="and cust_type like ?";
			list.add("%"+customer.getCust_type()+"%");
		}
		/*DetachedCriteria criteria =DetachedCriteria.forClass(Customer.class);*/
		
		List<Customer> listcustomer = (List<Customer>) this.getHibernateTemplate().find(hql, list.toArray());
		return listcustomer;
	}

	public List<Customer> findByCid(Customer customer) {
		String hql = "from Customer where cid = ?";
		List<Customer> find = (List<Customer>) this.getHibernateTemplate().find(hql,customer.getCid());
		return find;
	}

}
