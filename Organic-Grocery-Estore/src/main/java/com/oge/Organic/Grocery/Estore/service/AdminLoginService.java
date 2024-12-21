package com.oge.Organic.Grocery.Estore.service;

import java.util.List;

import com.oge.Organic.Grocery.Estore.model.AdminLogin;

public interface AdminLoginService {
List<AdminLogin> login(String email,String password);
}
