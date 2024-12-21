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

import com.oge.Organic.Grocery.Estore.model.BuyNow;
import com.oge.Organic.Grocery.Estore.service.BuyNowService;
@RestController
public class BuyNowController {
	@Autowired
	private BuyNowService bs;
	@GetMapping("/BuyNow")
	public List<BuyNow> handleget()
	{
		return bs.getAll();
	}

	@PostMapping("/addbuy")
	public BuyNow add(@RequestBody BuyNow r)
	{
	 return bs.insertrecord(r);	
	}

	@DeleteMapping("/delbuy/{rid}")
	public void delr(@PathVariable("rid")int r)
	{
		bs.del(r);
	}

	@PutMapping("/upbuy/{rid}")
	public BuyNow update(@PathVariable("rid")int i,@RequestBody BuyNow r)
	{
		return bs.updaterecord(i,r);
	}
	
}