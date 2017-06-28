package cn.itheima.test.serviceImpl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.itheima.test.dao.UserDao;
import cn.itheima.test.entity.User;
import cn.itheima.test.service.UserService;
@Transactional
public class UserServiceImpl implements UserService {
	//×¢Èëdao
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public User login(User user) {
		User u =userDao.login(user);
		return u;
	}
	public List<User> findAllUser() {
		List<User>list = userDao.findAllUser();
		return list;
	}
	
}
