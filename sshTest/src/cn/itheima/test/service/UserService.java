package cn.itheima.test.service;

import java.util.List;

import cn.itheima.test.entity.User;

public interface UserService {

	User login(User user);

	List<User> findAllUser();

}
