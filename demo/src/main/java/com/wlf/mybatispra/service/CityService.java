package com.wlf.mybatispra.service;

import com.wlf.mybatispra.bean.City;

import java.util.List;

public interface CityService {

    Integer insert(City city);

    Integer updateCity(City city);

    Integer delete(City city);

    List<City> query();
}
