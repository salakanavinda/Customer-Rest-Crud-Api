package com.Navinda.Customer.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.Navinda.Customer.Model.Customer;
import com.Navinda.Customer.Repository.CustomerRepository;

public class CutomerServiceImp implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public Customer save(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);//since this autowired to service
	}

	@Override
	public List<Customer> fetch() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer fetch(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
