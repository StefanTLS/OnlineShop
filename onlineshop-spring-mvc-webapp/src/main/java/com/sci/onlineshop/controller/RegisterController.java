package com.sci.onlineshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sci.onlineshop.model.BillingAddress;
import com.sci.onlineshop.model.Customer;
import com.sci.onlineshop.model.ShippingAddress;
import com.sci.onlineshop.service.CustomerService;

@Controller
public class RegisterController {

	@Autowired
	private CustomerService customerService;

	@RequestMapping("/register")
	public String registerCustomer(Model model) {

		Customer customer = new Customer();
		BillingAddress billAdress = new BillingAddress();
		ShippingAddress shipAdress = new ShippingAddress();
		customer.setBillingAddress(billAdress);
		customer.setShippingAddress(shipAdress);

		model.addAttribute("customer", customer);

		return "register";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerCustomerPost(@ModelAttribute("customer") Customer customer, Model model) {

		customer.setEnabled(true);
		customerService.addCustomer(customer);

		return "registerSuccess";

	}

}
