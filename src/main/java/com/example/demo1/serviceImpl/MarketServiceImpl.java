package com.example.demo1.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo1.bean.Market;
import com.example.demo1.dao.MarketMapper;
import com.example.demo1.service.MarketService;

@Service(value = "marketService")
public class MarketServiceImpl implements MarketService {
	@Autowired
	MarketMapper marketMapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return marketMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Market record) {
		return marketMapper.insert(record);
	}

	@Override
	public int insertSelective(Market record) {
		return marketMapper.insertSelective(record);
	}

	@Override
	public Market selectByPrimaryKey(Integer id) {
		return marketMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Market record) {
		return marketMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Market record) {
		return marketMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<Market> getAllList() {
		return marketMapper.getAllList();
	}

}
