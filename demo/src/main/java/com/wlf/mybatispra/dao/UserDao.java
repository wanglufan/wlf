package com.wlf.mybatispra.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wlf.mybatispra.bean.User;

public interface UserDao {
	@Select("select * from user where username like '%${username}%'")
	List<User> showUser(@Param("username") String username);
	
	@Insert(" insert into user(username,userpass) value(#{username},#{userpass}) ")
	int insertUser(User user);
	
	@Update(" update user set userpass = #{userpass} where username = #{username} ")
	int updateUser(User user);

	@Delete(" delete from user where userid = #{id} ")
	int deleteUser(int id);
}
