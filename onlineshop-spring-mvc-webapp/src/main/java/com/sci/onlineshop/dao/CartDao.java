package com.sci.onlineshop.dao;

import java.io.IOException;

import com.sci.onlineshop.model.Cart;

public interface CartDao {

   Cart create(Cart cart);
   
   Cart read(String cartId);
   
   void update(String cartId, Cart cart);
   
   void delete(String cartId);
}

