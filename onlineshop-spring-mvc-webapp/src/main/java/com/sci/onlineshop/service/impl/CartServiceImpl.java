package com.sci.onlineshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sci.onlineshop.dao.CartDao;
import com.sci.onlineshop.model.Cart;
import com.sci.onlineshop.service.CartService;

@Service
public class CartServiceImpl implements CartService {

	@Autowired
	private CartDao cartDao;

	public Cart getCartById(int cartId) {
		return cartDao.getCartById(cartId);
	}

	public void update(Cart cart) {
		cartDao.update(cart);
	}
}
