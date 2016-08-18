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
		CustomerDAO custDAO = new CustomerDAO();
		//custDAO.createCustomer(customer);
		custDAO.printCustomer();
		//custDAO.updateAddress("Hoffman Esates","IL", "60169", "1003");
		custDAO.deleteCustomer("1002");
		
 }
	
}
