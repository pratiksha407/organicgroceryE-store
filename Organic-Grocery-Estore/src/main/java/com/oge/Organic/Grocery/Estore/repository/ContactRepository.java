package com.oge.Organic.Grocery.Estore.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oge.Organic.Grocery.Estore.model.Contact;

@Repository
@Qualifier("conRepo")
public interface ContactRepository extends JpaRepository<Contact,Integer>{

}

