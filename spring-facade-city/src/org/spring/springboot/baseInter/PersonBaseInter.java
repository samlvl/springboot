package org.spring.springboot.baseInter;

import org.spring.springboot.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonBaseInter extends JpaRepository<Person, String>{

}
