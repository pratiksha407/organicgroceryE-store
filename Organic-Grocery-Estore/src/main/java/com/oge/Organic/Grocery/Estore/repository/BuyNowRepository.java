package com.oge.Organic.Grocery.Estore.repository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oge.Organic.Grocery.Estore.model.BuyNow;
@Repository
@Qualifier("buyRepo")
public interface BuyNowRepository extends JpaRepository<BuyNow,Integer> {

}

