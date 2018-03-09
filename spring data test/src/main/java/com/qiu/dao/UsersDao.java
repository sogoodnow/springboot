package com.qiu.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.qiu.domain.Users;

@Repository
public interface UsersDao extends JpaRepository<Users, Long> {
	List<Users> findByLastIp(String name);
	List<Users> user_search(String loginName);
	@Query("select user from Users user")
	List<Users> getall();
}
