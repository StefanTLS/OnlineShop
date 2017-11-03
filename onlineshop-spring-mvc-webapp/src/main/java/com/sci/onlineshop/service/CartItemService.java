package com.sci.onlineshop.service;

import com.sci.onlineshop.model.Cart;
import com.sci.onlineshop.model.CartItem;

public interface CartItemService {

	void addCartItem(CartItem cartItem);

	void removeCartItem(CartItem cartItem);

	void removeAllCartItems(Cart cart);

	CartItem getCartItemByProductId(int productId);
}
