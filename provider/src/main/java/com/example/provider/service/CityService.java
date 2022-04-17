package com.example.provider.service;

import com.example.provider.bean.City;
import com.example.provider.dao.CityDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityService {
    @Resource
    private CityDao dao;

    public List<City> findAll(){
        return dao.findAll();
    }

    public List<City> findByName(String name){
        return dao.findByName(name);
    }
}
