package com.wlf.mybatispra.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wlf.mybatispra.bean.City;

public interface CityDao {

	@Insert("INSERT INTO city(`name`,`description`) VALUES (#{name},#{description})")
	int insert(City city);

	@Update("UPDATE city SET description=#{description} where name=#{name}")
	int updateCity(City city);
	
	@Delete("DELETE FROM city WHERE id=#{id}")
	int delete(City city);
	
	@Select("SELECT * FROM city")
	List<City> query();
}
