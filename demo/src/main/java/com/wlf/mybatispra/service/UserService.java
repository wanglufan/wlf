package com.wlf.mybatispra.service;

import java.util.List;

import com.wlf.mybatispra.bean.User;

public interface UserService {
	//查询数据
	List<User> showUser(String username);
	//增加
	int insertUser(User user);
	//修改
	int updateUser(User user);
	//删除
	int deleteUser(int id);
}
