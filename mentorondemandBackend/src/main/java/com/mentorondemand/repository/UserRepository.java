package com.mentorondemand.repository;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mentorondemand.model.User;

public interface UserRepository extends JpaRepository<User,Long>
{
	@Query(value="select * from user where user_role =:userRole AND status = false", nativeQuery=true)
	List<User> findAllByUserRole(String userRole);

	

}
