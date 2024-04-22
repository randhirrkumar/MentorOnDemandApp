package com.mentorondemand.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mentorondemand.model.Role;

public interface RoleRepository extends JpaRepository<Role,String>{

}
