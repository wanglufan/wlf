package com.wlf.mybatispra;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.wlf.mybatispra.bean.City;
import com.wlf.mybatispra.dao.CityDao;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	CityDao citydao;

	@Test
	public void contextLoads() {
		log.info("test start");
		long start = System.currentTimeMillis();

		test();

		long end = System.currentTimeMillis();
		log.info("test end,use " + (end - start) + " mills");
	}

	public void test() {
		City city = new City();
		city.setName("xian");
		citydao.updateCity(city);

		city = new City();
		city.setName("cc");
		citydao.insert(city);

		log.info("new city id=" + city.getId());
		log.info("" + citydao.delete(city));
		log.info("delete end");
		log.info("" + citydao.query());
	}

}
