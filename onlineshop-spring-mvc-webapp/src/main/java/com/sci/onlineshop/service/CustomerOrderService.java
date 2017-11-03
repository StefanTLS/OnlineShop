package com.sci.onlineshop.service;

import com.sci.onlineshop.model.CustomerOrder;

public interface CustomerOrderService {

	void addCustomerOrder(CustomerOrder customerOrder);

	double getCustomerOrderGrandTotal(int cartId);
}
