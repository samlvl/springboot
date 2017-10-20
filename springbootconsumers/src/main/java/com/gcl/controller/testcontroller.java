package com.gcl.controller;

import javax.annotation.Resource;

import org.spring.springboot.domain.City;
import org.spring.springboot.dubbo.CityDubboService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class testcontroller {

	@Resource
	public CityDubboService cityDubboServiceImpl;
	
	@RequestMapping(value="/getval",method=RequestMethod.GET)
	public City getval()
	{
		   String cityName="温岭";
		return cityDubboServiceImpl.findCityByName(cityName);
	}
}
