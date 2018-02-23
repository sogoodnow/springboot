package com.qiu.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qiu.domain.Users;

@Repository
public interface UsersDao extends JpaRepository<Users, Long> {
	

}
