package com.wlf.mybatispra;

import com.wlf.mybatispra.dao.CityDao;
import com.wlf.mybatispra.dao.UserDao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wlf.mybatispra.bean.City;
import com.wlf.mybatispra.bean.User;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import javax.annotation.Resource;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Resource
	CityDao citydao;
	@Autowired
	UserDao userDao;

	@Test
	public void contextLoads() {
		log.info("test start");
		long start = System.currentTimeMillis();

		test();

		long end = System.currentTimeMillis();
		log.info("test end,use " + (end - start) + " mills");
	}

	public void test() {
		/*List<User> list = userDao.showUser("");
		list.forEach(System.out::println);*/
	/*	//增加
		User user = new User();
		user.setUsername("username");
		user.setUserpass("username");
		int i = userDao.insertUser(user);*/
		//修改
		/*User user = new  User();
		user.setUsername("username");
		user.setUserpass("userpass");
		int i = userDao.updateUser(user);*/
		
		//删除
		User user = new  User();
		user.setId(3);
		int i = userDao.deleteUser(3);
	}

}
