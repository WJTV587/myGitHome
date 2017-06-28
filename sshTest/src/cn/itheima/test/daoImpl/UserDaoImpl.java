package cn.itheima.test.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.itheima.test.dao.UserDao;
import cn.itheima.test.entity.User;
	//¼ò»¯×¢ÈëÄ£°å
public class UserDaoImpl extends HibernateDaoSupport implements UserDao {

	public User login(User user) {
		String hql = "from User where username = ? and password = ?";
		List<User> list = (List<User>) this.getHibernateTemplate().find(hql, user.getUsername(),user.getPassword());
		for (User user1 : list) {
			return user1;
		}
		return null;
	}

	public List<User> findAllUser() {
		List<User> list = (List<User>) this.getHibernateTemplate().find("from User");
		
		return list;
	}

}
