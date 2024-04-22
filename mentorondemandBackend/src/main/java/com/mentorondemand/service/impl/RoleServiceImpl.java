package com.mentorondemand.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mentorondemand.model.Role;
import com.mentorondemand.repository.RoleRepository;
import com.mentorondemand.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	
	private RoleRepository roleRepository;
	
	public RoleServiceImpl(RoleRepository roleRepository) {
		super();
		this.roleRepository = roleRepository;
	}

	@Override
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}

}
