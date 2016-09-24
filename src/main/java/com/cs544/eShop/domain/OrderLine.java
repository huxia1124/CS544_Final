package com.cs544.eShop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class OrderLine {
	@Id @GeneratedValue
	private long id;
	
	@ManyToOne
	private Product product;
	
	private int quantity = 0;
	
	
	

}
