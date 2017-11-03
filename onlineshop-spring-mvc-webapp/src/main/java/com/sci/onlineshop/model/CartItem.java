package com.sci.onlineshop.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class CartItem implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2030913056082546071L;
	
	@Id
	@GeneratedValue
	private int cartItemId;
	
	@ManyToOne
	@JoinColumn(name = "cartId")
	@JsonIgnore
	private Cart cart;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product product;
	
	private int quantity;
	private double totalPrice;
	
	public CartItem() {		
	}
	/**
	 * @param product
	 * @param quantity
	 * @param totalPrice
	 */
	public CartItem(Product product, int quantity, double totalPrice) {
		
		this.product = product;
		this.quantity = quantity;
		this.totalPrice = totalPrice;
	}
	public CartItem(Product product) {
		this.product = product;
		this.quantity = 1;
		this.totalPrice = product.getProductPrice();
		
	}
	
	public int getCartItemId() {
		return cartItemId;
	}
	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

}
