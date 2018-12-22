package com.wlf.mybatispra.service.impl;

import com.wlf.mybatispra.bean.City;
import com.wlf.mybatispra.dao.CityDao;
import com.wlf.mybatispra.service.CityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service("cityService")
public class CityServiceImpl implements CityService {
    @Resource
    private CityDao cityDao;

    @Override
    public Integer insert(City city) {
        Integer row = cityDao.insert(city);
        if(row != 1){
            throw new RuntimeException("插入数据异常");
        }else{
            return row;
        }
    }

    @Override
    public Integer updateCity(City city) {
        Integer row = cityDao.updateCity(city);
        if(row != 1){
            throw new RuntimeException("更新数据异常");
        }else{
            return row;
        }
    }

    @Override
    public Integer delete(City city) {
        Integer row = cityDao.delete(city);
        if(row != 1){
            throw new RuntimeException("删除数据异常");
        }else{
            return row;
        }
    }

    @Override
    public List<City> query() {
        return cityDao.query();
    }
}
