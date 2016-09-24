/**
 * 
 */
package com.cs544.eShop.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Dummy class
 *
 */
@Entity
public class Customer {
	@Id @GeneratedValue
	private long id;
}
