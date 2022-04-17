package com.example.provider.controller;

import com.example.provider.bean.City;
import com.example.provider.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("country")
public class CityController {

    @Autowired
    private CityService service;

    @RequestMapping("/findAll")
    public List<City> findAll(){
        return service.findAll();
    }

    @RequestMapping("/findByName/{name}")
    public List<City> findByName(@PathVariable String name){
        return service.findByName(name);
    }
}
