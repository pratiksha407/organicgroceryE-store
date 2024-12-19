package com.oge.Organic.Grocery.Estore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.oge.Organic.Grocery.Estore.model.Contact;
@Service
public interface ContactService 
{
	Contact insertrecord(Contact r);
	List<Contact> getAll();
	void del(int ri);
	Contact updaterecord(int i,Contact r);


}

