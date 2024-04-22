package com.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "role_master")
public class Role {
	
	@Id
	@Column(name = "role_id")
	private String role_id;
	
	@Column(name = "role_name")
	private String role_name;

}
