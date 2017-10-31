package com.gcl.springboot.dubbo.impl;
import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.spring.springboot.baseInter.PersonBaseInter;
import org.spring.springboot.domain.Person;
import org.spring.springboot.dubbo.PersonDubboService2;
import org.springframework.stereotype.Service;
/**
 * 城市业务 Dubbo 服务层实现层
 *
 * Created by bysocket on 28/02/2017.
 */
@Transactional
@Service
public class PersonDubboServiceImpl implements PersonDubboService2 {

	@Resource
	public PersonBaseInter personBaseInter;

	@Override
	public Person findPersonById(String Id) {
		  return new Person("1", "sam", "男");
	}

	@Override
	public Person savePserson(Person person) {
		Person p= personBaseInter.save(person);
		int i=1/0;
	  return p;
		
	}
}
