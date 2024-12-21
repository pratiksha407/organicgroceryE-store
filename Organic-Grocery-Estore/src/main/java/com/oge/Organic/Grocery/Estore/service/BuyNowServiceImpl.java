package com.oge.Organic.Grocery.Estore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.oge.Organic.Grocery.Estore.model.BuyNow;
import com.oge.Organic.Grocery.Estore.repository.BuyNowRepository;

@Service
public class BuyNowServiceImpl implements BuyNowService {
    @Autowired
    @Qualifier("buyRepo")
    private BuyNowRepository buyRepo;
    
	@Override 
	public BuyNow insertrecord(BuyNow r) {
		// TODO Auto-generated method stub
		return buyRepo.save(r);
	}

	@Override
	public List<BuyNow> getAll() {
		// TODO Auto-generated method stub
		return BuyNow.findAll();
		
	}

	@Override
	public void del(int ri) {
		// TODO Auto-generated method stub
		BuyNow.deleteById(ri);
	}

	
	
	
	@Override
	public BuyNow updaterecord(int i,BuyNow r) {
		Optional<BuyNow> opt=buyRepo.findById(i);
		if(opt.isPresent())
		{
			BuyNow rold=opt.get();
			rold.setname(r.getname());
			rold.setaddress(r.getaddress());
			rold.setPhoneno(r.getphoneno());
			
			
			return buyRepo.save(rold);
		}
		
		return null;
	}

	@Override
	public BuyNow updaterecord(BuyNow r) {
		// TODO Auto-generated method stub
		return null;
	}


}
