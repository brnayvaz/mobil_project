package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserTable;

@Repository
public interface IUserTableRepository extends JpaRepository<UserTable, Long> {

	
	List<UserTable> findByUserName(String userName);
	
	UserTable findById(Integer id);
	
	List<UserTable> findByContactMail(String contactMail);
		
}
