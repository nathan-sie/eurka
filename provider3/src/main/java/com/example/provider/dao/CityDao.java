package com.example.provider.dao;

import com.example.provider.bean.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CityDao {
    @Select("select * from city")
    List<City> findAll();

    @Select("select * from city where name = #{name}")
    List<City> findByName(String name);
}
