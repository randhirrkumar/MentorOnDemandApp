package com.mentorondemand.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Data;

@Data
@Entity
@Table(name = "user")
@SQLDelete(sql = "UPDATE user SET status = true WHERE user_id=?")
@Where(clause = "status=false")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private long user_id;
	
	@Column(name = "user_name")
	private String user_name;
	
	@Column(name = "user_email")
	private String user_email;
	
	@Column(name = "user_role")
	private String user_role;
	
	
	
	private boolean status = Boolean.FALSE;
	
	
	
	
//	public int getUser_id() {
//		return user_id;
//	}
//	public void setUser_id(int user_id) {
//		this.user_id = user_id;
//	}
//	public String getUser_name() {
//		return user_name;
//	}
//	public void setUser_name(String user_name) {
//		this.user_name = user_name;
//	}
//	public String getUser_email() {
//		return user_email;
//	}
//	public void setUser_email(String user_email) {
//		this.user_email = user_email;
//	}
//	public String getUser_role() {
//		return user_role;
//	}
//	public void setUser_role(String user_role) {
//		this.user_role = user_role;
//	}
//	
//	public User()
//	{
//		
//	}
//	public User(int user_id, String user_name, String user_email, String user_role) {
//		super();
//		this.user_id = user_id;
//		this.user_name = user_name;
//		this.user_email = user_email;
//		this.user_role = user_role;
//	}
	
	
}
