package com.gcl.springboot.dubbo.impl;
import org.spring.springboot.domain.Person;
import org.spring.springboot.dubbo.PersonDubboService2;
import org.springframework.stereotype.Service;
/**
 * 城市业务 Dubbo 服务层实现层
 *
 * Created by bysocket on 28/02/2017.
 */
@Service
public class PersonDubboServiceImpl implements PersonDubboService2 {


	@Override
	public Person findPersonById(String Id) {
		  return new Person("1", "sam", "男");
	}
}
