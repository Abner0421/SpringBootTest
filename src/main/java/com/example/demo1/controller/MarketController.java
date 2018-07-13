package com.example.demo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo1.bean.Market;
import com.example.demo1.service.MarketService;

@Controller
public class MarketController {
	
	@Autowired
	MarketService marketService;
	
	@RequestMapping("/getMarketList")
	public String getMarketList(Model model) 
	{
		List<Market> marketList = marketService.getAllList();
		model.addAttribute("marketList",marketList);
		return "list";
	}

}
