package com.oge.Organic.Grocery.Estore.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.oge.Organic.Grocery.Estore.model.AdminLogin;
import com.oge.Organic.Grocery.Estore.model.Registration;

@Repository
@Qualifier("admRepo")
public interface AdminLoginRepository extends JpaRepository<AdminLogin,Integer>{
	@Query(value="select * from admin_login where email=:email and password=:password",nativeQuery=true)
	List<AdminLogin> findAllByEmailAndPassword(String email,String password);
}
