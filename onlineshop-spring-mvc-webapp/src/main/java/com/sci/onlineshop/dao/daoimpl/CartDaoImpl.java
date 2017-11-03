package com.sci.onlineshop.dao.daoimpl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sci.onlineshop.dao.CartDao;
import com.sci.onlineshop.model.Cart;

@Repository
@Transactional
public class CartDaoImpl implements CartDao{
	
	private Map<String, Cart> listOfCarts;
	
	
	public CartDaoImpl() {
		listOfCarts = new HashMap<>();
	}

	@Override
	public Cart create(Cart cart) {
		if(listOfCarts.keySet().contains(cart.getCartId())) {
			throw new IllegalArgumentException(String.format("Oops, something went wrong. A cart with this ID(%) already exists.",
					cart.getCartId()));
		}
		
		listOfCarts.put(cart.getCartId(), cart);

        return cart;
	}
	
	@Override
	public Cart read(String cartId) {
        return listOfCarts.get(cartId);
    }

	@Override
    public void update(String cartId, Cart cart) {
        if (!listOfCarts.keySet().contains(cartId)) {
            throw new IllegalArgumentException(String.format("Oops, something went wrong. A cart with this ID(%) could not be found.", cart.getCartId()));
        }

        listOfCarts.put(cartId, cart);
    }

	@Override
    public void delete (String cartId) {
        if (!listOfCarts.keySet().contains(cartId)) {
            throw new IllegalArgumentException(String.format("Oops, something went wrong. A cart with this ID(%) acould not be found.", cartId));
        }

        listOfCarts.remove(cartId);
    }

   
 }
