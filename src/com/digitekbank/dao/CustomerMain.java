package com.digitekbank.dao;

import com.digitekbank.domain.Customer;

public class CustomerMain {
	public static void main(String[] args) throws Exception {
		Customer customer = new Customer();
		customer.setName("Me Digitek");
		customer.setCity("Bloomingdale");
		customer.setCustId(1003);
		customer.setGender("F");
		customer.setState("IL");
		customer.setZip("60111");
		CustomerDAO cust = new CustomerDAO();
		cust.createCustomer(customer);
		cust.printCustomer();
	 
 }
}
