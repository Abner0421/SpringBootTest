package com.example.demo1.service;

import java.util.List;

import com.example.demo1.bean.Market;

public interface MarketService {

	public int deleteByPrimaryKey(Integer id);

	public int insert(Market record);

	public int insertSelective(Market record);

	public Market selectByPrimaryKey(Integer id);

	public int updateByPrimaryKeySelective(Market record);

	public int updateByPrimaryKey(Market record);
    
	public List<Market> getAllList();
}
