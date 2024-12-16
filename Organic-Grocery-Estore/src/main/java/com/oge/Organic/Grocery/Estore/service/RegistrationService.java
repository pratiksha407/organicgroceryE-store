package com.oge.Organic.Grocery.Estore.service;

import java.util.List;

import com.oge.Organic.Grocery.Estore.model.Registration;

public interface RegistrationService {
	
Registration insertrecord(Registration r);
List<Registration> getAll();
void del(int ri);
Registration updaterecord(int i,Registration r);

}




