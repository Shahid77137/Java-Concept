package com.Security.service;

import java.util.List;

import com.Security.exception.CustomerException;
import com.Security.model.Customer;

public interface CustomerService {

	public Customer registerCustomer(Customer customer)throws CustomerException;
	
	public Customer getCustomerDetailsByEmail(String email)throws CustomerException;
	
	public List<Customer> getallCustomerDetails()throws CustomerException;
	
}
