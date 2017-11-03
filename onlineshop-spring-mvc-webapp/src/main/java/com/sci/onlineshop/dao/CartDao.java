package com.sci.onlineshop.dao;

import java.io.IOException;

import com.sci.onlineshop.model.Cart;

public interface CartDao {

	Cart getCartById(int cartId);
	
	 Cart validate(int cartId) throws IOException;

	void update(Cart cart);
}
