package com.Navinda.Customer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Navinda.Customer.Model.Customer;
import com.Navinda.Customer.Service.CustomerService;

@RestController
@RequestMapping(value="/cus-cloud")
public class Controller {

	@Autowired
	CustomerService customrService;
	
	@RequestMapping(value="/customer", method=RequestMethod.POST)
	public Customer saveCustomer(@RequestBody Customer customer) {
		return customrService.save(customer);
	}
}
