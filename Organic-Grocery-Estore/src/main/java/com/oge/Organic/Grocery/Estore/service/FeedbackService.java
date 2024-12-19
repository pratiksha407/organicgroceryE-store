package com.oge.Organic.Grocery.Estore.service;

import java.util.List;

import com.oge.Organic.Grocery.Estore.model.Feedback;

public interface FeedbackService {
	Feedback insertrecord(Feedback r);
	List<Feedback> getAll();
	void del(int ri);
	Feedback updaterecord(int i,Feedback r);

}

