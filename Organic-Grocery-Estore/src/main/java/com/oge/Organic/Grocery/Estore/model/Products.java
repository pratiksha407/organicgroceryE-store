package com.oge.Organic.Grocery.Estore.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.ManyToAny;
@Entity
public class Products {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private long id;
private String productsname,quantity,mrp;

@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
@JoinTable(name="products_images",joinColumns= {
		@JoinColumn(name="products_id")
},
inverseJoinColumns= {
		@JoinColumn(name="image_id")
}
)
private Set<ImageModel> productsImages;



public Set<ImageModel> getProductsImages() {
	return productsImages;
}
public void setProductsImages(Set<ImageModel> productsImages) {
	this.productsImages = productsImages;
}
public Products() {
	super();
	// TODO Auto-generated constructor stub
}
public Products(String productsname, String quantity, String mrp) {
	super();
	this.productsname = productsname;
	this.quantity = quantity;
	this.mrp = mrp;
	
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getProductsname() {
	return productsname;
}
public void setProductsname(String productsname) {
	this.productsname = productsname;
}
public String getQuantity() {
	return quantity;
}
public void setDuration(String quantity) {
	this.quantity = quantity;
}
public String getMrp() {
	return mrp;
}
public void setMrp(String mrp) {
	this.mrp = mrp;
}



}
