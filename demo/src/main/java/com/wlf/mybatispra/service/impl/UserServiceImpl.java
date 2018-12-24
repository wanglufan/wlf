package com.wlf.mybatispra.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.wlf.mybatispra.bean.User;
import com.wlf.mybatispra.dao.UserDao;
import com.wlf.mybatispra.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;

	@Override
	public List<User> showUser(String username) {
		return userDao.showUser(username);
	}
	@Override
	public int insertUser(User user) {
		return userDao.insertUser(user);
	}
	@Override
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}
	
	@Override
	public int deleteUser(int id) {
		return userDao.deleteUser(id);
	}
}
