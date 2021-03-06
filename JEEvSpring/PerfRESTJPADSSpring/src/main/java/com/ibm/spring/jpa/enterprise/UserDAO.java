package com.ibm.spring.jpa.enterprise;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.spring.jpa.model.User;

@Repository
@Transactional(readOnly = false,isolation = Isolation.READ_COMMITTED,timeout = 5000,propagation=Propagation.REQUIRED)
public interface UserDAO extends JpaRepository<User, Long> {	
	public List<User> findUser(@Param("name") String name);
}
