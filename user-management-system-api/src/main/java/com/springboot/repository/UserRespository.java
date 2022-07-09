package com.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.UserEntity;

@Repository
public interface UserRespository extends JpaRepository<UserEntity, Long>{

	
}
