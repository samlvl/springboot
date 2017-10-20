package org.spring.springboot.dubbo;

import org.spring.springboot.domain.Person;

/**
 * 城市业务 Dubbo 服务层
 *
 * Created by bysocket on 28/02/2017.
 */
public interface PersonDubboService2 {

    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
  public  Person findPersonById(String Id);
}
