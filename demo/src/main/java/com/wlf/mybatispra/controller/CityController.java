package com.wlf.mybatispra.controller;

import com.wlf.mybatispra.bean.City;
import com.wlf.mybatispra.service.CityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/city")
public class CityController {
    @Resource
    private CityService cityService;

    @RequestMapping("/show")
    public City show(){
        City city = new City();
        city.setName("北京");
        return city;
    }

    @RequestMapping("/insert")
    public void insert(@RequestParam("name") String name, @RequestParam("description") String description){
        City city = new City();
        city.setName(name);
        city.setDescription(description);
        cityService.insert(city);
    }
}
