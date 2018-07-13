package com.example.demo1.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo1.bean.Market;

@Mapper
public interface MarketMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Market record);

    int insertSelective(Market record);

    Market selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Market record);

    int updateByPrimaryKey(Market record);
    
    List<Market> getAllList();
}