package com.oge.Organic.Grocery.Estore.service;

import java.util.List;

import com.oge.Organic.Grocery.Estore.model.BuyNow;

public interface BuyNowService {
	BuyNow insertrecord(BuyNow r);
	List<BuyNow> getAll();
	void del(int ri);
	BuyNow updaterecord(int i, BuyNow r);
	BuyNow updaterecord(BuyNow r);

}



