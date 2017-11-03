package com.sci.onlineshop.service;

import com.sci.onlineshop.model.Cart;

public interface CartService {

	Cart getCartById(int cartId);

	void update(Cart cart);
}
