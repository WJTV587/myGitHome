package cn.itheima.test.action;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.itheima.test.entity.User;
import cn.itheima.test.service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User>{
	private User user = new User();
	public User getModel() {
		return user;
	}
	//注入service
	private UserService userService;
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String login(){
		System.out.println("登录.........");
	User u = userService.login(user);
	if(u==null){
		ServletActionContext.getRequest().setAttribute("msg", "用户名或者密码错误");
		return "loginfalse";
	}else{
		ServletActionContext.getRequest().getSession().setAttribute("user", u);
		return "loginture";
	}
		
	}
	
	
}
