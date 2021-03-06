package com.poc.shoecart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	
	@Id
	@Column(name = "id")
	private long id;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToOne
	@JoinColumn(name = "product_id")
	private Product product;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(long id, User user, Product product) {
		super();
		this.id = id;
		this.user = user;
		this.product = product;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", user=" + user + ", product=" + product + "]";
	}
	
}
