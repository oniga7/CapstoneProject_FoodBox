package com.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, String>{

	Admin findByusername(String username);

}