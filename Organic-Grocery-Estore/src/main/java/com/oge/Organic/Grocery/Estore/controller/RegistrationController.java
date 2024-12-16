package com.oge.Organic.Grocery.Estore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.oge.Organic.Grocery.Estore.model.Registration;
import com.oge.Organic.Grocery.Estore.service.RegistrationService;

@RestController
public class RegistrationController {
@Autowired
private RegistrationService rs;

@GetMapping("/registrations")
public List<Registration> handleget()
{
	return rs.getAll();
}

@PostMapping("/addreg")
public Registration add(@RequestBody Registration r)
{
	return rs.insertrecord(r);
}

@DeleteMapping("/delreg/{rid}")
public void delr(@PathVariable("rid")int r)
{
	rs.del(r);
}
@PutMapping("/upreg/{rid}")
public Registration update(@PathVariable("rid")int i,@RequestBody Registration r)
{
	return rs.updaterecord(i,r);
}
}