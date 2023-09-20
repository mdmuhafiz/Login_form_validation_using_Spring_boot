package com.loginform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.loginform.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Long> {

	Login findByEmail(String email);

}
