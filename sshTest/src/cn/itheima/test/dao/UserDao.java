package cn.itheima.test.dao;

import java.util.List;

import cn.itheima.test.entity.User;

public interface UserDao {

	User login(User user);

	List<User> findAllUser();

}
