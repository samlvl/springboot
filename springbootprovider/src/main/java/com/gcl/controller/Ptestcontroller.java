package com.gcl.controller;

import javax.annotation.Resource;
import org.spring.springboot.domain.Person;
import org.spring.springboot.dubbo.PersonDubboService2;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Ptestcontroller {

	@Resource
	public PersonDubboService2 personDubboServiceImpl;
	
	@RequestMapping(value="/getval",method=RequestMethod.GET)
	public Person getPersonVal()
	{
		  
		return personDubboServiceImpl.findPersonById("1");
	}
}
