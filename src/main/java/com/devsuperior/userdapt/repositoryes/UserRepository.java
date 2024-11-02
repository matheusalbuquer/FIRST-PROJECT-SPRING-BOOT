package com.devsuperior.userdapt.repositoryes;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.userdapt.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
