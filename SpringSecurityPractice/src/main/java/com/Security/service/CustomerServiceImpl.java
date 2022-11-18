package com.Security.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Security.exception.CustomerException;
import com.Security.model.Customer;
import com.Security.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private com.Security.repository.CustomerRepository customerRepository;
	
	
	@Override
	public Customer registerCustomer(com.Security.model.Customer customer) throws CustomerException {
		
//		List<Authority> authorities = customer.getAuthorities();
//		
//		for(Authority authority:authorities) {
//			authority.setCustomer(customer);
//		}
//		
		return customerRepository.save(customer);
	}

	@Override
	public Customer getCustomerDetailsByEmail(String email) throws CustomerException {
		
		return customerRepository.findByEmail(email).orElseThrow(() -> new CustomerException("Customer not found with email "+email));
	}

	@Override
	public List<Customer> getallCustomerDetails() throws CustomerException {
		
		List<Customer> customers = customerRepository.findAll();
		
		if(customers.isEmpty()) {
			throw new CustomerException("No customer found");
		}
		
		return customers;
	}


}
