package cn.service.Impl;

import cn.dao.Impl.UserDaoImpl;
import cn.service.UserService;

public class UserServiceImpl implements UserService {
	UserDaoImpl ud=new UserDaoImpl();
	
	@Override
	public int login(String username,String userpwd) {	
		return ud.admin(username, userpwd);
	}
	
}
